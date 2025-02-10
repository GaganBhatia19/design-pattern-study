package com.company.AbstractFactory;

public class UIApplication {
    private Button button;
    private Checkbox checkbox;
    UIApplication() {}
    // pass the factory
    UIApplication(GUIFactory guiFactory) {
        button = guiFactory.createButton();
        checkbox = guiFactory.createCheckbox();
    }
    public void renderUI() {
        button.showButton();
        checkbox.showCheckbox();
    }
}
