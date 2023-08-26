package com.dailyCodeBuffer.DesignPatterns.abstract_factory.component.os.win;

import com.dailyCodeBuffer.DesignPatterns.abstract_factory.component.CheckBox;

public class WinCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("Win Checkbox");
    }
}
