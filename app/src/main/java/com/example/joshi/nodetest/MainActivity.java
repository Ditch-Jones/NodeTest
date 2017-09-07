package com.example.joshi.nodetest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button performAction;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        performAction = (Button) findViewById(R.id.perFormAction);

        performAction.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent (getApplicationContext(), NodeActivity.class);
                startActivity(i);
            }
        });
    }
}
