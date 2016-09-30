package p8;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Opdracht802 extends Applet {

    TextField Tekstvakje;
    Button knop1;
    Button knop2;
    Button knop3;
    Button knop4;

    TextField g1;
    TextField g2;
    TextField g3;
    TextField g4;

    int getal1;
    int getal2;
    int getal3;
    int getal4;


    public void init() {


        g1 = new TextField("");
        add(g1);
        knop1 = new Button("Mannen");
        add(knop1);
        Knop1Listener kl = new Knop1Listener();
        knop1.addActionListener(kl);

        g2 = new TextField("");
        add(g2);
        knop2 = new Button("Vrouwen");
        add(knop2);
        Knop2Listener k2 = new Knop2Listener();
        knop2.addActionListener(k2);


        g3 = new TextField("");
        add(g3);
        knop3 = new Button("Potentiële Mannen");
        add(knop3);
        Knop3Listener k3l = new Knop3Listener();
        knop3.addActionListener(k3l);

        g4 = new TextField("");
        add(g4);
        knop4 = new Button("Potentiële Vrouwen");
        add(knop4);
        Knop4Listener k4l = new Knop4Listener();
        knop4.addActionListener(k4l);

    }

    public void paint(Graphics g) {
    }
    class Knop1Listener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            getal1 = getal1 + 1;
            g1.setText("" + getal1);
        }
    }
    class Knop2Listener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            getal2 = getal2 + 1;
            g2.setText("" + getal2);
        }
    }
    class Knop3Listener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            getal3 = getal3 + 1;
            g3.setText("" + getal3);
        }
    }
        class Knop4Listener implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                getal4 = getal4 + 1;
                g4.setText("" + getal4);
            }
        }
    }

