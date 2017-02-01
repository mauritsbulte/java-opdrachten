package p13;
import java.awt.Color;
import java.awt.Graphics;
import java.applet.Applet;

public class Opdracht133 extends Applet {

    int BeginX = 0;
    int BeginY = 40;
    int wijdte = 50;
    int hoogte = 20;
    int ruimte = 2;

    public void init() {
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        for (int rij = 0; rij < 8; rij++) {
            int y = BeginY + (rij * (hoogte + ruimte));
            for (int kolom = 0; kolom < 8; kolom++) {
                int x = BeginX + (kolom * (wijdte + ruimte));

                g.setColor(Color.RED);
                g.fillRect(x, y, wijdte, hoogte);
            }
        }
    }
}