package com.hfad.caclulatormy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements IContact.IView {

    Button btnC;
    Button btnBack;
    Button btnDelete;
    Button btnSeven;
    Button btnEight;
    Button btnNine;
    Button btnMultiplicationSign;
    Button btnFour;
    Button btnFive;
    Button btnSix;
    Button btnMinus;
    Button btnOne;
    Button btnTwo;
    Button btnTree;
    Button btnPlus;
    Button btnPlusAndMinus;
    Button btnNull;
    Button btnComma;
    Button btnEqualSign;
    TextView tvResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnC = findViewById(R.id.btnC);
        btnBack = findViewById(R.id.btnBack);
        btnDelete = findViewById(R.id.btnDelete);
        btnSeven = findViewById(R.id.btnSeven);
        btnEight = findViewById(R.id.btnEight);
        btnNine = findViewById(R.id.btnNine);
        btnMultiplicationSign =findViewById(R.id.btnMultiplicationSign);
        btnFour = findViewById(R.id.btnFour);
        btnFive = findViewById(R.id.btnFive);
        btnSix = findViewById(R.id.btnSix);
        btnMinus = findViewById(R.id.btnMinus);
        btnOne = findViewById(R.id.btnOne);
        btnTwo = findViewById(R.id.btnTwo);
        btnTree = findViewById(R.id.btnTree);
        btnPlus = findViewById(R.id.btnPlus);
        btnPlusAndMinus = findViewById(R.id.btnPlusAndMinus);
        btnNull = findViewById(R.id.btnNull);
        btnComma = findViewById(R.id.btnComma);
        btnEqualSign = findViewById(R.id.btnEqualSign);
        tvResult = findViewById(R.id.tvResult);


    }

    @Override
    public void showError() {
    }

    @Override
    public void hideError() {

    }

    @Override
    public void showResult() {

    }
}