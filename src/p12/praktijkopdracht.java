package p12;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class praktijkopdracht extends Applet {

    Button Knop;
    Label[] labelnaam;
    Label[]telefoonlabel;
    TextField[] tekstvaknaam;
    TextField[] telefoontekstvak;
    int teller = 0;
    int nummer = 1;
    int sizeHeight = 150;

    public void init() {

        labelnaam = new Label[10];
        tekstvaknaam = new TextField[10];
        telefoonlabel = new Label[10];
        telefoontekstvak = new TextField[10];

        Knop = new Button("Ok");
        Knop.addActionListener(new KnopListener());
        add(Knop);
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            if (teller < tekstvaknaam.length) {
                labelnaam[teller] = new Label("Naam " + nummer + " : ");
                add(labelnaam[teller]);

                tekstvaknaam[teller] = new TextField("",10);
                add(tekstvaknaam[teller]);

                telefoonlabel[teller] = new Label("Telefoonnummer " + nummer + " : ");
                add(telefoonlabel[teller]);

                telefoontekstvak[teller] = new TextField("",10);
                add(telefoontekstvak[teller]);

                teller++;
                nummer++;

                setSize(200,sizeHeight);
                sizeHeight = sizeHeight + 80;
            }
        }
    }
}