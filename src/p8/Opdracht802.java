package p8;

import java.awt.*;
import java.applet.*;



public class Opdracht802 extends Applet {

    TextField Tekstvakje;
    Button knop1;
    Button knop2;
    Button knop3;
    Button knop4;

    int getal1;
    int getal2;
    int getal3;
    int getal4;
    int uitkomst;

    Label LabelMannen;
    Label LabelVrouwen;
    Label LabelPotentiëleMannen;
    Label LabelPotentiëleVrouwen;
    @Override
    public void init() {
        super.init();

        add(knop1);
        LabelMannen = new Label("Mannen", 20);
        knop1 = new Button("Mannen");
        getal1 = getal1 + 1;
        add(LabelMannen);

        add(knop2);
        LabelVrouwen = new Label("Vrouwen");
        knop2 = new Button("Vrouwen");
        getal2 = getal2 + 1;
        add(LabelVrouwen);

        add(knop3);
        LabelPotentiëleMannen = new Label("Potentiële Mannen");
        knop3 = new Button("Potentiële Mannen");
        getal3 = getal3 + 1;
        add(LabelPotentiëleMannen);

        add(knop4);
        LabelPotentiëleVrouwen = new Label("Potentiële Vrouwen");
        knop4 = new Button("Potentiële Vrouwen");
        getal4 = getal4 + 1;
        add(LabelPotentiëleVrouwen);
    }

    public void paint(Graphics g) {
        g.drawString("Het getal is " + getal1, 50, 60);
    }
}