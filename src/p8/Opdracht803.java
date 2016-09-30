package p8;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht803 extends Applet {
    Button btwknop;
    TextField Tekstvak1;
    double InvoerGetal;
    double KeerGetal;
    double Uitkomst;


    public void init() {
        KeerGetal = 1.21;
        Tekstvak1 = new TextField("Voer je bedrag in");
        add(Tekstvak1);
        btwknop = new Button("Bereken");
        add(btwknop);
        BtwListener bl = new BtwListener();
        btwknop.addActionListener(bl);
    }

    class BtwListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            InvoerGetal = Double.parseDouble(Tekstvak1.getText());
            Uitkomst = KeerGetal * InvoerGetal;
            Tekstvak1.setText("" + Uitkomst);

        }
    }
}