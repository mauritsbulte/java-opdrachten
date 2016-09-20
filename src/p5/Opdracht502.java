package p5;

import java.awt.*;
import java.applet.*;

public class Opdracht502 extends Applet{
    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;
    int hoogte2;
    int hoogte3;
    public void init() {
        opvulkleur = Color.WHITE;
        lijnkleur = Color.RED;
        breedte = 10;
        hoogte = 40;
        hoogte2 = 80;
        hoogte3 = 100;
    }

    public void paint(Graphics g) {
        setBackground(opvulkleur);
        g.setColor(lijnkleur);
        g.drawRect(360, 240, breedte, hoogte);
        g.drawString("Valerie",350, 295);
        g.fillRect(360, 240, breedte, hoogte);

        g.drawRect(330, 200, breedte, hoogte2);
        g.drawString("Hans", 315, 295);
        g.fillRect(330, 200, breedte, hoogte2);

        g.drawRect(290, 180, breedte, hoogte3);
        g.drawString("Jeroen", 270, 295);
        g.fillRect(290, 180, breedte, hoogte3);
        g.drawString("Gewicht in kilo", 295, 170);
        g.drawString("100", 250, 190);

        g.drawString("80", 250, 210);

        g.drawString("60", 250, 230);

        g.drawString("40", 250, 250);

        g.drawString("20", 250, 270);

        g.drawString("0", 250, 285);
    }
}
