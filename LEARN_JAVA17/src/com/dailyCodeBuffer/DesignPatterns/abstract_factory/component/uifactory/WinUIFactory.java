package com.dailyCodeBuffer.DesignPatterns.abstract_factory.component.uifactory;

import com.dailyCodeBuffer.DesignPatterns.abstract_factory.component.Button;
import com.dailyCodeBuffer.DesignPatterns.abstract_factory.component.CheckBox;
import com.dailyCodeBuffer.DesignPatterns.abstract_factory.component.os.win.WinButton;
import com.dailyCodeBuffer.DesignPatterns.abstract_factory.component.os.win.WinCheckBox;

public class WinUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WinCheckBox();
    }
}
