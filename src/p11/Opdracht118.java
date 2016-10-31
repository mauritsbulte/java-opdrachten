package p11;
import java.awt.*;
import java.applet.*;
/**
 * Created by yoklik on 30-10-2016.
 */
public class Opdracht118 extends Applet {


    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int verandering = 10;
        int x = 400;
        int y = 400;

        for(teller = 1; teller < 101; teller++) {
            verandering += 10;
            x -= 5;
            y -= 5;
            g.drawOval(x, y, verandering, verandering);
        }
    }
}