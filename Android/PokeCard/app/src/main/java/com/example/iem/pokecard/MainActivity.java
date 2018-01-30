package com.example.iem.pokecard;


import android.content.Intent;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;




public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        final TextView tv = (TextView) findViewById(R.id.textView);
        Button buttonList = (Button) findViewById(R.id.buttonListPokemon);
        Button buttonLogin = (Button) findViewById(R.id.buttonLogin);
        Button buttonSetting = (Button) findViewById(R.id.buttonSettings);


        buttonList.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this,ListPokemon.class);
            startActivity(intent);
        }
        });


        button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            new Async().execute(tv,"" + "http://pokecard.local/index.php/pokemon/list");
        }
        });

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

       buttonSetting.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
               startActivity(intent);
           }
       });

    }

}
