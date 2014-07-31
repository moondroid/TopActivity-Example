package it.moondroid.topactivity_example;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;


public class TopStackActivity
        extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent subIntent = getIntent().getParcelableExtra("intent");
        Log.d("TopStackActivity.onCreate", "subIntent = " + subIntent);
        startActivityForResult(subIntent, 0);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.d("TopStackActivity.onActivityResult", "ENTRY");
        finish();
    }
}
