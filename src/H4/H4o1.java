package H4;

import java.awt.*;
import java.applet.*;

public class H4o1 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        //Dit is een driehoek.
        setBackground(Color.white);
        g.setColor(Color.green);
        g.drawLine(250, 50, 400, 150);
        g.drawLine(100, 150, 250, 50);
        g.drawLine(100, 150, 400, 150);

    }
}