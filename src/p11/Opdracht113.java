package p11;

import java.awt.*;
import java.applet.*;


public class Opdracht113 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        int teller = 0;
        int getal1;
        int y = 0;
        do {
            y += 20;
            getal1 = teller + teller + teller + teller;

            g.drawString("" + getal1, 305, y);
            teller++;
        } while (teller < 20);
    }
}
