package org.example.proxy;


import javax.swing.*;

public class RealImage implements MyImage{
    private JFrame frame;
    public RealImage(String filename) {
        frame = new JFrame();
        ImageIcon icon = new ImageIcon(filename);
        JLabel label = new JLabel(icon);
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
    }
    @Override
    public void display() {
        frame.setVisible(true);
    }
}