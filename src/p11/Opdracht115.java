package p11;


import java.awt.*;
import java.applet.*;


public class Opdracht115 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        int teller = 1;
        int y = 0;
        int x = 0;

        do {
            y += 20;
            x += 20;


            g.drawRect(x, y, 20, 20);
            g.drawRect(x, y, 20, 20);
            g.drawRect(x, y, 20, 20);
            g.drawRect(x, y, 20, 20);
            teller ++;
        } while (teller < 6 );
    }
}

