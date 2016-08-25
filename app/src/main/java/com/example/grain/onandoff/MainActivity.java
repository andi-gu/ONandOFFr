package com.example.grain.onandoff;


import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends Activity {
    private ToggleButton  tb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tb = (ToggleButton)findViewById(R.id.toggle);
        Log.v("pp",tb.getTextOff().toString());
        tb.setText("jj");
        tb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {


            @Override

            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){


                    Toast.makeText(getApplicationContext(),"haha",Toast.LENGTH_SHORT).show();



                }else {
                    Toast.makeText(getApplicationContext(),"---",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }


}
