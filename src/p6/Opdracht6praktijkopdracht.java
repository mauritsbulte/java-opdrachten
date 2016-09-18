package p6;
import java.awt.*;
import java.applet.*;


public class Opdracht6praktijkopdracht extends Applet {
    double a;
    double b;
    double c;
    double d;
    int e;
    int f;
    double uitkomst;
    int uitkomst2;





    public void init() {
        a = 5.9;
        b = 6.3;
        c = 6.9;
        d = 3;
        e = 10;
        f = 63;
        uitkomst = (a + b + c) / d * e / e;
        uitkomst2 = f / e;

    }
    public void paint(Graphics g) {
        g.drawString("Uitkomst: " + uitkomst, 100, 100);
    }
}
