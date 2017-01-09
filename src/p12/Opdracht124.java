package p12;

/**
 * Created by Gebruiker on 24-11-2016.
 */
import java.awt.*;
import java.applet.*;

public class Opdracht124 extends Applet {
    double[] salaris = { 100.0, 200.0, 500.0, 400.0, 300.0 };
    double maximum;
    double zoek;

    public void init() {
        zoek = 400;
        maximum = salaris[0];
        for (int teller = 0; teller < salaris.length; teller ++) {
            if(salaris[teller] == zoek) {
                maximum = salaris[teller];
            }
        }
    }

    public void paint(Graphics g)  {
        g.drawString("gevonden: " + maximum, 50, 20);
    }
}
