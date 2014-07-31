package it.moondroid.topactivity_example;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;


public class Activity1 extends TopActivity {

    public final static String EXTRA_ACTIVITY1 = "ACTIVITY1";

    public static Intent newIntent(Context context, int extra) {
        return new Intent(context, Activity1.class).putExtra(EXTRA_ACTIVITY1, extra);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
    }

}
