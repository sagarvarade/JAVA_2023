package com.dailyCodeBuffer.DesignPatterns.abstract_factory.component.os.mac;

import com.dailyCodeBuffer.DesignPatterns.abstract_factory.component.Button;

public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("Mac Button");
    }
}
