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
        String numberZero = myMVPModel.inputSymbol(symbol);
        myMVPView.showResult(numberZero);
    }

    @Override
    public void selectionSymbol() {

    }
}


