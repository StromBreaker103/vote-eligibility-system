package com.example.voteeligiblity;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


public class ResultScreen extends AppCompatActivity {
    TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result_page);
        res = findViewById(R.id.result);
        Intent intt = getIntent();
        String r_name = intt.getStringExtra("NAME");
        String r_aadhar = intt.getStringExtra("AADHAR");
        int age = intt.getIntExtra("AGE",0);
        if(age>=18)
            res.setText("Name: "+r_name+"\nAadhar Number: "+r_aadhar+"\n You are eligible to vote");
        else
            res.setText("Name: "+r_name+"\nAadhar Number: "+r_aadhar+"\n You are not eligible to vote");
    }
}