package com.company.Proxy;

public interface Image {
    void display();
}

class RealImage implements Image{
    private String imageRef;
    RealImage(String imageRef) {
        this.imageRef = imageRef;
        loadImage(); //heavy task
    }

    @Override
    public void display() {
        System.out.println("display image + "+imageRef);
    }
    private void loadImage() {
        System.out.println("load image + " + imageRef);
    }
}

class RealImageProxy implements Image {
    private String imageRef;
    private RealImage realImage;

    RealImageProxy(String imageRef) {
        this.imageRef = imageRef;
    }
    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(imageRef);
        } // lazy initialization
        realImage.display();
    }
}