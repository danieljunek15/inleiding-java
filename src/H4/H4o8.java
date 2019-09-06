package H4;

import java.awt.*;
import java.applet.*;



public class H4o8 extends Applet {
    public void init(){
    }
    public void paint(Graphics g){
        
        //Dit zijn alle namen van de fieguuren.
        g.drawString("Lijn",30,100);
        g.drawString("Rechthoek",30,210);
        g.drawString("Afgeronderechthoek",30,300);
        g.drawString("Gevulde recht hoek met ovaal",250,210);
        g.drawString("gevulde ovaal",250,300);
        g.drawString("Circel",450,300);
        g.drawString("Taart punt met ovaal eromheen",450,210);

        //Dit zijn alle vieguuren.
        g.drawLine(30,85,130,85);
        g.drawRect(30,145,100,50);
        g.drawRoundRect(30,230, 100,50,30,30);
        g.setColor(Color.magenta);
        g.fillRect(250,145,100,50);
        g.fillArc(450,145,99,49,0,45);
        g.fillArc(250,230,99,49,0,360);
        g.setColor(Color.black);
        g.drawArc(250,145,99,49,0,360);
        g.drawArc(450,145,99,49,0,360);
        g.drawArc(475,230,50,50,0,360);
    }
}
