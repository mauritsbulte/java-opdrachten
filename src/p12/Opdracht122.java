package p12;

import java.awt.*;
import java.applet.*;


public class Opdracht122 extends Applet {
    double[] salaris;

    Button knop;



    public void init() {
        salaris = new double[5];



        for (int teller = 0; teller < 101; teller++) {
            knop = new Button("klik");
            add(knop);
        }
    }

    public void paint(Graphics g) {
        repaint();
    }
}