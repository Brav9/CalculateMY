package com.hfad.caclulatormy;

public class Presenter implements IContact.IPresenter {


    IContact.IView myMVPView;
    IContact.IModel myMVPModel;

    String currentText; //то, что сейчас видно на экране

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
        String number = myMVPModel.inputOperation(operation);
        myMVPView.showNumber(number);
    }


    @Override
    public void selectionSymbol() {

    }
}


