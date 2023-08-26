package com.dailyCodeBuffer.DesignPatterns.abstract_factory.component.uifactory;

import com.dailyCodeBuffer.DesignPatterns.abstract_factory.component.Button;
import com.dailyCodeBuffer.DesignPatterns.abstract_factory.component.CheckBox;

public interface UIFactory {
    Button createButton();
    CheckBox createCheckBox();
}
