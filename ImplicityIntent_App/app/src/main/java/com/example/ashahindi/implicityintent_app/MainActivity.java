package com.example.ashahindi.implicityintent_app;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText Mytext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       /* Button btn = (Button) findViewById(R.id.mybtn);
        btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                //Mytext= (EditText) findViewById(R.id.Mytextweb);
                //String str=Mytext.getText().toString();
                Toast.makeText(getApplicationContext(), "Welcome", Toast.LENGTH_SHORT).show(); //Toast
                //Intent myobj =new Intent(getApplicationContext(),MyActivity.class);//Explicity
                //myobj.setData(Uri.parse("https://www.suza.ac.tz"));
                //startActivity(myobj);

                //Intent myobj =new Intent(Intent.ACTION_VIEW);//Imlicity
              // myobj.setData(Uri.parse("https://www.suza.ac.tz"));
               // startActivity(myobj);
            }
        });*/
    }
    public void Visite1(View VieW){
        Mytext=(EditText)findViewById(R.id.Mytextweb);
    String str=Mytext.getText().toString();

        Intent visite =new Intent(Intent.ACTION_VIEW); //Imlicity
        visite.setData(Uri.parse(str));
        startActivity(visite);
    }
}
