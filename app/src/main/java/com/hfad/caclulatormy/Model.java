package com.hfad.caclulatormy;

public class Model implements IContact.IModel {
    Operation operation = null;

    @Override
    public void updateInfo() {

    }

    @Override
    public String inputSymbol(Symbol symbol) {
        switch (symbol) {
            case COMMA:
                return ".";
            case ZERO:
                return "0";
            case ONE:
                return "1";
            case TWO:
                return "2";
            case TREE:
                return "3";
            case FOUR:
                return "4";
            case FIVE:
                return "5";
            case SIX:
                return "6";
            case SEVEN:
                return "7";
            case EIGHT:
                return "8";
            case NINE:
                return "9";
            case PLUS_MINUS:

                //float value = Float.parseFloat(tvMathExpression.getText().toString());
               // if (value < 0) {
                //    value = Math.abs(value);
                //} else if (value > 0) {
                //    value = value * -1;
               // }
              //  tvMathExpression.setText(String.valueOf(value));
        }
        return null;
    }

    @Override
    public String inputOperation(Operation operation) {

        switch (operation) {
            case ADDICTION:
            case DIVISION:
            case SUBTRACTION:
            case MULTIPLICATION:
            case CLEAN:
                return "";
            case BACK:
              //  return newText;



                //if (text.length() > 0) {
                //     int lastCharPosition = text.length();
                //     CharSequence newText = text.subSequence(0, lastCharPosition - 1);
                //     tvMathExpression.setText(newText);
        }
        return null;

    }
}

