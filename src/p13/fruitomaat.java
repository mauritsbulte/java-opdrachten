package p13;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class fruitomaat extends Applet {
    int krediet;
    double r;
    String gewonnen;
    private Image Afbeelding1, Afbeelding2, Afbeelding3;

    Button speelknop;
    Button kredietknop;

    double randomDouble1 = Math.random();
    double randomDouble2 = Math.random();
    double randomDouble3 = Math.random();

    int randomToInt1 = (int) (randomDouble1 * 20 + 1);
    int randomToInt2 = (int) (randomDouble2 * 20 + 1);
    int randomToInt3 = (int) (randomDouble3 * 20 + 1);
    AudioClip sound;


    public void init() {
        krediet = 10;
        gewonnen = "";

        speelknop = new Button("Speel");
        add(speelknop);
        speelknop.addActionListener(new speelknoplistener());


        kredietknop = new Button("Koop 10 kredieten");
        add(kredietknop);
        kredietknop.addActionListener(new KredietKnopListener());

        speelknop.setEnabled(true);
        kredietknop.setEnabled(false);

        String fruitRandom1 = "fruit_" + randomToInt1 + ".jpg";
        String fruitRandom2 = "fruit_" + randomToInt2 + ".jpg";
        String fruitRandom3 = "fruit_" + randomToInt3 + ".jpg";

        URL pad = fruitomaat.class.getResource("/Afbeeldingen/");

        Afbeelding1 = getImage(pad, fruitRandom1);
        Afbeelding2 = getImage(pad, fruitRandom2);
        Afbeelding3 = getImage(pad, fruitRandom3);

        AudioClip sound = getAudioClip(pad, "casinoknal.wav");


    }

    public void paint(Graphics g) {

        g.drawImage(Afbeelding1, 100, 40, 73, 167, this);
        g.drawImage(Afbeelding2, 170, 40, 73, 167, this);
        g.drawImage(Afbeelding3, 240, 40, 73, 167, this);
        g.drawString("krediet: " + krediet, 100, 220);
        g.drawString("" + gewonnen, 12, 275);
    }

    class speelknoplistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (Afbeelding1 == Afbeelding2 || Afbeelding2 == Afbeelding3 || Afbeelding1 == Afbeelding3) {
                gewonnen = "je hebt gewonnen 4 punten!";
                krediet += 4;
            }
            if (Afbeelding1 == Afbeelding2 && Afbeelding2 == Afbeelding3) {
                gewonnen = "je hebt gewonnen 20 punten!";
                krediet += 20;
            }

            URL pad1 = fruitomaat.class.getResource("/Afbeeldingen/");
            sound = getAudioClip(pad1, "casinoknal.wav");
            sound.play();

            double randomDouble1 = Math.random();
            double randomDouble2 = Math.random();
            double randomDouble3 = Math.random();

            int randomToInt1 = (int) (randomDouble1 * 20 + 1);
            int randomToInt2 = (int) (randomDouble2 * 20 + 1);
            int randomToInt3 = (int) (randomDouble3 * 20 + 1);

            String fruitRandom1 = "fruit_" + randomToInt1 + ".jpg";
            String fruitRandom2 = "fruit_" + randomToInt2 + ".jpg";
            String fruitRandom3 = "fruit_" + randomToInt3 + ".jpg";

            URL pad = fruitomaat.class.getResource("/Afbeeldingen/");

            Afbeelding1 = getImage(pad, fruitRandom1);
            Afbeelding2 = getImage(pad, fruitRandom2);
            Afbeelding3 = getImage(pad, fruitRandom3);


            if (krediet > 0) {
                krediet--;
            }
            if (krediet == 0) {
                kredietknop.setEnabled(true);
                speelknop.setEnabled(false);
            }
            repaint();
        }
    }

    class KredietKnopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (krediet == 0) {
                krediet += 10;
                speelknop.setEnabled(true);
                kredietknop.setEnabled(false);

            }

        }
    }
}




