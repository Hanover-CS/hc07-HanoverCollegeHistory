package com.enm.hch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Roam Campus selected
    public void roamCampusClicked(View view) {
        Intent intent = new Intent (this, RoamCampusMapsActivity.class);
        startActivity(intent);
    }

    //Browse List selected
    public void browseListClicked(View view) {
        Intent intent = new Intent (this, BrowseListActivity.class);
        startActivity(intent);
    }

    //About selected
    public void aboutClicked(View view) {
        Intent intent = new Intent (this, AboutActivity.class);
        startActivity(intent);
    }
}
