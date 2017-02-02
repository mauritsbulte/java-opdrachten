package p13;
import java.applet.*;
import java.awt.*;

public class praktijk2 extends Applet {

    public void paint(Graphics g) {

        g.setColor(Color.red);
        int x1, x1b, y1, y1b, x2, y2, xy2, breedte, lengte, bladeren, xcoordinaat, xcoordinaat1, ycoordinaat, ycoordinaat1;
        setSize(825, 600);

        //boomstam
        breedte = 60;
        lengte = 200;
        xcoordinaat = 60;
        ycoordinaat = 100;

        x1 = xcoordinaat;
        y1 = ycoordinaat;
        x2 = breedte;
        y2 = lengte;

        //bladeren//
        bladeren = 150;
        xcoordinaat1 = 15;
        ycoordinaat1 = 20;

        xy2 = bladeren;
        x1b = xcoordinaat1;
        y1b = ycoordinaat1;

        bomen(g, x1, x1b, y1, y1b, x2, y2, xy2);
    }

    void bomen(Graphics g, int x1, int x1b, int y1, int y1b, int x2, int y2, int xy2) {
        Color Bruin = new Color(153,76,0);
        for (int i = 0; i < 2; i++) {
            x1 = 60;
            x1b = 20;
            g.fillRect(x1, y1, x2, y2);
            g.setColor(Bruin);
            g.drawRect(x1, y1, x2, y2);
            g.fillRect(x1, y1, x2, y2);

            g.setColor(Color.green);
            g.fillOval(x1b, y1b, xy2, xy2);
            for (int j = 0; j < 4; j++) {
                x1b += 160;
                x1 += 160;
                g.fillRect(x1, y1, x2, y2);
                g.setColor(Bruin);
                g.drawRect(x1, y1, x2, y2);
                g.fillRect(x1, y1, x2, y2);
                g.setColor(Color.green);
                g.fillOval(x1b, y1b, xy2, xy2);
            }
            y1 += 300;
            y1b += 300;

        }
    }
}