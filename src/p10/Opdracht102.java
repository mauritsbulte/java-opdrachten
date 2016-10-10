package p10;
import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Opdracht102 extends Applet {
    TextField Tekstvak1;
    TextField Tekstvak2;

    Button knoptekstvak1;
    Button knoptekstvak2;


    double getaltekstvak1;
    double getaltekstvak2;

    public void init() {

        Tekstvak1 = new TextField("", 15);
        add(Tekstvak1);

        Tekstvak2 = new TextField("", 15);
        add(Tekstvak2);

        knoptekstvak1 = new Button("Vergelijk met elkaar");
        add(knoptekstvak1);
        knoptekstvak1listener kli = new knoptekstvak1listener();
        knoptekstvak1.addActionListener(kli);


    }

    public void paint(Graphics g) {
        g.drawString("" + getaltekstvak1 + " is groter dan " + getaltekstvak2 + ": " + (getaltekstvak1 > getaltekstvak2), 50, 60);
        g.drawString("" + getaltekstvak2 + " is kleiner dan " + getaltekstvak1 + ": " + (getaltekstvak2 < getaltekstvak1), 50, 80);

    }

    class knoptekstvak1listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            getaltekstvak1 = Double.parseDouble(Tekstvak1.getText());
            getaltekstvak2 = Double.parseDouble(Tekstvak2.getText());
            Tekstvak1.setText("" + getaltekstvak1);
            Tekstvak2.setText("" + getaltekstvak2);
            repaint();
        }
    }
}
