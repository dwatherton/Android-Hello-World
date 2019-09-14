package com.ualr.helloworld;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView userMsgTV;
    private EditText userInputET;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userMsgTV = findViewById(R.id.userMsgTV);
        userInputET = findViewById(R.id.userInputET);
    }

    public void showTextMessage(View view) {
        // Only Update User Input Edit Text If The Field Is NOT Empty
        if (!userInputET.getText().toString().isEmpty()) {
            userMsgTV.setText(userInputET.getText().toString());
        }
    }

    public void clearInputText(View view) {
        // Allow User To Clear The Text In The Text Edit Field
        userInputET.setText("");
    }
}
