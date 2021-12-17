package com.hfad.caclulatormy;

import android.widget.TextView;

public interface IContact {
    interface IView {
        void showError();

        void hideError();

        void showNumber(String resCalculated);
        void showOperation();
        void showResult();
    }

    interface IModel {
        void updateInfo();

        String inputSymbol(Symbol symbol);
        String inputOperation(Operation operation);


    }

    interface IPresenter {

        void onButtonWasClicked(Symbol symbol);

        void onButtonWasClickedOperation(Operation operation);

        void selectionSymbol();

    }
}
