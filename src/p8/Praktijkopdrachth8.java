package p8;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Praktijkopdrachth8 extends Applet {

    TextField vak1;
    TextField vak2;
    Button keerKnop;
    Button deelKnop;
    Button minKnop;
    Button plusKnop;


    double getal1;
    double getal2;
    double uitkomst;

    @Override
    public void init() {
        super.init();
        vak1 = new TextField("", 15);
        add(vak1);

        vak2 = new TextField("", 15);
        add(vak2);

        keerKnop = new Button("X");
        add(keerKnop);
        KeerKnopListener kkl = new KeerKnopListener();
        keerKnop.addActionListener(kkl);

        deelKnop = new Button("/");
        DeelKnopListener dkl = new DeelKnopListener();
        deelKnop.addActionListener(dkl);
        add(deelKnop);

        minKnop = new Button("-");
        MinKnopListener mkl = new MinKnopListener();
        minKnop.addActionListener(mkl);
        add(minKnop);

       plusKnop = new Button("+");
        PlusKnopListener pkl = new PlusKnopListener();
        plusKnop.addActionListener(pkl);
        add(plusKnop);
    }

    class KeerKnopListener implements ActionListener

    {
        public void actionPerformed(ActionEvent e) {
            getal1 = Double.parseDouble(vak1.getText());
            getal2 = Double.parseDouble(vak2.getText());
            uitkomst = getal1 * getal2;
            vak1.setText("" + uitkomst);
            vak2.setText("");
        }
    }

    class DeelKnopListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            getal1 = Double.parseDouble(vak1.getText());
            getal2 = Double.parseDouble(vak2.getText());
            uitkomst = getal1 / getal2;
            vak1.setText("" + uitkomst);
            vak2.setText("");
        }
    }


    class MinKnopListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            getal1 = Double.parseDouble(vak1.getText());
            getal2 = Double.parseDouble(vak2.getText());
            uitkomst = getal1 - getal2;
            vak1.setText("" + uitkomst);
            vak2.setText("");
        }
    }


class PlusKnopListener implements ActionListener {

    public void actionPerformed(ActionEvent e) {

        getal1 = Double.parseDouble(vak1.getText());
        getal2 = Double.parseDouble(vak2.getText());
        uitkomst = getal1 + getal2;
        vak1.setText("" + uitkomst);
        vak2.setText("");
    }
}
}






