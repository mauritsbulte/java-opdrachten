package p13;
import java.awt.*;
import java.applet.Applet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht134 extends Applet {

    int BeginX = 0;
    int BeginY = 50;
    int Wijdte = 50;
    int Hoogte = 20;
    int Ruimte = 2;
    Button Beton;
    Button Baksteen;


    public void init() {
    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);

        Baksteen = new Button("Baksteenmuur");
        Baksteen.addActionListener(new BaksteenListener());
        add(Baksteen);



        Beton = new Button("Betonmuur");
        Beton.addActionListener(new BetonListener());
        add(Beton);

        setSize(507, 300);

    }

    void baksteenmuur(Graphics g, int BeginX, int BeginY, int Wijdte, int Hoogte, int Ruimte) {
        for (int rij = 0; rij < 8; rij++) {
            int y = BeginY + (rij * (Hoogte + Ruimte));
            for (int kolom = 0; kolom < 8; kolom++) {
                int x = BeginX + (kolom * (Wijdte + Ruimte));

                g.setColor(Color.RED);

                g.fillRect(x, y, Wijdte, Hoogte);
            }

        }
    }

    void betonmuur(Graphics g, int BeginX, int BeginY, int Wijdte, int Hoogte, int Ruimte) {
        for (int rij = 0; rij < 8; rij++) {
            int y = BeginY + (rij * (Hoogte + Ruimte));
            for (int kolom = 0; kolom < 9; kolom++) {
                int x = BeginX + (kolom * (Wijdte + Ruimte));

                g.setColor(Color.GRAY);
                g.fillRect(x, y, Wijdte, Hoogte);
                }
        }

    }
    class BetonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            betonmuur(getGraphics(), 0,50,50,20,2);
        }
    }


     class BaksteenListener implements ActionListener {
         @Override
         public void actionPerformed(ActionEvent e) {
             baksteenmuur(getGraphics(), 0,50,50,20,2);
         }
     }
}





