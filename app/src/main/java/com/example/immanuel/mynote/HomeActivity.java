package com.example.immanuel.mynote;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 * Created by IMMANUEL on 10/10/2017.
 */
public class HomeActivity  extends AppCompatActivity {

    //DECLARE ATTRIBUTE
    //private BottomBar bottomBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        //BOTTOM MENU NAV
        /*bottomBar = (BottomBar) findViewById(R.id.bottomBar);
        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabId) {
                if (tabId == R.id.tab_calls) {
                    Intent intent = new Intent(HomeActivity.this, MainActivity.class);
                    startActivity(intent);
                } else if (tabId == R.id.tab_groups) {
                    Intent intentList = new Intent(HomeActivity.this, ListActivity.class);
                    startActivity(intentList);
                } /*else if (tabId == R.id.tab_chats) {
                    Toast.makeText(this, R.string.about_toast, Toast.LENGTH_LONG).show();
                }*/
        //    }
        //});

        /*// initiate view's
        ImageButton simpleImageButtonHome = (ImageButton)findViewById(R.id.simpleImageButtonHome);
        ImageButton simpleImageButtonYouTube = (ImageButton)findViewById(R.id.simpleImageButtonYouTube);

        // perform click event on button's
        simpleImageButtonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getApplicationContext(),"Home Button",Toast.LENGTH_LONG).show();// display the toast on home button click
                Intent intent = new Intent(HomeActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        simpleImageButtonYouTube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getApplicationContext(),"List Button",Toast.LENGTH_LONG).show();// display the toast on you tube button click
                Intent intentList = new Intent(HomeActivity.this, ListActivity.class);
                startActivity(intentList);
            }
        });*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);// GET THE XML FILE FOR VIEW
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
        /* ALL RESPOND FROM BUTTON AT MENU BAR ARE HERE */
            case R.id.about:
                Toast.makeText(this, R.string.about_toast, Toast.LENGTH_LONG).show();
                return (true);
            case R.id.exit:
                finish();
                return (true);
        }
        return (super.onOptionsItemSelected(item));
    }

}
