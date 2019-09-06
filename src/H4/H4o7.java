package H4;

import java.awt.*;
import java.applet.*;


public class H4o7 extends Applet {
    public void init() {
    }

    public void paint(Graphics g) {
        //Dit zijn mijn toege voegde kleuren.
        Color iets = new Color(186, 137, 84);
        Color gbwit = new Color(255, 233, 212);
        
        //De achter gronde kleur.
        setBackground(gbwit);

        //De dobbelsteel kleur.
        g.setColor(iets);

        //Dit is het frame van de dobblesteen.
        g.fillRoundRect(100, 100, 160, 160, 20, 20);

        //Dit is de kleur van de dobblesteen ogen.
        g.setColor(Color.black);

        //Dit zijn de punten van de dobblesteen.
        g.fillArc(125, 125, 40, 40, 10, 360);
        g.fillArc(195, 125, 40, 40, 10, 360);
        g.fillArc(125, 195, 40, 40, 10, 360);
        g.fillArc(195, 195, 40, 40, 10, 360);
    }
}
