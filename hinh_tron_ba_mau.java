/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pm2_s3_e4.hinh_tron_ba_mau;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author Hip_1
 */
public class hinh_tron_ba_mau extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
    }
    

    // TODO overwrite start(), stop() and destroy() methods

    @Override
    public void paint(Graphics g) {
        super.paint(g); 
       /* g.setColor(Color.red);
        g.fillArc(100, 100, 200, 200, 0, 120);
        g.setColor(Color.yellow);
        g.fillArc(100, 100, 200, 200, 120, 240);
        g.setColor(Color.green);
        g.fillArc(100, 100, 200, 200, 360, 240);
        g.fill*/
        Graphics2D g2 = (Graphics2D) g;
        for (int i = 0; i <=7; i++) {
            g2.rotate(Math.toRadians(45), 300, 300);
            g2.hashCode();
            g.setColor(Color.magenta);
            g.setFont(new Font(null, Font.BOLD, 90));
            g.drawString("Java",100,100);
            
        }
    }
}
