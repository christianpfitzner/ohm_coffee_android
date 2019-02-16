/*
 *  The MainActivity.java page is the home page when the app is started.
 *  The page consists of the buttons with the names of the users to order a coffee to each place.
 *  If a name is chosen this name will be sent to the IP address 192.168.5.66 and the Port 7850.
 *  The name is filed with coordinates and the robot drives to them.
 *  So that the user does not order a coffee several times behind each other, a new page Wait.java opens.
 */
package com.example.angel.ohm_coffee;

import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnLukas;
    Button btnAngelika;
    Button btnDaniel;
    Button btnSimon;
    Button btnNew;
    Button btnInfo;

    Context context;
    private String macAddress;
    WifiManager wifiMan;

    // layout for the page MainActivity.java and different Buttons are create
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLukas = (Button) findViewById(R.id.btnLukas);
        btnLukas.setOnClickListener(this);

        btnAngelika = (Button) findViewById(R.id.btnAngelika);
        btnAngelika.setOnClickListener(this);

        btnDaniel = (Button) findViewById(R.id.btnDaniel);
        btnDaniel.setOnClickListener(this);

        btnSimon = (Button) findViewById(R.id.btnSimon);
        btnSimon.setOnClickListener(this);

        btnInfo = (Button) findViewById(R.id.btnInfo);
        btnInfo.setOnClickListener(this);
    }

    // the function click on is create for each button and the link is create.
    // Also a MessageSender are create to send the name to the IP address.
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnAngelika:
                String androidId = "angelika";
                String address = androidId;
                MessageSender messageSender = new MessageSender();
                messageSender.execute(address);
                Intent intent = new Intent(this, Wait.class); //link to the class Wait
                startActivity(intent);
                this.finish();
                break;
            case R.id.btnDaniel:
                androidId = "daniel";
                address = androidId;
                messageSender = new MessageSender();
                messageSender.execute(address);
                intent = new Intent(this, Wait.class); //link to the class Wait
                startActivity(intent);
                this.finish();
                break;
            case R.id.btnLukas:
                androidId = "lukas";
                address = androidId;
                messageSender = new MessageSender();
                messageSender.execute(address);
                intent = new Intent(this, Wait.class); //link to the class Wait
                startActivity(intent);
                this.finish();
                break;
            case R.id.btnSimon:
                androidId = "simon";
                address = androidId;
                messageSender = new MessageSender();
                messageSender.execute(address);
                intent = new Intent(this, Wait.class); //link to the class Wait
                startActivity(intent);
                this.finish();
                break;
            case R.id.btnInfo:
                intent = new Intent(this, Information.class); //link to the class Information
                startActivity(intent);
                break;

        }


}}
