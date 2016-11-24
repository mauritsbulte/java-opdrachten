package p12;
import java.awt.*;
import java.applet.*;
import java.util.stream.IntStream;

public class Opdracht12 extends Applet {
    int[] Getal = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int Somvan = IntStream.of(Getal).sum();


    public void init() {
        Somvan = Somvan / 10;
    }

    public void paint(Graphics g) {
        g.drawString("gemiddelde: " + Somvan, 50, 20);
    }
}
