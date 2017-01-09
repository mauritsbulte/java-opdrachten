package p12;
import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;


public class Opdracht126 extends Applet {


    int[] getallen = {1, 1, 2, 2, 2, 3, 3, 3, 3};


    TextField textField;
    Button button;
    String schermtekst;


    @Override
    public void init() {


        textField = new TextField("", 8);
        add(textField);
        button = new Button("Kies");
        add(button);
        button.addActionListener(new KnopListener());
        schermtekst = "";
    }


    @Override
    public void paint(Graphics g) {
        int x = 50;
        int y = 80;


        g.drawString(schermtekst, x, y);
    }
    class KnopListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            int invoer = Integer.parseInt(textField.getText());

            int[] nummers = {7, 2, 3, 6, 7, 6, 7, 8, 6, 10, 2};
            Arrays.sort(nummers);

            for (int i = 1; i < nummers.length; i++) {
                if (nummers[i] == nummers[i - 1]) {

                schermtekst = "wordt het meest herhaald" + nummers[i] ;
                } else {
                    schermtekst = "word het minst herhaald";
                    repaint();
                }
            }
        }
    }
}
