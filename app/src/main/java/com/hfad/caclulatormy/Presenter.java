package com.hfad.caclulatormy;

public class Presenter implements IContact.IPresenter {

    Symbol symbol = null;

    IContact.IView myMVPView;
    IContact.IModel myMVPModel;

    public Presenter(IContact.IView myMVPView) {
        this.myMVPView = myMVPView;
        this.myMVPModel = new Model();
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

        String numberBtn = myMVPModel.inputNumber();
        myMVPView.showResult(numberBtn);
    }

    // String resCalculated = myMVPModel.calculate();
    //   myMVPView.showResult(resCalculated);
    //  try {
//
    //  } catch (NullPointerException exception) {
    //   }
}



