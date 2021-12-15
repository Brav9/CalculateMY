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
    Button btnNull;
    Button btnComma;
    Button btnEqual;

    TextView tvMathExpression;
    float mathValueOne;
    float mathValueTwo;

    boolean mathAddition;
    boolean mathMultiplication;
    boolean mathSubtraction;
    boolean mathDivision;


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
        btnNull = findViewById(R.id.btnNull);
        btnComma = findViewById(R.id.btnComma);
        btnEqual = findViewById(R.id.btnEqual);
        tvMathExpression = findViewById(R.id.tvMathExpression);

        myMVPPresenter = new Presenter(this);

        btnNull.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMathExpression.setText(tvMathExpression.getText() + "0");
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
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mathValueOne = Float.parseFloat(tvMathExpression.getText() + "");
                mathDivision = true;
                tvMathExpression.setText(null);
            }
        });

        btnMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mathValueOne = Float.parseFloat(tvMathExpression.getText() + "");
                mathMultiplication = true;
                tvMathExpression.setText(null);
            }
        });

        btnSubtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mathValueOne = Float.parseFloat(tvMathExpression.getText() + "");
                mathSubtraction = true;
                tvMathExpression.setText(null);

            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mathValueTwo = Float.valueOf(tvMathExpression.getText() + "");

                if (mathAddition == true) {
                    tvMathExpression.setText(mathValueOne + mathValueTwo + "");
                    mathAddition = false;
                }

                if (mathSubtraction == true) {
                    tvMathExpression.setText(mathValueOne - mathValueTwo + "");
                    mathSubtraction = false;
                }

                if (mathMultiplication == true) {
                    tvMathExpression.setText(mathValueOne * mathValueTwo + "");
                    mathMultiplication = false;
                }

                if (mathDivision == true) {
                    tvMathExpression.setText(mathValueOne / mathValueTwo + "");
                    mathDivision = false;
                }


            }
        });

        btnAddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvMathExpression == null) {
                    tvMathExpression.setText("");
                } else {
                    mathValueOne = Float.parseFloat(tvMathExpression.getText() + "");
                    mathAddition = true;
                    tvMathExpression.setText(null);
                }
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
    public void showResult() {

    }
}