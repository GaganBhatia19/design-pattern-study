package com.company.AbstractFactory;

//Client
public class AbstractFactoryMain {
    public static void run() {
        String os = "mac";
        GUIFactory factory;
        if (os.equalsIgnoreCase("mac")) {
            factory = new MacGUIFactory();
        } else {
            factory = new WindowsGUIFactory();
        }
        UIApplication application = new UIApplication(factory);
        application.renderUI();
    }
}
