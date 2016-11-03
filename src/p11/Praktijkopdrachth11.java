package p11;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdrachth11 extends Applet {
    Button knop;
    TextField tekstvakkie;
    int s;

    public void init() {
        tekstvakkie = new TextField("", 30);
        knop = new Button("ok");
        knop.addActionListener(new TekstvakListener());
        add(tekstvakkie);
        add(knop);
    }

    public void paint(Graphics g) {
        int teller;
        int antwoord;
        int y = 20;

        for (teller = 1; teller < 11; teller++) {
            antwoord = s * teller;
            y += 20;
            g.drawString(teller + " x " + s +  " = " + antwoord, 115, y);

        }
    }
    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = (int) Double.parseDouble(tekstvakkie.getText());
            repaint();
        }
    }
}