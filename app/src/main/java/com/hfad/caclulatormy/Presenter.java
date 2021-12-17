package com.hfad.caclulatormy;

public class Presenter implements IContact.IPresenter {


    IContact.IView myMVPView;
    IContact.IModel myMVPModel;

    public Presenter(IContact.IView myMVPView) {
        this.myMVPView = myMVPView;
        this.myMVPModel = new Model();

    }

    @Override
    public void onButtonWasClicked(Symbol symbol) {
        String number = myMVPModel.inputSymbol(symbol);
        myMVPView.showNumber(number);
    }

    @Override
    public void onButtonWasClickedOperation(Operation operation) {
        String operationSymbol = myMVPModel.inputOperation(operation);
        myMVPView.showNumber(operationSymbol);
    }


    @Override
    public void selectionSymbol() {

    }
}


