package com.example.mustafa.ispalindromse2;

import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText Eingabe;
    private Button button;
    private boolean test = false;
    private TextView Ausgabe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Eingabe = (EditText)findViewById(R.id.PruefePalindromString);
        Ausgabe = (TextView)findViewById(R.id.PalindromAusgabe);
        button = (Button)findViewById(R.id.PruefePalindrom);


        button.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                if (Eingabe.getText().toString().isEmpty() || Eingabe.getText().toString().equals(" ") || Eingabe.getText().toString().length()<5 ){
                    Eingabe.setError("Bitte beachten Sie das die Eingabe nicht kleiner wie 5 Zeichen haben darf, keine Leerzeichen oder Leer ist");
                }else{
                    Ausgabe.setText(Boolean.toString(isPalindrome(Eingabe.getText().toString())));
                }
            }
        });
    }

    public static boolean isPalindrome(String str)	{
        return str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());
    }



}
