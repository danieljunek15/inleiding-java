package H4;

import java.awt.*;
import java.applet.*;



public class H4o8 extends Applet {
    Color opvulkleur;
    Color lijnkleur;
    public void init(){
        lijnkleur = Color.black;
        opvulkleur = Color.magenta;
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
        g.setColor(opvulkleur);
        g.fillRect(250,145,100,50);
        g.fillArc(450,145,99,49,0,45);
        g.fillArc(250,230,99,49,0,360);
        g.setColor(lijnkleur);
        g.drawArc(250,145,99,49,0,360);
        g.drawArc(450,145,99,49,0,360);
        g.drawArc(475,230,50,50,0,360);
    }
}
