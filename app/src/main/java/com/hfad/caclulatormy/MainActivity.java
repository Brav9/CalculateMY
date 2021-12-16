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

                myMVPPresenter.onButtonWasClicked(tvMathExpression);
                // tvMathExpression.setText(tvMathExpression.getText() + "0");

            }
        });

        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMathExpression.setText(tvMathExpression.getText() + "1");
            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMathExpression.setText(tvMathExpression.getText() + "2");
            }
        });
        btnTree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMathExpression.setText(tvMathExpression.getText() + "3");
            }
        });

        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMathExpression.setText(tvMathExpression.getText() + "4");
            }
        });

        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMathExpression.setText(tvMathExpression.getText() + "5");
            }
        });

        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMathExpression.setText(tvMathExpression.getText() + "6");
            }
        });

        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMathExpression.setText(tvMathExpression.getText() + "7");
            }
        });

        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMathExpression.setText(tvMathExpression.getText() + "8");
            }
        });

        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMathExpression.setText(tvMathExpression.getText() + "9");
            }
        });

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMathExpression.setText("");
                //TODO operation = null;
                operation = null;

            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence text = tvMathExpression.getText();
                if (text.length() > 0) {
                    int lastCharPosition = text.length();
                    CharSequence newText = text.subSequence(0, lastCharPosition - 1);
                    tvMathExpression.setText(newText);
                }
            }
        });

        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mathValueOne = Float.parseFloat(tvMathExpression.getText() + "");
                operation = Operation.DIVISION;
                tvMathExpression.setText(null);
            }
        });

        btnMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mathValueOne = Float.parseFloat(tvMathExpression.getText() + "");
                operation = Operation.MULTIPLICATION;
                tvMathExpression.setText(null);
            }
        });

        btnSubtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mathValueOne = Float.parseFloat(tvMathExpression.getText() + "");
                operation = Operation.SUBTRACTION;
                tvMathExpression.setText(null);
            }
        });

        btnAddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvMathExpression == null) {
                    tvMathExpression.setText("");
                } else {
                    mathValueOne = Float.parseFloat(tvMathExpression.getText() + "");
                    operation = Operation.ADDICTION;
                    tvMathExpression.setText(null);
                }
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mathValueTwo = Float.parseFloat(tvMathExpression.getText() + "");

                switch (operation) {
                    case ADDICTION:
                        tvMathExpression.setText(mathValueOne + mathValueTwo + "");
                        break;
                    case DIVISION:
                        tvMathExpression.setText(mathValueOne / mathValueTwo + "");
                        break;
                    case MULTIPLICATION:
                        tvMathExpression.setText(mathValueOne * mathValueTwo + "");
                        break;
                    case SUBTRACTION:
                        tvMathExpression.setText(mathValueOne - mathValueTwo + "");
                        break;
                }
                operation = null;
            }
        });


        btnComma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMathExpression.setText(tvMathExpression.getText() + ".");
            }
        });

        btnPlusMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float value = Float.parseFloat(tvMathExpression.getText().toString());
                if (value < 0) {
                    value = Math.abs(value);
                } else if (value > 0) {
                    value = value * -1;
                }
                tvMathExpression.setText(String.valueOf(value));
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
    public void showResult(String resCalculated) {
        tvMathExpression.setText(resCalculated);
    }
}