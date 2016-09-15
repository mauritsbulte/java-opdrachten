package p4;

import java.awt.*;
import java.applet.*;

public class Opdracht404 extends Applet {
    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.RED);
        g.drawRect(360, 240, 10, 40);
        g.drawString("Valerie", 350, 295);
        g.fillRect(360, 240, 10, 40);

        g.drawRect(330, 200, 10, 80);
        g.drawString("Hans", 315, 295);
        g.fillRect(330, 200, 10, 80);

        g.drawRect(290, 180, 10, 100);
        g.drawString("Jeroen", 270, 295);
        g.fillRect(290, 180, 10, 100);
        g.drawString("Gewicht in kilo", 295, 170);
        g.drawString("100", 250, 190);

        g.drawString("80", 250, 210);

        g.drawString("60", 250, 230);

        g.drawString("40", 250, 250);

        g.drawString("20", 250, 270);

        g.drawString("0", 250, 285);
    }
        }