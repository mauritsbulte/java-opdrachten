package p10;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Graphics;

public class Javatoets extends Applet {
     TextField tekstvak;
     int tokio;
     int galapagos;
     int london;
     int sintpetersburg;

    public void init() {
        Button knop = new Button("Toon tijden");
        tekstvak = new TextField("", 10);
        Knoplistener kl = new Knoplistener();
        knop.addActionListener(kl);
        add(tekstvak);
        add(knop);
    }
    public void paint(Graphics g) {
        setSize(700, 200);
        super.paint(g);
        int x = 50;
        int y = 70;
        g.drawString("Voer een uur in", 170, 20 );

        g.drawString("Tijd in Tokio:" + tokio + ":00", x, y);
        y = y + 20;
        g.drawString("Tijd in Galapagos:" + galapagos + ":00", x, y);
        y = y + 20;
        g.drawString("Tijd in London:" + london  + ":00", x, y);
        y = y + 20;
        g.drawString("Tijd in Sint petersburg:" + sintpetersburg + ":00", x, y);

    }
    private class Knoplistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String getalstring = tekstvak.getText();
            int tijd = Integer.parseInt(getalstring);
            if (tijd == 25);
            tokio = tijd + 7;
            if (tijd > 16) {
                tokio = tijd - 17;
            }
            galapagos = tijd - 7;
            if (tijd < 1) {
                galapagos = tijd - 7;
            }
            london = tijd - 1;
            if (tijd < 1) {
                london = tijd + 23;
            }
            sintpetersburg = tijd + 2;
            if (tijd > 21) {
                sintpetersburg = tijd - 21;

            }
            repaint();
        }
    }
}

