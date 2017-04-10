package p14;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Opdracht14 extends Applet {

    Button deelKaartKnop;

    // Lege string bij opstart
    String willekeurigekaarttekst = "";

    public void init() {

        // Button declaratie
        deelKaartKnop = new Button("Random kaart");
        deelKaartKnop.addActionListener(new DeelKaartKnopListener());
        add(deelKaartKnop);
    }

    public void paint(Graphics g) {

        // Positie van de string
        g.drawString(willekeurigekaarttekst, 10, 50);
    }

    // ActionListener voor Button deelKaartKnop
    class DeelKaartKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            // Arrays voor de kaart kleur en kaart nummer
            String[] kleurenStringArray = {"Schoppen ", "Harten ", "Klaver ", "Ruiten "},
                    kaartenStringArray = {"aas", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "tien", "boer", "vrouw", "heer"};

            // Random getal voor de twee arrays
            double randomKaartKleur, randomKaartNummer;

            randomKaartKleur = Math.random();
            int randomKaartKleurGetal = (int) (randomKaartKleur * 3 + 0);

            randomKaartNummer = Math.random();
            int randomKaartNummerGetal = (int) (randomKaartNummer * 13 + 0);

            // Tekst op het scherm laten verschijnen
            willekeurigekaarttekst = kleurenStringArray[randomKaartKleurGetal] + kaartenStringArray[randomKaartNummerGetal];
            repaint();
        }
    }
}
