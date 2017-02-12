package com.example.mainpchan.csc201_ch1018_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.math.BigInteger;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn = (Button) findViewById(R.id.btn);
        result = (TextView) findViewById(R.id.result);
        btn.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        result.setText(bigprimes(5));


    }


    public static String bigprimes(int count) {

        BigInteger temp = BigInteger.valueOf(Long.MAX_VALUE);
        String ans = "";
        int i = 0;
        while (i < count) {
            temp = temp.nextProbablePrime();
            ans += temp.toString() + ", ";
            i++;

        }

        return ans;


    }

}
