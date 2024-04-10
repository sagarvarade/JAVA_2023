package demo.component.uifactory;

import demo.component.Button;
import demo.component.CheckBox;
import demo.component.os.win.WinButton;
import demo.component.os.win.WinCheckBox;

public class WinUIFactory implements UIFactory {
    public Button createButton() {
        return new WinButton();
    }

    public CheckBox createCheckBox() {
        return new WinCheckBox();
    }
}
