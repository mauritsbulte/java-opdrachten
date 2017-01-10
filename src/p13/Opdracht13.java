package p13;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht13 extends Applet {
    Button rodeKnop ,blauweKnop, groeneKnop, geleKnop, oranjeKnop;
    double gem;
    String roodstring, blauwstring, groenstring, geelstring, oranjestring;
    Color rood, blauw, groen, geel, oranje;

    public void init() {


        rodeKnop = new Button("Rood");
        add(rodeKnop);
        rodeKnoplistener rkl = new rodeKnoplistener();
        rodeKnop.addActionListener(rkl);

        blauweKnop = new Button("Blauw");
        add(blauweKnop);
        blauweKnoplistener bkl = new blauweKnoplistener();
        blauweKnop.addActionListener(bkl);

        groeneKnop = new Button("Groen");
        add(groeneKnop);
        groeneKnoplistener gkl = new groeneKnoplistener();
        groeneKnop.addActionListener(gkl);

        geleKnop = new Button("Geel");
        add(geleKnop);
        geleKnoplistener glkl = new geleKnoplistener();
        geleKnop.addActionListener(glkl);

        oranjeKnop = new Button("Oranje");
        add(oranjeKnop);

        oranjeKnoplistener okl = new oranjeKnoplistener();
        oranjeKnop.addActionListener(okl);



    }

    public void paint(Graphics g) {
        rood = Color.red;
        blauw = Color.blue;
        groen = Color.green;
        geel = Color.yellow;
        oranje = Color.orange;

    }

    class rodeKnoplistener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
        rodeKnop.setBackground(rood);
            getGraphics().drawString("rood", 50, 100);

        }

    }

    class blauweKnoplistener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            blauweKnop.setBackground(blauw);
            getGraphics().drawString("blauw", 50, 120);
            getGraphics().setColor(blauw);


        }
    }

    class groeneKnoplistener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            groeneKnop.setBackground(groen);
            getGraphics().drawString("groen", 50, 140);

        }
    }

    class geleKnoplistener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            geleKnop.setBackground(geel);

            getGraphics().drawString("geel", 50, 160);

        }
    }

    class oranjeKnoplistener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            oranjeKnop.setBackground(oranje);
            getGraphics().drawString("oranje", 50, 180);
        }
    }
}
