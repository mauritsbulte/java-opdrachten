package p4;

import java.awt.*;
import java.applet.*;

public class Opdracht402 extends Applet{

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);

        g.drawRect(80, 40, 150, 150);



        g.drawRect(90, 60, 40, 40);


        g.drawRect(180, 60, 40, 40);


        g.drawRect(140, 150, 40, 40);

    }
}
