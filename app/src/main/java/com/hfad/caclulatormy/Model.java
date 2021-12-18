package com.hfad.caclulatormy;

import static com.hfad.caclulatormy.Operation.CLEAN;

public class Model implements IContact.IModel {

    private String firstValue;
    private String secondValue;
    private  String number;
    CharSequence newValue;

    private boolean isFirstValueEdit = true;

    private Operation operation = null;

    @Override
    public void updateInfo() {

    }

    @Override
    public String inputSymbol(Symbol symbol) {
        if (isFirstValueEdit) {
            if (firstValue == null) {
                firstValue = recognizeSymbol(symbol);
            } else if (symbol == Symbol.BACK){
                firstValue = recognizeSymbol(symbol);
            } else  {
                firstValue = firstValue + recognizeSymbol(symbol);
            }
            return firstValue;
            //Работаем с первым числом
            //TODO если символ Удалить - то здесть очищаем firstValue
        }
        else {
            //Работаем со вторым числом
            secondValue = secondValue + recognizeSymbol(symbol);
            return secondValue;
        }
    }

    private String recognizeSymbol(Symbol symbol) {
        switch (symbol) {
            case BACK:
                if (firstValue.isEmpty()) {
                    return "";
                } else {

                    return firstValue.substring(0, firstValue.length() - 1);

                }


//                if (firstValue.length() > 0) {
//                    int lastCharPosition = firstValue.length();
//                    newValue = firstValue.subSequence(0, lastCharPosition - 1);
//                    this.firstValue = "";
//
//                    return String.valueOf(newValue);
//                }


               // text = tvMathExpression.getText();
//                if (text.length() > 0) {
//                    int lastCharPosition = text.length();
//                    CharSequence newText = text.subSequence(0, lastCharPosition - 1);
//                    tvMathExpression.setText(newText);
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
                float firstValueFloat = Float.parseFloat(firstValue);
                if (firstValueFloat < 0) {
                    firstValueFloat = Math.abs(firstValueFloat);
                    firstValue = "";
                } else if (firstValueFloat > 0) {
                    firstValueFloat = firstValueFloat * -1;
                    firstValue = "";
                }

                return String.valueOf(firstValueFloat);//TODO
            default:
                return "";
        } //return null;
    }


    @Override
    public String inputOperation(Operation operation) {
        if (operation == CLEAN) {
            isFirstValueEdit = true;
            firstValue = "";
            secondValue = "";
            this.operation = null;
            return firstValue;
        } else {
            //secondValue = "";
            this.operation = operation;
            isFirstValueEdit = false;
            return secondValue;
        }

    }

    @Override
    public String getResult() {

        return null;
    }

//    switch (operation) {
//        case ADDICTION:
//            tvMathExpression.setText(mathValueOne + mathValueTwo + "");
//            break;
//        case DIVISION:
//            tvMathExpression.setText(mathValueOne / mathValueTwo + "");
//            break;
//        case MULTIPLICATION:
//            tvMathExpression.setText(mathValueOne * mathValueTwo + "");
//            break;
//        case SUBTRACTION:
//            tvMathExpression.setText(mathValueOne - mathValueTwo + "");
//            break;
//    }
//    operation = null;

    //TODO public String getResult - через свитч берешь операцию и накладываешь на firstValue and secondValue и возвращаешь результат
}

