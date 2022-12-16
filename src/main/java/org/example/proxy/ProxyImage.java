package org.example.proxy;

import javax.swing.JFrame;


public class ProxyImage implements MyImage{
    private JFrame frame;
    private String fileName;
    private RealImage realImage;

    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
