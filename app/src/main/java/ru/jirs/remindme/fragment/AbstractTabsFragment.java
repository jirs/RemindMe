package ru.jirs.remindme.fragment;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.View;

/**
 * Created by irs on 16.08.16.
 */
public class AbstractTabsFragment extends Fragment {
    private Context context;
    private String title;
    protected View view;

    public void setContext(Context context) {
        this.context = context;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
