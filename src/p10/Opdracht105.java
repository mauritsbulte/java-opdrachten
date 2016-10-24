package p10;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Opdracht105 extends Applet {
    TextField  gemiddelde1Tekstvak,  gemiddelde2Tekstvak,  gemiddelde3Tekstvak;
    Label gemiddelde1Label, gemiddelde2Label, gemiddelde3Label;
    Button ok;
    String getal, beoordeling, antwoord;
    double berekening, gemiddelde, gemiddelde1, gemiddelde2, gemiddelde3;
    int afkap;

    public void init() {
        getal = "";
        beoordeling = "";
        antwoord = "";

        gemiddelde1Label = new Label("Getal1");
        add(gemiddelde1Label);
        gemiddelde1Tekstvak = new TextField("", 3);
        add(gemiddelde1Tekstvak);

        gemiddelde2Label = new Label("Getal2");
        add(gemiddelde2Label);
        gemiddelde2Tekstvak = new TextField("", 3);
        add(gemiddelde2Tekstvak);

        gemiddelde3Label = new Label("Getal3");
        add(gemiddelde3Label);
        gemiddelde3Tekstvak = new TextField("", 3);
        add(gemiddelde3Tekstvak);

        ok = new Button("Ok");
        ok.addActionListener(new DiplomaListener());
        add(ok);
    }

    public void paint(Graphics g) {
        g.drawString(getal + gemiddelde, 50, 80);
        g.drawString(beoordeling, 50, 100);
        g.drawString(antwoord, 50, 120);
    }

    class DiplomaListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            gemiddelde1 = Double.parseDouble(gemiddelde1Tekstvak.getText());
            gemiddelde2 = Double.parseDouble(gemiddelde2Tekstvak.getText());
            gemiddelde3 = Double.parseDouble(gemiddelde3Tekstvak.getText());
            berekening = (gemiddelde1 + gemiddelde2 + gemiddelde3) / 3;
            afkap = (int) (berekening * 10);
            gemiddelde = (double) afkap / 10;
            if (gemiddelde >= 5.5 && gemiddelde <= 10) {
                getal = "Gemiddeld cijfer: ";
                beoordeling = "Gemiddelde is voldoende";
                antwoord = "Leerling heeft een voldoende";
            }
            if (gemiddelde <= 5.499 && gemiddelde >= 0) {
                getal = "Gemiddeld cijfer: ";
                beoordeling = "Gemiddelde is onvoldoende";
                antwoord = "Leerling heeft een onvoldoende.";
            }
            repaint();
        }
    }
}