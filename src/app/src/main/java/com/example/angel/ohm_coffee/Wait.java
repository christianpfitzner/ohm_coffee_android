/*
 * Wait.java is a page so that the user gets a confirmation after ordering a coffee that the order has worked out
 */

package com.example.angel.ohm_coffee;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Wait extends AppCompatActivity implements View.OnClickListener {

    Button btnFinish;

    // layout for the page Team.java and different Buttons are create
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wait);

        btnFinish = (Button) findViewById(R.id.btnFinish);
        btnFinish.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        Intent intent = new Intent(this, MainActivity.class); //link to the MainActivity class
        startActivity(intent);
        this.fileList();
    }
}
