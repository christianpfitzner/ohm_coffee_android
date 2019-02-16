/*
 * Team.java consist the name of the team members and the workspace
 */

package com.example.angel.ohm_coffee;

import android.content.Intent;
import android.icu.text.IDNA;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Team extends AppCompatActivity implements View.OnClickListener {

        Button btnOrder;
        Button btnInfo;

        // layout for the page Team.java and different Buttons are create
        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_team);

                btnOrder = (Button) findViewById(R.id.btnOrder);
         btnOrder.setOnClickListener(this);

                btnInfo = (Button) findViewById(R.id.btnInfo);
                btnInfo.setOnClickListener(this);

                }

        @Override
        public void onClick(View v){
                switch (v.getId()) {
                        case R.id.btnOrder:
                                Intent intent = new Intent(this, MainActivity.class); //link to the MainActivity class
                                startActivity(intent);
                                this.finish();
                                break;
                        case R.id.btnInfo:
                                intent = new Intent(this, Information.class); //link to the Information class
                                 startActivity(intent);
                                this.fileList();
                                 break;
                }
                }
}

