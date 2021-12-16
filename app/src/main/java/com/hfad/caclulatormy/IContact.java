package com.hfad.caclulatormy;

import android.widget.TextView;

public interface IContact {
    interface IView {
        void showError();

        void hideError();

        void showResult(String resCalculated);
    }

    interface IModel {
        void updateInfo();

        String inputNumber();

        String calculate();

    }

    interface IPresenter {

        void onButtonWasClickedZero();
        void onButtonWasClickedOne();
        void onButtonWasClickedTwo();
        void onButtonWasClickedTree();
        void onButtonWasClickedFour();
        void onButtonWasClickedFive();
        void onButtonWasClickedSix();
        void onButtonWasClickedSeven();
        void onButtonWasClickedEight();
        void onButtonWasClickedNine();

        void selectionSymbol();

    }
}
