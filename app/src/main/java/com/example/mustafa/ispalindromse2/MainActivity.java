package com.example.mustafa.ispalindromse2;

import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText Text;
    private Button button;
    private boolean test = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Text = (EditText)findViewById(R.id.PruefePalindromString);

        button = (Button)findViewById(R.id.PruefePalindrom);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                test = isPalindrome(Text.getText().toString());
            }
        });

        System.out.println(test);
    }

    public boolean isPalindrome(String str)	{

        if (str.isEmpty()){
            Text.setError("Fehlermeldung!!!");
        }
       return str.equals(new StringBuilder(str).reverse().toString());
    }



}
