package fr.skyle.tp1android;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class BonusActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // On définit le layout à utiliser sur cette Activity
        setContentView(R.layout.activity_bonus);
    }
}