package p5;

import java.awt.*;
import java.applet.*;

public class Opdracht502 extends Applet{
    int begin;
    Color opvulkleur;
    Color lijnkleur;

    int valerie, hoogteyvaleriey1, hoogteyvaleriey2, staafGrootteValerie;

    int jeroen, hoogteJeroeny1, hoogteJeroeny2, staafGrootteJeroen;

    int hans, hoogteHansy1, hoogteHansy2, staafGrootteHans;



    int base = 250;

    public void init() {
        opvulkleur = Color.WHITE;
        lijnkleur = Color.RED;

    }

    public void paint(Graphics g) {
        setBackground(opvulkleur);
        g.setColor(lijnkleur);

        valerie = 40;
        hans = 80;
        jeroen = 100;

        begin = 250;

        staafGrootteValerie = valerie *2;
        hoogteyvaleriey2 = staafGrootteValerie;
        hoogteyvaleriey1 = begin - hoogteyvaleriey2;

        staafGrootteJeroen = jeroen *2;
        hoogteJeroeny2 = staafGrootteJeroen;
        hoogteJeroeny1 = begin - hoogteJeroeny2;

        staafGrootteHans = hans *2;
        hoogteHansy2 = staafGrootteHans;
        hoogteHansy1 = begin - hoogteHansy2;

        g.drawLine(70, base, 140, base);


        g.drawString("Valerie",50, 270);
        g.fillRect(80, hoogteyvaleriey1, 10, hoogteyvaleriey2);


        g.drawString("Hans", 90, 270);
        g.fillRect(100, hoogteHansy1, 10, hoogteHansy2);


        g.drawString("Jeroen", 120, 270);
        g.fillRect(120, hoogteJeroeny1, 10, hoogteJeroeny2);
        g.drawString("Gewicht in kilo", 60, 40);
        g.drawString("100", 60, 60);

        g.drawString("80", 60, 90);

        g.drawString("60", 60, 135);

        g.drawString("40", 60, 180);

        g.drawString("20", 60, 220);

        g.drawString("0", 60, 250);
    }
}
