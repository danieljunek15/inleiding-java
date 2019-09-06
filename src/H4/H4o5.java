package H4;

import java.awt.*;
import java.applet.*;


public class H4o5 extends Applet {
    public void init() {
    }

    public void paint(Graphics g) {

        //Met deze code maak je nieuwe kleuren aan.
        Color darkblue = new Color(80, 153, 199);
        Color goodyellow = new Color(235, 232, 63);
        setBackground(darkblue);

        //Met deze code maak je de ovaal.
        g.setColor(goodyellow);
        g.fillArc(50, 30, 80, 50, 200, 360);


    }

}
