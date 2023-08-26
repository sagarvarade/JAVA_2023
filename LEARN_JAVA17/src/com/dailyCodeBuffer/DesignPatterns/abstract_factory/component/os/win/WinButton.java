package com.dailyCodeBuffer.DesignPatterns.abstract_factory.component.os.win;

import com.dailyCodeBuffer.DesignPatterns.abstract_factory.component.Button;

public class WinButton implements Button {
    @Override
    public void paint() {
        System.out.println("Win Button");
    }
}
