package com.guywmoore.walrus;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class WalrusActivity extends Activity {

    public static final String TAG = WalrusActivity.class.getSimpleName();

    private FactManger mWalrusFactManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_walrus);

        //Declare our View variables and assign the Views from the layout file
        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        Button showFactButton = (Button) findViewById(R.id.showFactButton);

        mWalrusFactManager = new FactManger(getResources()
                .getStringArray(R.array.factArray));
        factLabel.setText(mWalrusFactManager.getFact());
        showFactButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                factLabel.setText(mWalrusFactManager.getFact());
            }
        });

        Log.d(TAG, "We are logging from the onCreate() method");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.walrus, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
