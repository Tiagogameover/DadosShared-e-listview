package com.recuperacao.recuperao;

import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {
    private Button btlist, btconfig;
    public static int esconder = 1;
    private FrameLayout frameLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btlist = (Button) findViewById(R.id.bt_lista);
        btconfig = (Button) findViewById(R.id.bt_config);
        frameLayout = (FrameLayout) findViewById(R.id.container);

        //Esconder framelayout configuracoes
        if (esconder == 1) {
            frameLayout.setVisibility(View.GONE);
        }

        // button lista click
        btlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ListaActivity.class);
                startActivity(intent);
            }
        });

        // button lista click
        btconfig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                esconder = 2;
                frameLayout.setVisibility(View.VISIBLE);
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction().replace(R.id.container, new ConfigFragment()).commit();
            }
        });
    }
}
