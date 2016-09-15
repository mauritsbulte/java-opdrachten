package p4;
import java.awt.*;
import java.applet.*;

public class Opdracht405 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.DARK_GRAY);
        g.setColor(Color.yellow);


        g.setColor(Color.BLACK);
        g.drawOval(150, 250, 10, 10);
        g.fillOval(150, 250, 10, 10);

        g.drawOval(120, 250, 10, 10);
        g.fillOval(120, 250, 10, 10);

        g.drawOval(120, 280, 10, 10);
        g.fillOval(120, 280, 10, 10);

        g.drawOval(150, 280, 10, 10);
        g.fillOval(150, 280, 10, 10);
    }
}


