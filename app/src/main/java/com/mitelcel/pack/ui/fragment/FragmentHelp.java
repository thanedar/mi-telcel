package com.mitelcel.pack.ui.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;

import com.mitelcel.pack.Config;
import com.mitelcel.pack.MiApp;
import com.mitelcel.pack.R;
import com.mitelcel.pack.dagger.component.FragmentComponent;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentHelp#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentHelp extends Fragment {

    @InjectView(R.id.label_help)
    TextView label;
    @InjectView(R.id.web_view)
    WebView webView;

    public static final String TAG = FragmentHelp.class.getSimpleName();

    /**
     * Use this factory method to create a new instance of this fragment.
     *
     * @return A new instance of fragment FragmentHelp.
     */
    public static FragmentHelp newInstance() {
        return new FragmentHelp();
    }

    public FragmentHelp() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FragmentComponent.Initializer.init(MiApp.getInstance().getAppComponent()).inject(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_webview, container, false);
        ButterKnife.inject(this, view);

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        label.setText(R.string.navdrawer_item_help);
        webView.loadUrl(Config.HTML_HELP);
    }
}
