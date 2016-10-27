package p11;

import java.awt.*;
import java.applet.*;


public class Opdracht113 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        int teller = 3;
        int y = 0;

        do {
            y += 20;
            g.drawLine(50, y, 300, y);
            g.drawString("" + teller, 305, y);
            teller ++;
            teller ++;
        } while (teller < 22);
    }
}
