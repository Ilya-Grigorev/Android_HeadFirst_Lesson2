package com.example.mymessenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class RecieveMessageActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE="message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);

        Intent resInt = getIntent();
        String getedStr = resInt.getStringExtra(RecieveMessageActivity.EXTRA_MESSAGE);

        TextView myView = (TextView) findViewById(R.id.message);
        myView.setText(getedStr);

    }
}
