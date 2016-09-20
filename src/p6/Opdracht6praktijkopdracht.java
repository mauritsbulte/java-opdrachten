package p6;
import java.awt.*;
import java.applet.*;

public class Opdracht6praktijkopdracht extends Applet {
    double a;
    double b;
    double c;
    double antwoord;
    double afgerondantwoord;
    double keerantwoord;
    int antwoordvanint;
    double doubleantwoord;
    double totaalantwoord;



    public void init() {
        a = 5.9;
        b = 6.3;
        c = 6.9;
        antwoord = a + b + c;

        afgerondantwoord = antwoord /= 3;

        keerantwoord = afgerondantwoord * 10;

        antwoordvanint = (int)  keerantwoord;

        doubleantwoord = antwoordvanint;

        totaalantwoord = doubleantwoord / 10;



    }

    public void paint(Graphics g) {
        super.paint(g);

        g.drawString("antwoord, = " + totaalantwoord, 220, 200);
}
}