package it.moondroid.topactivity_example;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;


public class Activity3 extends TopActivity {

    public final static String EXTRA_ACTIVITY3 = "ACTIVITY3";

    public static Intent newIntent(Context context, int extra) {
        return new Intent(context, Activity3.class).putExtra(EXTRA_ACTIVITY3, extra);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
    }

}
