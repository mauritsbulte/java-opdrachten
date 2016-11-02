package p11;
import java.awt.*;
import java.applet.*;
/**
 * Created by yoklik on 30-10-2016.
 */
public class Opdracht119 extends Applet {

    int ruimte;
    int breedteveld;
    int hoogteveld;
    Color wit;
    Color zwart;
    Color achtergrond;

    public void init() {
    wit = Color.WHITE;
    zwart = Color.BLACK;
    achtergrond = Color.LIGHT_GRAY;
    ruimte = 60;
    breedteveld = 40;
    hoogteveld = breedteveld;

    int breedtescherm = 2 * ruimte + 8 * breedteveld;
    int hoogtescherm = 2 * ruimte + 8 * hoogteveld;
        setSize(breedtescherm, hoogtescherm);
        setBackground(achtergrond);
    }

    public void paint(Graphics g) {
        int y = ruimte;
        for (int Rij = 0; Rij < 8; Rij++) {
            int x = ruimte;
            for (int Kolom = 0; Kolom < 8; Kolom++) {
                if ( (Rij + Kolom) % 2 == 0) {
                    g.setColor(zwart);
                } else {
                    g.setColor(wit);
                }
                g.fillRect(x, y, breedteveld, hoogteveld);
                x += breedteveld;
            }
            y += hoogteveld;
        }

        }
    }

