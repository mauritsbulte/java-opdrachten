package p4;
import java.awt.*;
import java.applet.*;

public class Opdracht406 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.BLUE);


        g.setColor(Color.BLACK);
        g.fillRect(140,0,120,220);
        g.drawRect(140,0,120,220);

        g.fillRect(160,220,80,80);

        g.setColor(Color.RED);
        g.fillOval(180,30,40,40);
        g.setColor(Color.ORANGE);
        g.fillOval(180,80,40,40);
        g.setColor(Color.GREEN);
        g.fillOval(180,130,40,40);
}
}
