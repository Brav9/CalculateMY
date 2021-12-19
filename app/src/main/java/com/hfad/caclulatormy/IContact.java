package com.hfad.caclulatormy;

public interface IContact {
    interface IView {
//        void showError();
//        void hideError();
        void showNumber(String resCalculated);
    }

    interface IModel {
        String inputSymbol(Symbol symbol);
        String inputOperation(Operation operation);
        String getResult();
    }

    interface IPresenter {
        void onButtonWasClicked(Symbol symbol);
        void onButtonWasClickedOperation(Operation operation);
    }
}
