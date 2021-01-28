package fr.skyle.tp1android;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int cpt = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // On définit le layout à utiliser sur cette Activity
        setContentView(R.layout.activity_main);

        // Faire en sorte qu'au clic sur buttonPart1, le texte apparaisse dans textViewPart1
        Button button1 = findViewById(R.id.buttonPart1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setTextInTextView1();
            }
        });

        // Faire en sorte qu'au clic
        Button button2 = findViewById(R.id.buttonPart2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setTextInTextView2();
            }
        });

        // Faire en sorte qu'au clic l'écran BONUS soit poussé
        Button buttonBonus = findViewById(R.id.buttonBonus);
        buttonBonus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToBonusActivity();
            }
        });
    }

    private void setTextInTextView1() {
        TextView textView1 = findViewById(R.id.textViewPart1);
        textView1.setText(getString(R.string.main_part_1_clic_format, cpt));
        cpt++;
    }

    private void setTextInTextView2() {
        TextView textView2 = findViewById(R.id.textViewPart2);
        EditText editText2 = findViewById(R.id.editTextPart2);
        String textOfEditText = editText2.getText().toString();
        textView2.setText(textOfEditText);
    }

    private void goToBonusActivity() {
        startActivity(new Intent(getApplicationContext(), BonusActivity.class));
    }
}