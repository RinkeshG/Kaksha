package com.example.rinkesh.kaksha;

import android.os.Build;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TableLayout;

import com.example.rinkesh.kaksha.Fragment.RegisterFragment;
import com.example.rinkesh.kaksha.Fragment.fragment_login;

/**
 * Created by Rinkesh on 05/11/17.
 */

public class LoginRegisterTabbed extends AppCompatActivity {


    private ViewPager viewpager;

    private TableLayout tablayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_register_tabbed);

        // Initializing Viewpager

        viewpager = (ViewPager) findViewById(R.id.viewpager);

        setViewPager(viewpager);

        // Initializing TabLayout

        tablayout = (TableLayout) findViewById(R.id.tablayout);

        tablayout.setupWithViewPager(viewpager);


        // Hiding Status Bar

        hideStatusBar();

    }

    private void setViewPager(ViewPager set) {

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        adapter.addFragment(new fragment_login(), "SIGN IN");

        adapter.addFragment(new RegisterFragment(), "SIGN UP");

        set.setAdapter(adapter);

    }


    private void hideStatusBar() {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {

            Window window = getWindow();

            window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);


        }

    }
}
