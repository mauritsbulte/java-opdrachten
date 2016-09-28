package p8;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Opdracht801 extends Applet {
    Button knop2;
    String schermtekst;
    TextField tekstvakje;
    Label label;
    public void init() {
        tekstvakje = new TextField("", 50);
        label = new Label("Type iets in het tekstvakje");
        add(label);
        add(tekstvakje);
        schermtekst = "Doet deze knop wel iets?";
        knop2 = new Button("Klik op mij");
        Knop2Listener kl = new Knop2Listener();
        knop2.addActionListener(kl);
        add(knop2);
        add(tekstvakje);
    }

    public void paint(Graphics g) {
        g.drawString(schermtekst, 50, 100);

    }

    class Knop2Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            schermtekst = tekstvakje.getText();

            repaint();
        }
    }

}