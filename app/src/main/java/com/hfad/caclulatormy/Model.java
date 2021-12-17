package com.hfad.caclulatormy;

public class Model implements IContact.IModel {

    @Override
    public void updateInfo() {

    }

    @Override
    public String inputSymbol(Symbol symbol) {
        switch (symbol) {
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
        }
        return null;
    }

    @Override
    public String calculate() {
        return null;
    }
}
