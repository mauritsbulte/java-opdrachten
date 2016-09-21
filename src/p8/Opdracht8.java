package p8;

import java.awt.*;
import java.applet.*;


public class Opdracht8 extends Applet {
    Button knop;
    Button knop2;
    TextField tekstvak;

    public void init() {
        knop2 = new Button();
        knop2.setLabel( "RESET" );
        add(knop2);
        tekstvak = new TextField("", 20);
        add(tekstvak);
        knop = new Button();
        knop.setLabel( "OK" );
        add(knop);

    }

    public void paint(Graphics g) {
        g.drawString("Werkt deze knop?", 50, 60 );
        g.drawString("Deze knop doet het niet", 100, 100 );
    }
}
