package p6;
import java.awt.*;
import java.applet.*;


public class Opdracht602 extends Applet {

    double b;
    double c;
    double uitkomst;
    double d;
    double e;
    double uitkomst2;
    double f;
    double g;
    double uitkomst3;

    public void init() {
        b = 60 ;
        c = 60;
        uitkomst = b * c;
        d = 3600;
        e = 24;
        uitkomst2 = d * e;
        f = 86400;
        g = 365;
        uitkomst3 = f * g;
    }
    public void paint(Graphics g) {
        g.drawString("Seconden in een uur: " + uitkomst, 20, 20);
        g.drawString("Seconden in een dag: " + uitkomst2, 20, 40);
        g.drawString("Seconden in een jaar: " + uitkomst3, 20, 60);

    }
}
