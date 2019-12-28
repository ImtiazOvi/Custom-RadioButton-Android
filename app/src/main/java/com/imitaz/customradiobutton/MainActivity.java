package com.imitaz.customradiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Toast;

import java.util.Map;

public class MainActivity extends AppCompatActivity {

    ImtiazRadioButtom profile,anonymous;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anonymous = findViewById(R.id.anonymous);
        profile = findViewById(R.id.my_profile);

        anonymous.setButtonDrawable(R.drawable.anonymous);
        profile.setButtonDrawable(R.drawable.profile);

        anonymous.setOwnOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(MainActivity.this,"I am anonymous",Toast.LENGTH_SHORT).show();
            }
        });

        profile.setOwnOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(MainActivity.this,"It's me",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
