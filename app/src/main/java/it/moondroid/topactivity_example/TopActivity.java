package it.moondroid.topactivity_example;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;


public class TopActivity extends ActionBarActivity {

    protected FrameLayout contentContainer;
    private View contentView;
    protected LayoutInflater layoutInflater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_top);

        contentContainer = (FrameLayout) findViewById(R.id.content_container);

        layoutInflater = LayoutInflater.from(this);
    }

    public View getContentView() {
        return contentView;
    }

    @Override
    public void setContentView(int layoutResID) {
        contentContainer.removeAllViews();
        contentView = layoutInflater.inflate(layoutResID, contentContainer);
    }

    @Override
    public void setContentView(View view, ViewGroup.LayoutParams params) {
        contentContainer.removeAllViews();
        contentContainer.addView(view, params);
        contentView = view;
    }

    @Override
    public void setContentView(View view) {
        contentContainer.removeAllViews();
        contentContainer.addView(view);
        contentView = view;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.top, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        switch (id){
            case R.id.action_activity1:
                if (this instanceof Activity1) {
                    return false;
                }

                startTopActivity(Activity1.newIntent(this, 0));
                return true;

            case R.id.action_activity2:
                if (this instanceof Activity2) {
                    return false;
                }

                startTopActivity(Activity2.newIntent(this, 0));
                return true;

            case R.id.action_activity3:
                if (this instanceof Activity3) {
                    return false;
                }

                startTopActivity(Activity3.newIntent(this, 0));
                return true;
        }


        return super.onOptionsItemSelected(item);
    }


    public void startTopActivity(Intent intent) {
        Log.d("TopActivity.startTopActivity", "intent = " + intent);
        startActivity(
                new Intent(this, TopStackActivity.class)
                        .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
                        .putExtra("intent", intent)
        );

    }
}
