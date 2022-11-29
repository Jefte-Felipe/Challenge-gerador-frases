package com.challenged.quoteoftheday;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void generateNewPhrase(View view) {

        String[] phrase = {
                "Faça como um programador. Quando tudo está errado e confuso, apague tudo e recomece do zero.",
                "O resultado do programa é relativo o nível de conhecimento do programador.",
                "Se até as variáveis precisam ser declaradas porque não me declarar pra você?",
                "Os bilhões são feitos de centavos."
        };

        TextView text = findViewById(R.id.tvTitle);

        int number = new Random().nextInt(4);
        text.setText(phrase[number]);
    }
}