package DesignPatterns.dailyCodeBuffer.DesignPatterns.abstract_factory.component.uifactory;

import DesignPatterns.dailyCodeBuffer.DesignPatterns.abstract_factory.component.Button;
import DesignPatterns.dailyCodeBuffer.DesignPatterns.abstract_factory.component.CheckBox;

public interface UIFactory {
    Button createButton();
    CheckBox createCheckBox();
}
