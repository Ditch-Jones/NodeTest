package com.example.joshi.nodetest;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;



import org.json.JSONException;


/**
 * Created by Joshi on 07.09.2017.
 */

public class NodeActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.action_performed);
        try{
            startHashX();
            startHashY();
            startRouting();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    private void startHashX() throws JSONException {
        new HashXTask(new HashXTask.AsyncResponse(){
            @Override
            public void processFinish(double d){
                Log.d("HashX in processFinish ", "d"+d);
            }
        }).execute("123.142.0.1");
    }

    private void startHashY() throws JSONException {
        new HashYTask(new HashYTask.AsyncResponse(){
            @Override
            public void processFinish(double d){
                Log.d("HashY in processFinish ", "d"+d);
            }
        }).execute("123.142.0.1");
    }

    private void startRouting(){
        new RoutingTask().execute("1.3","3.5");
    }
}
