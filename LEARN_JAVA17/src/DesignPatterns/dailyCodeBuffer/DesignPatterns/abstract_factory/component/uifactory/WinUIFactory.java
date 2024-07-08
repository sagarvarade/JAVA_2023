package DesignPatterns.dailyCodeBuffer.DesignPatterns.abstract_factory.component.uifactory;

import DesignPatterns.dailyCodeBuffer.DesignPatterns.abstract_factory.component.Button;
import DesignPatterns.dailyCodeBuffer.DesignPatterns.abstract_factory.component.CheckBox;
import DesignPatterns.dailyCodeBuffer.DesignPatterns.abstract_factory.component.os.win.WinButton;
import DesignPatterns.dailyCodeBuffer.DesignPatterns.abstract_factory.component.os.win.WinCheckBox;

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
