package de.btit.fjaeckel.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button buttonFrage;
    private Button buttonAntwort1;
    private Button buttonAntwort2;
    private Button buttonAntwort3;
    private Button buttonAntwort4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonFrage = findViewById(R.id.buttonFrage);
        buttonAntwort1 = findViewById(R.id.buttonAntwort1);
        buttonAntwort1 = findViewById(R.id.buttonAntwort1);
        buttonAntwort2 = findViewById(R.id.buttonAntwort2);
        buttonAntwort3 = findViewById(R.id.buttonAntwort3);
        buttonAntwort4 = findViewById(R.id.buttonAntwort4);
        main(null);
    }

    public void main(String[] args){
        Frage f1 = new Frage("Wie heiße ich?", "Allgemeines", "Florian", "Christoph", "Harald", "Sebastian", 1);
        buttonFrage.setText(f1.getText());
        buttonAntwort1.setText(f1.getAntwort1());
        buttonAntwort2.setText(f1.getAntwort2());
        buttonAntwort3.setText(f1.getAntwort3());
        buttonAntwort4.setText(f1.getAntwort4());
    }
}
