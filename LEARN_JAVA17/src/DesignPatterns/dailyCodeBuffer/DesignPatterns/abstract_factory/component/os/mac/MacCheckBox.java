package DesignPatterns.dailyCodeBuffer.DesignPatterns.abstract_factory.component.os.mac;

import DesignPatterns.dailyCodeBuffer.DesignPatterns.abstract_factory.component.CheckBox;

public class MacCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("Mac Checkbox");
    }
}
