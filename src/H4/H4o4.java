package H4;

import java.awt.*;
import java.applet.*;

public class H4o4 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        //Met deze code kan ik zelf een nieuwe kleur toevoegen aan mijn kleuren lijst.
        Color lightbrown = new Color(191, 167, 105);
        Color grayblue = new Color(107, 103, 214);
        Color pinkred = new Color(219, 46, 98);
        Color graygreen = new Color(166, 224, 135);

        setBackground(Color.black);

        //Dit zijn de zij lijnen van de grafiek.
        g.setColor(Color.white);
        g.drawLine(80, 40, 80, 280);
        g.drawLine(80, 280, 280, 280);
        g.drawLine(75, 240, 85, 240);
        g.drawLine(75, 200, 85, 200);
        g.drawLine(75, 160, 85, 160);
        g.drawLine(75, 120, 85, 120);
        g.drawLine(75, 80, 85, 80);

        //Dit zijn de nummers die het aantal aan geven.
        g.drawString("20", 60, 245);
        g.drawString("40", 60, 205);
        g.drawString("60", 60, 165);
        g.drawString("80", 60, 125);
        g.drawString("100", 53, 85);

        //Dit zijn de namen van de lagenda.
        g.drawString("Valerie", 100, 352);
        g.drawString("Valerie", 90, 300);
        g.drawString("Jeroen", 230, 300);
        g.drawString("Hans", 160, 300);
        g.drawString("Hans", 100, 372);
        g.drawString("Jeroen", 100, 392);
        g.drawString("Legenda", 80, 330);

        //Dit zijn de grafiekstaafen men kleur + de lagenda in kleur.
        g.setColor(grayblue);
        g.fillRect(100, 200, 15, 80);
        g.setColor(pinkred);
        g.fillRect(170, 120, 15, 160);
        g.setColor(graygreen);
        g.fillRect(240, 80, 15, 200);
        g.setColor(grayblue);
        g.fillRect(80, 340, 15, 15);
        g.setColor(pinkred);
        g.fillRect(80, 360, 15, 15);
        g.setColor(graygreen);
        g.fillRect(80, 380, 15, 15);


    }

}



