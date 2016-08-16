package ru.jirs.remindme.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.HashMap;
import java.util.Map;

import ru.jirs.remindme.fragment.AbstractTabsFragment;
import ru.jirs.remindme.fragment.BirthdayFragment;
import ru.jirs.remindme.fragment.HistoryFragment;
import ru.jirs.remindme.fragment.IdeasFragment;
import ru.jirs.remindme.fragment.TodoFragment;

/**
 * Created by irs on 16.08.16.
 */
public class TabsPagerFragmentAdapter extends FragmentPagerAdapter {

    private Context context;
    private Map<Integer, AbstractTabsFragment> tabs;

    public TabsPagerFragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        setContext(context);
        initTabs();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs.get(position).getTitle();
    }

    @Override
    public Fragment getItem(int position) {
        return tabs.get(position);
    }

    @Override
    public int getCount() {
        return tabs.size();
    }

    public void setContext(Context context) {
        this.context = context;
    }

    private void initTabs() {
        tabs = new HashMap<>();
        tabs.put(0,  HistoryFragment.getInstance(context));
        tabs.put(1, IdeasFragment.getInstance(context));
        tabs.put(2, TodoFragment.getInstance(context));
        tabs.put(3, BirthdayFragment.getInstance(context));
    }
}
