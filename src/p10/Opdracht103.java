package p10;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Opdracht103 extends Applet {
    TextField tekstvak;
    Label label;
    String s, tekst;
    int dag;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type het maandnummer en druk op enter");
        tekstvak.addActionListener(new TekstvakListener());
        tekst = "";
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 80);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            dag = Integer.parseInt(s);
            switch (dag) {
                case 1:
                    tekst = "Januari heeft 31 dagen";
                    break;

                case 2:
                    tekst = "Februari heeft 28 dagen";
                    break;

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
