package H4;

import java.awt.*;
import java.applet.*;

public class H4o6 extends Applet {

    public void init(){
    }

    public void paint(Graphics g){

        //Dit zijn alle kleure codes die in de Applet zitten.
        Color bob = new Color(63, 235, 212);
        Color henk = new Color(255, 25, 0);
        Color stpgreen = new Color(59, 255, 75);
        Color stporange = new Color(255, 149, 36);

        setBackground(bob);

        //Dit is het vreem van het stoplicht.
        g.fillRoundRect(100,100,60,160,10,10);
        g.setColor(henk);

        //Dit zijn de lichten van het stoplicht.
        g.fillArc(115,120,30,30,10,360);
        g.setColor(stporange);
        g.fillArc(115,160,30,30,10,360);
        g.setColor(stpgreen);
        g.fillArc(115,200,30,30,10,360);

        //Dit is de zwart/wit gestreepte paal van het stoplicht.
        g.setColor(Color.black);
        g.fillRect(120, 280,20, 220);
        g.setColor(Color.white);
        g.fillRect(120, 260,20, 20);
        g.fillRect(120, 300,20, 20);
        g.fillRect(120, 340,20, 20);
        g.fillRect(120, 380,20, 20);
        g.fillRect(120, 420,20, 20);
        g.fillRect(120, 460,20, 20);


    }
}
