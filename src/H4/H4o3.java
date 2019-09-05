package H4;

import java.awt.*;
import java.applet.*;

public class H4o3 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {

        //Ik zet de achtergrond wit.
        setBackground(Color.orange);

        //Dis is de flaggen stok.
        g.fillRect(70,95,10,300);

        //Dit is de flag met kronkels er in.
        //De roode bar.
        g.setColor(Color.red);
        g.fillRect(80,100,25,15);
        g.fillRect(130,100,25,15);
        g.fillRect(105,95,25,15);
        g.fillRect(155,95,25,15);
        //De witte bar.
        g.setColor(Color.white);
        g.fillRect(80,115,25,15);
        g.fillRect(130,115,25,15);
        g.fillRect(105,110,25,15);
        g.fillRect(155,110,25,15);
        //De blauwe bar.
        g.setColor(Color.blue);
        g.fillRect(80,130,25,15);
        g.fillRect(130,130,25,15);
        g.fillRect(105,125,25,15);
        g.fillRect(155,125,25,15);


    }

}

