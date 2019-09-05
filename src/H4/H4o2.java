package H4;

import java.awt.*;
import java.applet.*;

public class H4o2 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {

        //ik zet de achtergrond roze.
        setBackground(Color.pink);

        //Ik maak de lijnen van het huis zwart.
        g.setColor(Color.black);

        //Dit is de eerste en tweede etage van het huis.
        g.drawRect(99, 319, 51, 41);
        g.drawRect(99, 199, 51, 41);
        g.drawRect(199, 199, 51, 41);
        g.drawRect(80, 150, 200, 250);
        g.drawRect(199, 299, 51, 101);

        //Hier maak ik het dak.
        g.drawLine(180, 35, 80, 150);
        g.drawLine(280, 150, 180, 35);
        g.drawLine(80, 270, 280, 270);

        //Dit zijn de ramen van het huis.
        g.setColor(Color.yellow);
        g.fillRect(100, 320, 50, 40);
        g.fillRect(100, 200, 50, 40);
        g.fillRect(200, 200, 50, 40);

        //Dit is de deur van het huis.
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(200, 300, 50, 100);


    }
}