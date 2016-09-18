package p5  ;
import java.awt.*;
import java.applet.*;

public class Opdracht5 extends Applet {

    public void init() {
    }
    int x = 150;
    int y = 70;
    int A = 160;
    int B = 10;
    int C = 100;
    public void paint (Graphics g)
    {
        setBackground(Color.WHITE);
        g.setColor(Color.BLACK);
        g.drawLine(10, 10, A, B);

        g.drawRect(10, 30, x, y);

        g.setColor(Color.magenta);

        g.drawOval(200, 120, x, y);
        g.fillOval(200, 120, x, y);

        g.fillRect(200, 30, x, y);

        g.fillArc(370, 30, x, y, 0, 45);

        g.setColor(Color.black);

        g.drawOval(200, 30, x, y);

        g.drawRoundRect(10, 120, x, y, 10, 10);

        g.drawOval(390, 110, C, C);

        g.drawOval(370, 30, x, y);

        g.fillArc(370, 30, x, y, 0, 45);
        setBackground(Color.WHITE);

    }
}