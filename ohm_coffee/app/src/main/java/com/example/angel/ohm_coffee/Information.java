/*
 *  The information.java page include
 *  @ a link to the website Github with all the information about the project
 *  @ a link with the information and tasks of the team members
 *  @ a link to the wiki website coffee to get more information about coffee
 */


package com.example.angel.ohm_coffee;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Information extends AppCompatActivity implements View.OnClickListener {


    Button btnGithub;
    Button btnTeam;
    Button btnCoffeeInfo;
    Button btnOrder;

    // layout for the page information.java and different Buttons are create
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        btnGithub = (Button) findViewById(R.id.btnGithub);
        btnGithub.setOnClickListener(this);

        btnCoffeeInfo = (Button) findViewById(R.id.btnCoffeeInfo);
        btnCoffeeInfo.setOnClickListener(this);

        btnTeam = (Button) findViewById(R.id.btnTeam);
        btnTeam.setOnClickListener(this);

        btnOrder = (Button) findViewById(R.id.btnOrder);
        btnOrder.setOnClickListener(this);
    }

    // the function click on is create for each button and the link is create
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnCoffeeInfo:
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://en.wikipedia.org/wiki/Coffee"));  //link to wiki website coffee
                startActivity(intent);
                this.finish();
                break;
            case R.id.btnGithub:
                intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://github.com/christianpfitzner/ohm_coffee")); //link to Github
                startActivity(intent);
                this.finish();
                break;
            case R.id.btnTeam:
                intent = new Intent(this, Team.class);
                startActivity(intent); // link to the class Team
                this.finish();
                break;
            case R.id.btnOrder:
                intent = new Intent(this, MainActivity.class);
                startActivity(intent); // link to the class MainActivity
                this.finish();
                break;
        }
    }

}
