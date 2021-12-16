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

        String inputNumberZero();

        String calculate();

    }

    interface IPresenter {

        void onButtonWasClicked(TextView tvMathExpression);

    }
}
