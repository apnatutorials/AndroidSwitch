package com.apnatutorials.androidswitch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handleSwitchClick(View view) {
        Switch s = (Switch) view;
        boolean isChecked = s.isChecked();
        switch (view.getId()) {
            case R.id.simpleSwitch:
                Toast.makeText(MainActivity.this, "Simple switch isChecked : " + isChecked, Toast.LENGTH_SHORT).show();
                break;
            case R.id.customSwitch:
                Toast.makeText(MainActivity.this, "Custom switch isChecked : " + isChecked, Toast.LENGTH_SHORT).show();
                break;

        }
    }
}
