package p4;
import java.awt.*;
import java.applet.*;

public class Opdracht403 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.DARK_GRAY);
        g.setColor(Color.yellow);


        g.setColor(Color.white);
        g.fillRect(20, 140, 40, 160);

        g.setColor(Color.RED);
        g.fillRect(20, 20,160, 40);

        g.setColor(Color.white);
        g.fillRect(20, 60, 160, 40);

        g.setColor(Color.blue);
        g.fillRect(20, 100, 160, 40);
    }
}
