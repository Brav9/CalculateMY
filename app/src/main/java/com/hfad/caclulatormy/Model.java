package com.hfad.caclulatormy;

import static com.hfad.caclulatormy.Operation.CLEAN;
import static com.hfad.caclulatormy.Operation.EQUAL;

public class Model implements IContact.IModel {

    private String firstValue;
    private String secondValue;

    private boolean isFirstValueEdit = true;
    private Operation operation = null;

    @Override
    public String inputSymbol(Symbol symbol) {
        //Работаем с первым числом
        if (isFirstValueEdit) {
            if (firstValue == null) {
                firstValue = recognizeSymbol(symbol);
            } else if (symbol == Symbol.BACK) {
                firstValue = recognizeSymbol(symbol);
            } else if (symbol == Symbol.PLUS_MINUS) {
                firstValue = recognizeSymbol(symbol);
            } else {
                firstValue = firstValue + recognizeSymbol(symbol);
            }
            return firstValue;
            //Работаем со вторым числом
        } else {
            if (secondValue == null) {
                secondValue = recognizeSymbol(symbol);
            } else if (symbol == Symbol.BACK) {
                secondValue = recognizeSymbol(symbol);
            } else if (symbol == Symbol.PLUS_MINUS) {
                secondValue = recognizeSymbol(symbol);
            } else {
                secondValue = secondValue + recognizeSymbol(symbol);
            }
            return secondValue;
        }
    }

    private String recognizeSymbol(Symbol symbol) {
        switch (symbol) {
            case BACK:
                if (isFirstValueEdit) {
                    if (firstValue.isEmpty()) {
                        return "";
                    } else {
                        return firstValue.substring(0, firstValue.length() - 1);
                    }
                } else {
                    if (secondValue.isEmpty()) {
                        return "";
                    } else {
                        return secondValue.substring(0, secondValue.length() - 1);
                    }
                }
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
                if (isFirstValueEdit) {
                    float firstValueFloat = Float.parseFloat(firstValue);
                    if (firstValueFloat < 0) {
                        firstValueFloat = Math.abs(firstValueFloat);
                        firstValue = "";
                    } else if (firstValueFloat > 0) {
                        firstValueFloat = firstValueFloat * -1;
                        firstValue = "";
                    }
                    return String.valueOf(firstValueFloat);
                } else {
                    float secondValueFloat = Float.parseFloat(secondValue);
                    if (secondValueFloat < 0) {
                        secondValueFloat = Math.abs(secondValueFloat);
                        secondValue = "";
                    } else if (secondValueFloat > 0) {
                        secondValueFloat = secondValueFloat * -1;
                        secondValue = "";
                    }
                    return String.valueOf(secondValueFloat);
                }
            default:
                return "";
        }
    }

    @Override
    public String inputOperation(Operation operation) {
        if (operation == CLEAN) {
            isFirstValueEdit = true;
            firstValue = "";
            secondValue = "";
            this.operation = null;
            return firstValue;
        } else if (operation == EQUAL) {
            return getResult();
        } else {
            secondValue = "";
            this.operation = operation;
            isFirstValueEdit = false;
            return secondValue;
        }
    }

    @Override
    public String getResult() {

        float a = Float.parseFloat(firstValue);
        float b = Float.parseFloat(secondValue);

        switch (operation) {
            case MULTIPLICATION:
                firstValue = "";
                secondValue = "";
                this.operation = null;
                isFirstValueEdit = true;
                return String.valueOf(a * b);
            case SUBTRACTION:
                firstValue = "";
                secondValue = "";
                this.operation = null;
                isFirstValueEdit = true;
                return String.valueOf(a - b);
            case DIVISION:
                firstValue = "";
                secondValue = "";
                this.operation = null;
                isFirstValueEdit = true;
                return String.valueOf(a / b);
            case ADDICTION:
                firstValue = "";
                secondValue = "";
                this.operation = null;
                isFirstValueEdit = true;
                return String.valueOf(a + b);
        }
        return null;
    }
}

