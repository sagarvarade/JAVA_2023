package demo.component.uifactory;

import demo.component.Button;
import demo.component.CheckBox;
import demo.component.os.mac.MacButton;
import demo.component.os.mac.MacCheckBox;

public class MacUIFactory implements UIFactory {
    public Button createButton() {
        return new MacButton();
    }

    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
}
