package com.hfad.caclulatormy;

import android.widget.TextView;

public class Presenter implements IContact.IPresenter {
    TextView tvMathExpression;
    IContact.IView myMVPView;
    IContact.IModel myMVPModel;

    public Presenter(IContact.IView myMVPView) {
        this.myMVPView = myMVPView;
        this.myMVPModel = new Model();
    }

    @Override
    public void CalcResult() {

    }

    @Override
    public void inputNumberZero() {
        tvMathExpression.setText(tvMathExpression.getText() + "0");
    }
}
