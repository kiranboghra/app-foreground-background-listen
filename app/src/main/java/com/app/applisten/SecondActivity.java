package com.app.applisten;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Created by kiran on 6/8/15.
 */
public class SecondActivity extends BaseActivity {

    ImageButton forwardImageButton;
    TextView text;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView) findViewById(R.id.text);
        text.setText("Second Screen");

        forwardImageButton = (ImageButton) findViewById(R.id.forwardImageButton);

        forwardImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                startActivity(intent);

            }
        });
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
