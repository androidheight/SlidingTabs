package program.androidheight.slidingtabsdemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import custom.slidingtabs.SlidingTabLayout.SlidingTabLayout;

public class MainActivity extends ActionBarActivity {

    SectionsPagerAdapter mSectionsPagerAdapter;
    //public static final String TAG = TestCenter.class.getSimpleName();
    ViewPager mViewPager;
    SlidingTabLayout mSlidingTabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mViewPager = (ViewPager) findViewById(R.id.test_pager);
        mViewPager.setAdapter(new SectionsPagerAdapter(getSupportFragmentManager()));
        mSlidingTabLayout = (SlidingTabLayout) findViewById(R.id.test_pager_title_strip);
        mSlidingTabLayout.setViewPager(mViewPager);
    }

    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }
        private final String[] TITLES = { "Fragment1","Fragment2","Fragment3","Fragment4","Fragment5"};

        @Override
        public Fragment getItem(int position) {

            Fragment fragment=null;
            if(position==0){
                fragment = new Fragment1();
            }
            else if(position==1){
                fragment=new Fragment2();
            }
                       else if(position==2){
                             fragment=new Fragment3();
                       }

            else if(position==3){
                fragment=new Fragment4();
            }

            else if(position==4){
                fragment=new Fragment5();
            }

            return fragment;

        }

        @Override
        public int getCount() {
            // Show  total pages.
            return TITLES.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return TITLES[position];
        }
    }



}
