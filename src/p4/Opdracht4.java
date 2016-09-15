package p4;
import java.awt.*;
import java.applet.*;

public class Opdracht4 extends Applet{

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.DARK_GRAY);
        g.setColor(Color.yellow);

        g.drawLine(70, 120, 150, 120);
        g.drawLine(70, 120, 130, 240);
        g.drawLine(150, 120, 130, 240);
    }
}