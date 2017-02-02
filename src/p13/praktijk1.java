package p13;
import java.applet.*;
import java.awt.*;

public class praktijk1 extends Applet {

    public void paint(Graphics g) {
        g.setColor(Color.red);
        int x1, x1b, y1, y1b , x2, y2, xy2;
        int breedte ,lengte , bladeren , xcoordinaat, xcoordinaat2, ycoordinaat, ycoordinaat2;
        setSize(400 , 400);

        //stam van de boomg
        breedte = 60;
        lengte = 200;
        xcoordinaat = 150;
        ycoordinaat = 100;

        x1 = xcoordinaat;
        y1 = ycoordinaat;
        x2 = breedte;
        y2 = lengte;

        //Bladeren en coördinaten van
        bladeren = 170;
        xcoordinaat2 = 95;
        ycoordinaat2 = 10;

        xy2 = bladeren;
        x1b = xcoordinaat2;
        y1b = ycoordinaat2;

        boom(g, x1, x1b, y1, y1b, x2, y2 , xy2 );
    }
    void boom(Graphics g, int x1, int x1b , int y1, int y1b , int x2, int y2 , int xy2 ) {
        g.setColor(Color.orange);
        g.drawRect(x1, y1, x2, y2);
        g.fillRect(x1, y1, x2, y2);
        g.setColor(Color.green);
        g.fillOval(x1b, y1b, xy2, xy2);
    }
}