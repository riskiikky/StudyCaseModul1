package com.example.android.studycase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();

        int mymoney = 65500;
        String menurest = intent.getStringExtra("menurest");
        String menuporsi = intent.getStringExtra("porsirest");
        String restaurant = intent.getStringExtra("restaurant");

        int hargaporsi = Integer.parseInt(menuporsi);

        // kalau isi dari restaurant itu sama dengan 'EatBus'
        if (restaurant.equalsIgnoreCase("Eatbus")){
            int nasiudukEatbus = 50000;
            int total = hargaporsi*nasiudukEatbus;
            String totalharga = String.valueOf(total);

            if (total>mymoney){

                TextView txtmenu = (TextView) findViewById(R.id.txtmenu);
                TextView txtporsi = (TextView) findViewById(R.id.txtporsi);
                TextView txtdinner = (TextView) findViewById(R.id.txtdinner);
                TextView txtharga = (TextView) findViewById(R.id.txtharga);

                txtmenu.setText(menurest);
                txtporsi.setText(menuporsi);
                txtdinner.setText(restaurant);
                txtharga.setText(totalharga);

                String shownotif = "Jangan disini makan malamnya, uang kamu tidak cukup";
                Toast showEatbus = Toast.makeText (this, shownotif, Toast.LENGTH_LONG);
                showEatbus.show();
            }
            else{
                TextView txtmenu = (TextView) findViewById(R.id.txtmenu);
                TextView txtporsi = (TextView) findViewById(R.id.txtporsi);
                TextView txtdinner = (TextView) findViewById(R.id.txtdinner);
                TextView txtharga = (TextView) findViewById(R.id.txtharga);

                txtmenu.setText(menurest);
                txtporsi.setText(menuporsi);
                txtdinner.setText(restaurant);
                txtharga.setText(totalharga);

                String shownotif = "Disini aja makan malamnya";
                Toast showEatbus = Toast.makeText (this, shownotif, Toast.LENGTH_LONG);
                showEatbus.show();
            }

        }
        else if (restaurant.equalsIgnoreCase("Abnormal")){
            int nasiudukAbnormal = 30000;
            int total = hargaporsi*nasiudukAbnormal;
            String totalharga = String.valueOf(total);

            if (total>mymoney){

                TextView txtmenu = (TextView) findViewById(R.id.txtmenu);
                TextView txtporsi = (TextView) findViewById(R.id.txtporsi);
                TextView txtdinner = (TextView) findViewById(R.id.txtdinner);
                TextView txtharga = (TextView) findViewById(R.id.txtharga);

                txtmenu.setText(menurest);
                txtporsi.setText(menuporsi);
                txtdinner.setText(restaurant);
                txtharga.setText(totalharga);

                String shownotif = "Jangan disini makan malamnya, uang kamu tidak cukup";
                Toast showEatbus = Toast.makeText (this, shownotif, Toast.LENGTH_LONG);
                showEatbus.show();
            }
            else{
                TextView txtmenu = (TextView) findViewById(R.id.txtmenu);
                TextView txtporsi = (TextView) findViewById(R.id.txtporsi);
                TextView txtdinner = (TextView) findViewById(R.id.txtdinner);
                TextView txtharga = (TextView) findViewById(R.id.txtharga);

                txtmenu.setText(menurest);
                txtporsi.setText(menuporsi);
                txtdinner.setText(restaurant);
                txtharga.setText(totalharga);

                String shownotif = "Disini aja makan malamnya";
                Toast showEatbus = Toast.makeText (this, shownotif, Toast.LENGTH_LONG);
                showEatbus.show();
            }
        }

    }

}