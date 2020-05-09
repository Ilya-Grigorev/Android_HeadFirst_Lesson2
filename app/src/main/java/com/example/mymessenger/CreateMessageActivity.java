package com.example.mymessenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CreateMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }



    public void onSendMessage(View view) {

        EditText mV = (EditText) findViewById(R.id.message);
        String messageText = mV.getText().toString();

//        Intent intent = new Intent(this, RecieveMessageActivity.class);
//        intent.putExtra(RecieveMessageActivity.EXTRA_MESSAGE, messageText);
//        startActivity(intent);

        Intent mI = new Intent(Intent.ACTION_SEND);

        mI.setType("text/plain");
        mI.putExtra(Intent.EXTRA_TEXT, messageText);

        Intent chosenIntent = Intent.createChooser(mI, "Через какое приложение отправлять?");

        startActivity(chosenIntent);




    }
}

