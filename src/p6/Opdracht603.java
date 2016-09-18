package p6;
import java.awt.*;
import java.applet.*;


public class Opdracht603 extends Applet {
    int a;
    int b;
    int c;
    int uitkomst;


    public void init() {
        a = 20;
        b = 15;
        c = 15;
        uitkomst = a - (b + c);

    }
    public void paint(Graphics g) {
        g.drawString("Uitkomst: " + uitkomst, 20, 20);
    }
}
