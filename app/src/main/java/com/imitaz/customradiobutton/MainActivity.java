package com.imitaz.customradiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

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
    }
}
