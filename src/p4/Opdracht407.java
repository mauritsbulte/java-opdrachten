package p4;
import java.awt.*;
import java.applet.*;

public class Opdracht407 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.BLUE);


        g.setColor(Color.BLACK);
        g.drawRect(120, 90, 150, 150);
        g.setColor(Color.white);
        g.fillRect(120, 90, 150, 150);
        g.setColor(Color.BLACK);

        g.drawOval(220, 200, 30, 30);
        g.fillOval(220, 200, 30, 30);

        g.drawOval(140, 200, 30, 30);
        g.fillOval(140, 200, 30, 30);

        g.drawOval(140, 100, 30, 30);
        g.fillOval(140, 100, 30, 30);

        g.drawOval(220, 100, 30, 30);
        g.fillOval(220, 100, 30, 30);
    }
}