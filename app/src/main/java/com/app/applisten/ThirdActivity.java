package com.app.applisten;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Created by kiran on 6/8/15.
 */
public class ThirdActivity extends BaseActivity {

    ImageButton forwardImageButton;
    TextView text;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView) findViewById(R.id.text);
        text.setText("Third Screen");

        forwardImageButton = (ImageButton) findViewById(R.id.forwardImageButton);
        forwardImageButton.setVisibility(View.GONE);

    }

    @Override
    protected void onStart() {
        super.onStart();

        // your code
    }

    @Override
    protected void onStop() {
        super.onStop();

        // your code
    }

}
