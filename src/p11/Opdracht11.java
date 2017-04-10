package p11;

import java.awt.*;
import java.applet.*;


public class Opdracht11 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int y = 0;
        g.drawRect(25,25,25,25);
        g.drawRect(50,25,25,25);
        for(teller = 0; teller < 11; teller++) {
            y += 20;
            g.drawLine(50 , y, 300, y );
            g.drawString("" + teller, 305, y );
        }
    }
}