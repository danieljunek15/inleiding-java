package H4;

import java.awt.*;
import java.applet.*;

public class H4o2 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.pink);
        g.setColor(Color.black);
     g.drawRect(80,150,200,250);
     g.drawLine(180,35,80,150);
     g.drawLine(280,150,180,35);
     g.drawLine(80,270,280,270);


     g.setColor(Color.blue);
     g.fillRect(100,320,50,40);


     g.fillRect(100,200,50,40);


     g.fillRect(200,200,50,40);


     g.setColor(Color.LIGHT_GRAY);
     g.drawRect(200,299,50,100);
     g.fillRect(200,299,50,100);


    }
}