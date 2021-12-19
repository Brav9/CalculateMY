package com.hfad.caclulatormy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements IContact.IView {
    IContact.IPresenter myMVPPresenter;

    Button btnC;
    Button btnBack;
    Button btnDivision;
    Button btnSeven;
    Button btnEight;
    Button btnNine;
    Button btnMultiplication;
    Button btnFour;
    Button btnFive;
    Button btnSix;
    Button btnSubtraction;
    Button btnOne;
    Button btnTwo;
    Button btnTree;
    Button btnAddition;
    Button btnPlusMinus;
    Button btnZero;
    Button btnComma;
    Button btnEqual;

    TextView tvMathExpression;
    float mathValueOne;
    float mathValueTwo;

    CharSequence text;

    Operation operation = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnC = findViewById(R.id.btnC);
        btnBack = findViewById(R.id.btnBack);
        btnDivision = findViewById(R.id.btnDivision);
        btnSeven = findViewById(R.id.btnSeven);
        btnEight = findViewById(R.id.btnEight);
        btnNine = findViewById(R.id.btnNine);
        btnMultiplication = findViewById(R.id.btnMultiplication);
        btnFour = findViewById(R.id.btnFour);
        btnFive = findViewById(R.id.btnFive);
        btnSix = findViewById(R.id.btnSix);
        btnSubtraction = findViewById(R.id.btnSubtraction);
        btnOne = findViewById(R.id.btnOne);
        btnTwo = findViewById(R.id.btnTwo);
        btnTree = findViewById(R.id.btnTree);
        btnAddition = findViewById(R.id.btnAddition);
        btnPlusMinus = findViewById(R.id.btnPlusMinus);
        btnZero = findViewById(R.id.btnZero);
        btnComma = findViewById(R.id.btnComma);
        btnEqual = findViewById(R.id.btnEqual);
        tvMathExpression = findViewById(R.id.tvMathExpression);

        myMVPPresenter = new Presenter(this);

        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myMVPPresenter.onButtonWasClicked(Symbol.ZERO);
            }
        });

        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myMVPPresenter.onButtonWasClicked(Symbol.ONE);
            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myMVPPresenter.onButtonWasClicked(Symbol.TWO);
            }
        });

        btnTree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myMVPPresenter.onButtonWasClicked(Symbol.TREE);
            }
        });

        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myMVPPresenter.onButtonWasClicked(Symbol.FOUR);
            }
        });

        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myMVPPresenter.onButtonWasClicked(Symbol.FIVE);
            }
        });

        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myMVPPresenter.onButtonWasClicked(Symbol.SIX);
            }
        });

        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myMVPPresenter.onButtonWasClicked(Symbol.SEVEN);
            }
        });

        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myMVPPresenter.onButtonWasClicked(Symbol.EIGHT);
            }
        });

        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myMVPPresenter.onButtonWasClicked(Symbol.NINE);
            }
        });

        btnComma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myMVPPresenter.onButtonWasClicked(Symbol.COMMA);
            }
        });

        btnPlusMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myMVPPresenter.onButtonWasClicked(Symbol.PLUS_MINUS);
            }
        });

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myMVPPresenter.onButtonWasClickedOperation(Operation.CLEAN);
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myMVPPresenter.onButtonWasClicked(Symbol.BACK);
            }
        });

        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myMVPPresenter.onButtonWasClickedOperation(Operation.DIVISION);

//                mathValueOne = Float.parseFloat(tvMathExpression.getText() + "");
//                operation = Operation.DIVISION;
//                tvMathExpression.setText(null);
            }
        });

        btnMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myMVPPresenter.onButtonWasClickedOperation(Operation.MULTIPLICATION);
//                mathValueOne = Float.parseFloat(tvMathExpression.getText() + "");
//                operation = Operation.MULTIPLICATION;
//                tvMathExpression.setText(null);
            }
        });

        btnSubtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myMVPPresenter.onButtonWasClickedOperation(Operation.SUBTRACTION);
//                mathValueOne = Float.parseFloat(tvMathExpression.getText() + "");
//                operation = Operation.SUBTRACTION;
//                tvMathExpression.setText(null);
            }
        });

        btnAddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myMVPPresenter.onButtonWasClickedOperation(Operation.ADDICTION);
//                if (tvMathExpression == null) {
//                    tvMathExpression.setText("");
//                } else {
//                    mathValueOne = Float.parseFloat(tvMathExpression.getText() + "");
//                    operation = Operation.ADDICTION;
//                    tvMathExpression.setText(null);
//                }
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myMVPPresenter.onButtonWasClickedOperation(Operation.EQUAL);
//                mathValueTwo = Float.parseFloat(tvMathExpression.getText() + "");
//
//                switch (operation) {
//                    case ADDICTION:
//                        tvMathExpression.setText(mathValueOne + mathValueTwo + "");
//                        break;
//                    case DIVISION:
//                        tvMathExpression.setText(mathValueOne / mathValueTwo + "");
//                        break;
//                    case MULTIPLICATION:
//                        tvMathExpression.setText(mathValueOne * mathValueTwo + "");
//                        break;
//                    case SUBTRACTION:
//                        tvMathExpression.setText(mathValueOne - mathValueTwo + "");
//                        break;
//                }
//                operation = null;
            }
        });


    }

    @Override
    public void showError() {
    }

    @Override
    public void hideError() {

    }

    @Override
    public void showNumber(String resCalculated) {
        tvMathExpression.setText(resCalculated);
    }

    @Override
    public void showOperation() {

    }

    @Override
    public void showResult() {

    }
}