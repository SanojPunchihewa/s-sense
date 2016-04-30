package com.imad.test;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.ActionBarActivity;

/**
 * Created by Ishan Madhusanka on 30/04/2016.
 */
public class Settings extends ActionBarActivity {
    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.layout_settings);
    }
}
