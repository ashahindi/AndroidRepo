package com.example.ashahindi.testapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private EditText Name;
    private EditText Password;
    private TextView info;
    private Button login;
    private int counter=7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name= (EditText)findViewById(R.id.eName);
        Password=(EditText)findViewById(R.id.pass);
        info= (TextView)findViewById(R.id.tvinfor);
        login=(Button)findViewById(R.id.etbtn);
        info.setText("No of attempt remaining 2");
    login.setOnClickListener(new View.OnClickListener(){
                                 @Override
                                 public void onClick(View v) {

                                 }

        public void OnClick(View View){
          validate(Name.getText().toString(),Password.getText().toString());
      }
    }
    );
    }
    public void validate(String username,String password){
    if((username=="Misshind") && (password=="letitbe")){
        Intent intent=new Intent(MainActivity.this,SecondActivity.class);
        startActivity(intent);
    }else{
       counter--;
        info.setText("No of attempts remaing:" + String.valueOf(counter));
        if(counter==0){
            login.setEnabled(false);
        }
    }
    }
}
