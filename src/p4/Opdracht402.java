package p4;

import java.awt.*;
import java.applet.*;

public class Opdracht402 extends Applet{

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.DARK_GRAY);
        g.setColor(Color.yellow);

        g.drawRect(300, 40, 90, 90);
        g.fillRect(300, 40, 90, 90);

        g.setColor(Color.magenta);
        g.drawRect(310, 60, 20, 20);
        g.fillRect(310, 60, 20, 20);

        g.drawRect(360, 60, 20, 20);
        g.fillRect(360, 60, 20, 20);

        g.drawRect(335, 100, 20, 30);
        g.fillRect(335, 100, 20, 30);
    }
}
