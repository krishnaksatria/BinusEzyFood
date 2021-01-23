package com.example.binusezyfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button drinksBtn, snacksBtn, foodsBtn, topUpBtn, myOrderBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drinksBtn = findViewById(R.id.drinksBtn);
        snacksBtn = findViewById(R.id.snacksBtn);
        foodsBtn = findViewById(R.id.foodsBtn);
        topUpBtn = findViewById(R.id.topUpBtn);
        myOrderBtn = findViewById(R.id.myOrderBtn);

        drinksBtn.setOnClickListener(this);
        snacksBtn.setOnClickListener(this);
        foodsBtn.setOnClickListener(this);
        topUpBtn.setOnClickListener(this);
        myOrderBtn.setOnClickListener(this);
    }

    public void toSelectProduct(){
        Intent selectProductIntent = new Intent(this, SelectProduct.class);
        startActivity(selectProductIntent);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.drinksBtn:
                toSelectProduct();
                break;

            case R.id.snacksBtn:
                toSelectProduct();
                break;

            case R.id.foodsBtn:
                toSelectProduct();
                break;

            case R.id.topUpBtn:
                Intent topUpIntent = new Intent(this, TopUp.class);
                startActivity(topUpIntent);
                break;

            case R.id.myOrderBtn:
                Intent myOrderIntent = new Intent(this, MyOrder.class);
                startActivity(myOrderIntent);
                break;
        }
    }
}