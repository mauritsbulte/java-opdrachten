package p2;

import java.awt.*;
import java.applet.*;

public class Opdracht202 extends Applet {

    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.setColor(Color.blue);
        g.drawString("Maurits", 50, 60);
        g.setColor(Color.red);
        g.drawString("Bulte", 50, 70);
    }
}
