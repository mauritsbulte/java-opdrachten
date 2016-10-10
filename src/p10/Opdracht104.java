package p10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Opdracht104 extends Applet {
    TextField tekstvak;
    TextField tekstvak2;
    Label label;
    String tekst, tekst2;
    int dag;
    int jaartal;

    public void init() {
        setSize(700, 200);
        tekstvak = new TextField("", 20);
        tekstvak2 = new TextField("", 20);
        label = new Label("Type het jaar en maandnummer in");
        tekstvak.addActionListener(new TekstvakListener());
        tekstvak2.addActionListener(new TekstvakListener());
        tekst = "";
        tekst2 = "";
        add(label);
        add(tekstvak);
        add(tekstvak2);
    }

    public void paint(Graphics g) {
        g.drawString(tekst,  50, 80);
        g.drawString(tekst2, 50, 100);

    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            dag = Integer.parseInt(tekstvak2.getText());
            jaartal = Integer.parseInt(tekstvak.getText());
            if ((jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                    jaartal % 400 == 0) {
                tekst2 = "" + jaartal + " is een schrikkeljaar";
            } else {
                tekst2 = "" + jaartal + " is geen schrikkeljaar";
                switch (dag) {
                    case 1:
                        tekst = "Januari heeft 31 dagen";
                        break;

                    case 2:
                        if ((jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                                jaartal % 400 == 0) {
                            tekst = "Februari heeft 29 Dagen";
                        } else {
                            tekst = "Februari heeft 28 Dagen";
                            break; }

                    case 3:
                        tekst = "Maart heeft 31 dagen";
                        break;

                    case 4:
                        tekst = "April heeft 30 dagen";
                        break;
                    case 5:
                        tekst = "Mei heeft 31 dagen";
                        break;

                    case 6:
                        tekst = "Juni heeft 30 dagen";
                        break;

                    case 7:
                        tekst = "Juli heeft 31 dagen";
                        break;

                    case 8:
                        tekst = "Augustus heeft 31 dagen";
                        break;

                    case 9:
                        tekst = "September heeft 30 dagen";
                        break;

                    case 10:
                        tekst = "Oktober heeft 31 dagen";
                        break;

                    case 11:
                        tekst = "November heeft 30 dagen";
                        break;

                    case 12:
                        tekst = "December heeft 31 dagen";
                        break;

                    default:
                        tekst = "U heeft een verkeerd nummer ingetikt ..!";
                        break;
                }
                repaint();
            }
        }
    }
}