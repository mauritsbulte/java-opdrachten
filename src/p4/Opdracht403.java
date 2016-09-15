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
        g.fillRect(20, 260, 20, 40);

        g.setColor(Color.RED);
        g.fillRect(20, 200, 80, 20);

        g.setColor(Color.white);
        g.fillRect(20, 220, 80, 20);

        g.setColor(Color.blue);
        g.fillRect(20, 240, 80, 20);
    }
}
