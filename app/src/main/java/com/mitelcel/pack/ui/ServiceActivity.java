package com.mitelcel.pack.ui;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.MenuItem;

import com.mitelcel.pack.MiApp;
import com.mitelcel.pack.R;
import com.mitelcel.pack.ui.fragment.FragmentRecent;
import com.mitelcel.pack.ui.fragment.FragmentService;
import com.mitelcel.pack.utils.FragmentHandler;

import butterknife.ButterKnife;

public class ServiceActivity extends BaseActivity {

    private static final String TAG = ServiceActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generic);

        if (savedInstanceState == null) {
            FragmentHandler.addFragmentInBackStack(getSupportFragmentManager(), null, FragmentService.TAG, FragmentService.newInstance(), R.id.container);
        }

        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null)
            actionBar.setDisplayHomeAsUpEnabled(true);

        ButterKnife.inject(this);

        ((MiApp)getApplication()).getAppComponent().inject(this);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == android.R.id.home) {
            super.onBackPressed();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
