package p14;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;

public class Praktijkopdracht extends Applet {

    int aantal_blokken = 23,
            aantal_Speler = 0,
            aantal_Computer = 0;
    Label tekstvakLabel = new Label("Hoeveel blokjes neem je (één, twee of drie)?");
    TextField tekstvak = new TextField("", 5);
    Button startKnop = new Button("Start spel"),
            speelKnop = new Button("Speel"),
            nieuwSpelKnop = new Button("Opnieuw");
    String regel1 = "",
            regel2 = "",
            regel3 = "";

    private Image afbeelding;
    private URL pad;

    public void init() {
// Om het spel te starten
        startKnop.addActionListener(new StartKnopListener());
        add(startKnop);
    }

    public void paint(Graphics g) {
        int x = 10;
        int y = 130;

        g.drawString(regel1, 10, 40);
        g.drawString(regel2, 10, 60);
        g.drawString(regel3, 10, 80);

        for (int i = 0; i < aantal_blokken; i++) {
            if (i == 7 || i == 14 || i == 21) {
                x = 10;
                y += 35;
            }
            g.drawImage(afbeelding, x, y, 30, 30, this);
            x += 35;
        }
    }

    // Spel wordt gestart \\
    class StartKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {


            pad = Afbeelding.class.getResource("/resources/");
            afbeelding = getImage(pad, "Magma_Block.png");

            remove(startKnop);

            add(tekstvakLabel);
            add(tekstvak);

            // Speel Knop wordt pas gebruikt wanneer er op de Start Knop is gedrukt.
            speelKnop.addActionListener(new SpeelKnopListener());
            add(speelKnop);

            // Toegevoegde knoppen worden zichtbaar
            setSize(401, 300);
            setSize(400, 300);
        }
    }


    private void computerZet() {

        double RandomGetal = Math.random();
        int random = (int) (RandomGetal * 3 + 1);

        if (aantal_blokken > 21) {
            aantal_Computer = aantal_blokken - 21;
        } else if (aantal_blokken == 21) {
            aantal_Computer = random;
        } else if (aantal_blokken > 17) {
            aantal_Computer = aantal_blokken -17;
        } else if (aantal_blokken == 17) {
            aantal_Computer = random;
        } else if (aantal_blokken > 13) {
            aantal_Computer = aantal_blokken -13;
        } else if (aantal_blokken == 13) {
            aantal_Computer = random;
        }else if (aantal_blokken > 9) {
            aantal_Computer = aantal_blokken -9;
        } else if (aantal_blokken == 9) {
            aantal_Computer = random;
        }else if (aantal_blokken > 5) {
            aantal_Computer = aantal_blokken -5;
        } else if (aantal_blokken == 5) {
            aantal_Computer = random;
        }else if (aantal_blokken > 1) {
            aantal_Computer = aantal_blokken -1;
        } else if (aantal_blokken == 1) {
            aantal_Computer = random;
        }

        aantal_blokken = aantal_blokken - aantal_Computer;
    }

    // Spel Berekeningen \\
    class SpeelKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            aantal_Speler = Integer.parseInt(tekstvak.getText());


            if (aantal_Speler > 0 && aantal_Speler < 4) {
                aantal_blokken = (aantal_blokken - aantal_Speler);

                if (aantal_blokken <= 0) {
                    regel1 = "je hebt verloren!";
                    remove(tekstvakLabel);
                    remove(tekstvak);
                    remove(speelKnop);

                    // Nieuwe Spel Knop wordt pas gebruikt wanneer het spel is geeïndigd.
                    nieuwSpelKnop.addActionListener(new NieuwSpelKnopListener());
                    add(nieuwSpelKnop);

                    // Toegevoegde knoppen worden zichtbaar
                    setSize(401, 300);
                    setSize(400, 300);
                    regel2 = "";
                    regel3 = "";

                } else if (aantal_blokken == 1) {
                    regel1 = "Je hebt gewonnen!";
                    remove(tekstvakLabel);
                    remove(tekstvak);
                    remove(speelKnop);


                    nieuwSpelKnop.addActionListener(new NieuwSpelKnopListener());
                    add(nieuwSpelKnop);

                    // Toegevoegde knoppen worden zichtbaar
                    setSize(401, 300);
                    setSize(400, 300);
                    regel2 = "";
                    regel3 = "";
                } else {
                    computerZet();
                    regel1 = "De computer heeft " + aantal_Computer + " blokken weggehaald.";
                    regel2 = "Aantal blokken: " + aantal_blokken + ". Jouw beurt.";
                    regel3 = "Je had hiervoor " + aantal_Speler + " blokken weggehaald";
                }
            }
            // Einde spel
            else {
                regel2 = "";
                regel3 = "";
                regel1 = "Onjuiste invoer";
            }
            repaint();
        }
    }

    // Nieuwe Spel \\
    class NieuwSpelKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            regel1 = "";
            regel2 = "";
            regel3 = "";

            aantal_blokken = 23;

            add(tekstvakLabel);
            add(tekstvak);
            add(speelKnop);
            remove(nieuwSpelKnop);

            // Toegevoegde knoppen worden zichtbaar
            setSize(401, 300);
            setSize(400, 300);

            repaint();
        }
    }
}
