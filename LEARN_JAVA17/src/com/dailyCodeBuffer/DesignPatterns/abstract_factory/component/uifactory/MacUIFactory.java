package com.dailyCodeBuffer.DesignPatterns.abstract_factory.component.uifactory;

import com.dailyCodeBuffer.DesignPatterns.abstract_factory.component.Button;
import com.dailyCodeBuffer.DesignPatterns.abstract_factory.component.CheckBox;
import com.dailyCodeBuffer.DesignPatterns.abstract_factory.component.os.mac.MacButton;
import com.dailyCodeBuffer.DesignPatterns.abstract_factory.component.os.mac.MacCheckBox;

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
