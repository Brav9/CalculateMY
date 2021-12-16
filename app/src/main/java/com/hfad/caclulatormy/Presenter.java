package com.hfad.caclulatormy;

import android.util.Log;

public class Presenter implements IContact.IPresenter {
    String i;
    Symbol symbol = null;

    IContact.IView myMVPView;
    IContact.IModel myMVPModel;

    public Presenter(IContact.IView myMVPView) {
        this.myMVPView = myMVPView;
        this.myMVPModel = new Model();
        Symbol symbol = null;
    }

    @Override
    public void onButtonWasClickedZero() {
        symbol = Symbol.ZERO;
        selectionSymbol();
    }

    @Override
    public void onButtonWasClickedOne() {
        symbol = Symbol.ONE;
        selectionSymbol();
    }

    @Override
    public void onButtonWasClickedTwo() {
        symbol = Symbol.TWO;
        selectionSymbol();
    }

    @Override
    public void onButtonWasClickedTree() {
        symbol = Symbol.TREE;
        selectionSymbol();
    }

    @Override
    public void onButtonWasClickedFour() {
        symbol = Symbol.FOUR;
        selectionSymbol();
    }

    @Override
    public void onButtonWasClickedFive() {
        symbol = Symbol.FIVE;
        selectionSymbol();
    }

    @Override
    public void onButtonWasClickedSix() {
        symbol = Symbol.SIX;
        selectionSymbol();
    }

    @Override
    public void onButtonWasClickedSeven() {
        symbol = Symbol.SEVEN;
        selectionSymbol();
    }

    @Override
    public void onButtonWasClickedEight() {
        symbol = Symbol.EIGHT;
        selectionSymbol();
    }

    @Override
    public void onButtonWasClickedNine() {
        symbol = Symbol.NINE;
        selectionSymbol();
    }

    @Override
    public void selectionSymbol() {
        switch (symbol) {
            case ZERO:
                String numberZero = myMVPModel.inputNumberZero();
                myMVPView.showResult(numberZero);
                break;
            case ONE:
                String numberOne = myMVPModel.inputNumberOne();
                myMVPView.showResult(numberOne);
                break;
            case TWO:
                String numberTwo = myMVPModel.inputNumberTwo();
                myMVPView.showResult(numberTwo);
                break;
            case TREE:
                String numberTree = myMVPModel.inputNumberTree();
                myMVPView.showResult(numberTree);
                break;
            case FOUR:
                String numberFour = myMVPModel.inputNumberFour();
                myMVPView.showResult(numberFour);
                break;
            case FIVE:
                String numberFive = myMVPModel.inputNumberFive();
                myMVPView.showResult(numberFive);
                break;
            case SIX:
                String numberSix = myMVPModel.inputNumberSix();
                myMVPView.showResult(numberSix);
                break;
            case SEVEN:
                String numberSeven = myMVPModel.inputNumberSeven();
                myMVPView.showResult(numberSeven);
                break;
            case EIGHT:
                String numberEight = myMVPModel.inputNumberEight();
                myMVPView.showResult(numberEight);
                break;
            case NINE:
                String numberNine = myMVPModel.inputNumberNine();
                myMVPView.showResult(numberNine);
                break;
        }
    }

    // String resCalculated = myMVPModel.calculate();
    //   myMVPView.showResult(resCalculated);
    //  try {
//
    //  } catch (NullPointerException exception) {
    //   }
}



