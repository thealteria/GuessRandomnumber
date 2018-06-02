package com.thealteria.guessrandomnumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randNo;

    public void toast(String string) {

        Toast.makeText(MainActivity.this, string, Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random ran = new Random();
        randNo = ran.nextInt(20) + 1;

    }

    public void guess(View view) {

        EditText guess = (EditText) findViewById(R.id.ran);

        int userGuess = Integer.parseInt(guess.getText().toString());

        if (userGuess > randNo) {

            toast("LOWER");
        }

        else if (userGuess < randNo) {

            toast("HIGHER");

        }

        else {

            toast("That's correct number!" + "\n" + "Press button to play again");

            Random rand = new Random();

            randNo = rand.nextInt(20) + 1;

        }

    }
}
