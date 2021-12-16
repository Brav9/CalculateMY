package com.hfad.caclulatormy;

import android.widget.TextView;

public class Presenter implements IContact.IPresenter {
    float valueNumberOne;
    float valueNumberTwo;

    IContact.IView myMVPView;
    IContact.IModel myMVPModel;

    public Presenter(IContact.IView myMVPView) {
        this.myMVPView = myMVPView;
        this.myMVPModel = new Model();
    }

    @Override
        public void onButtonWasClicked(TextView tvMathExpression) {
        String numberZero = myMVPModel.inputNumberZero();
        myMVPView.showResult(numberZero);
    }

    // String resCalculated = myMVPModel.calculate();
    //   myMVPView.showResult(resCalculated);
    //  try {
//
    //  } catch (NullPointerException exception) {
    //   }
}



