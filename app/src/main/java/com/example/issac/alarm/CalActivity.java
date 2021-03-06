package com.example.issac.alarm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.nio.file.AtomicMoveNotSupportedException;

public class CalActivity extends AppCompatActivity {

    TextView numA_TextView, numB_TextView;
    EditText answer_EditText;
    Button submit_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal);

        numA_TextView = (TextView) findViewById(R.id.numA);
        numB_TextView = (TextView) findViewById(R.id.numB);
        answer_EditText = (EditText) findViewById(R.id.answer);
        submit_button = (Button) findViewById(R.id.submit_button);

        int numA = (int) Math.floor(Math.random()* 50) + 1;
        int numB = (int) Math.floor(Math.random()* 50) + 1;
        final int answer = numA + numB;

        numA_TextView.setText(String.valueOf(numA));
        numB_TextView.setText(String.valueOf(numB));

        submit_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int check = Integer.parseInt(answer_EditText.getText().toString());
                if (check == answer) {
                    Toast.makeText(CalActivity.this, "Right", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(CalActivity.this, "Wrong", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
