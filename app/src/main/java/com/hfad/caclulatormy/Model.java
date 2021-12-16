package com.hfad.caclulatormy;

import android.widget.TextView;

public class Model implements IContact.IModel {
    TextView tvMathExpression;

    @Override
    public void updateInfo() {

    }

    @Override
    public String inputNumberZero() {
         tvMathExpression.setText(tvMathExpression.getText() + "0");

        return null;
    }

    @Override
    public String calculate() {

        return null;
    }
}
