package H2;

import sun.plugin2.util.ColorUtil;

import java.awt.*;
import java.applet.*;

public class H22 extends Applet {

    public void init() {
    setBackground(Color.white);
}
public void paint(Graphics g)  {
    g.setColor(Color.blue);
    g.drawString("Daniël" ,180, 140);
    g.setColor(Color.red);
    g.drawString("van den Brink" ,160, 150);
    g.setColor(Color.blue);
    g.drawString("doggo" ,180, 160);



        }
}
