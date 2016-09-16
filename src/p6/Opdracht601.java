package p6;
import java.awt.*;
import java.applet.*;


public class Opdracht601 extends Applet {
    int a;
    double b;
    double c;
    double uitkomst;

    public void init() {
        b = 113;
        c = 4;
        uitkomst = b / c;
    }

    public void paint(Graphics g) {
        g.drawString("Jan: " + uitkomst, 20, 20);
        g.drawString("Ali: " + uitkomst, 20, 40);
        g.drawString("Jeannette: " + uitkomst, 20, 60);
        g.drawString("Maurits: " + uitkomst, 20, 80);
    }
}
