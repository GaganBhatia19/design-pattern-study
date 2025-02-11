package com.company.Proxy;

public class ProxyMain {
    public static void run() {
        RealImageProxy realImageProxy = new RealImageProxy("photo1");
        RealImageProxy realImageProxy2 = new RealImageProxy("photo2");

        realImageProxy.display();
        realImageProxy2.display();
        realImageProxy.display();// notice the second time when used it will not run load() method
    }
}
