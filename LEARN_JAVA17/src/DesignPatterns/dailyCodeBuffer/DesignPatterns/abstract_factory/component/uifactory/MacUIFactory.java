package DesignPatterns.dailyCodeBuffer.DesignPatterns.abstract_factory.component.uifactory;

import DesignPatterns.dailyCodeBuffer.DesignPatterns.abstract_factory.component.Button;
import DesignPatterns.dailyCodeBuffer.DesignPatterns.abstract_factory.component.CheckBox;
import DesignPatterns.dailyCodeBuffer.DesignPatterns.abstract_factory.component.os.mac.MacButton;
import DesignPatterns.dailyCodeBuffer.DesignPatterns.abstract_factory.component.os.mac.MacCheckBox;

public class MacUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
}
