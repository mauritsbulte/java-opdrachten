package p8;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht2h8 extends Applet{
    int begin;
    Color opvulkleur;
    Color lijnkleur;

    TextField Valerievak, Hansvak, Jeroenvak;

    int valerie, hoogteyvaleriey1, hoogteyvaleriey2, staafGrootteValerie;

    int jeroen, hoogteJeroeny1, hoogteJeroeny2, staafGrootteJeroen;

    int hans, hoogteHansy1, hoogteHansy2, staafGrootteHans;

    int Valeriewaarde, Hanswaarde, Jeroenwaarde;
    Button Waardeknop;


    int base = 250;

    public void init() {
        opvulkleur = Color.WHITE;
        lijnkleur = Color.RED;

        Waardeknop = new Button("Wijzig Waarde");
        add(Waardeknop);
        Wklistener wk = new Wklistener();
        Waardeknop.addActionListener(wk);

        Valerievak = new TextField("");
        add(Valerievak);

        Jeroenvak = new TextField("");
        add(Jeroenvak);

        Hansvak = new TextField("");
        add(Hansvak);
    }

    public void paint(Graphics g) {
        setBackground(opvulkleur);
        g.setColor(lijnkleur);


        valerie = Valeriewaarde;
        hans = Hanswaarde;
        jeroen = Jeroenwaarde;
        begin = 250;


        staafGrootteValerie = valerie * 2;
        hoogteyvaleriey2 = staafGrootteValerie;
        hoogteyvaleriey1 = begin - hoogteyvaleriey2;

        staafGrootteJeroen = jeroen * 2;
        hoogteJeroeny2 = staafGrootteJeroen;
        hoogteJeroeny1 = begin - hoogteJeroeny2;

        staafGrootteHans = hans * 2;
        hoogteHansy2 = staafGrootteHans;
        hoogteHansy1 = begin - hoogteHansy2;

        g.drawLine(70, base, 140, base);


        g.drawString("Valerie", 50, 270);
        g.fillRect(80, hoogteyvaleriey1, 10, hoogteyvaleriey2);


        g.drawString("Jeroen", 90, 270);
        g.fillRect(100, hoogteJeroeny1, 10, hoogteJeroeny2);


        g.drawString("Hans", 130, 270);
        g.fillRect(120, hoogteHansy1, 10, hoogteHansy2);
        g.drawString("Gewicht in kilo", 60, 40);
        g.drawString("100", 60, 60);

        g.drawString("80", 60, 90);

        g.drawString("60", 60, 135);

        g.drawString("40", 60, 180);

        g.drawString("20", 60, 220);

        g.drawString("0", 60, 250);

    }

        class Wklistener implements ActionListener {

            public void actionPerformed(ActionEvent e) {
            Valeriewaarde = Integer.parseInt(Valerievak.getText());
                Jeroenwaarde = Integer.parseInt(Jeroenvak.getText());
                Hanswaarde = Integer.parseInt(Hansvak.getText());

                repaint();
        }
    }
}
