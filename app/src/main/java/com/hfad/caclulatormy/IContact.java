package com.hfad.caclulatormy;

public interface IContact {
    interface IView {
        void showError();
        void hideError();
        void showResult();
    }

    interface IModel {
        void updateInfo();
        void  calculate();
    }

    interface IPresenter {
        void CalcResult();
        void inputNumberZero();
    }
}
