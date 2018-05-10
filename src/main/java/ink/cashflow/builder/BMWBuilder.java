package ink.cashflow.builder;

import java.util.ArrayList;

public class BMWBuilder extends CarBuilder {

    private BMWModel model = new BMWModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.model.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.model;
    }

}
