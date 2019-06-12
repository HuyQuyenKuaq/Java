/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pm2_s3_e11.Pm2_s3_e11;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import jdk.nashorn.internal.ir.WhileNode;

/**
 *
 * @author Hip_1
 */
public class applets extends Applet {

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
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        int x;
        int y;
        int h;
        int w;
        x=y=0;
        w=h=150;        
       // g.getColor(Color.BLUE);
        //g.fllRect(x, y, w, h);
        g.setColor(Color.gray);
        g.fillRect(x, y, w, h);// vẽ hình vuông 1
        
        g.setColor(Color.blue);// vẽ hình tròn 1 
        g.fillOval(x, y, w, h);
        
        g.setColor(Color.pink);
        g.setFont(new Font(null, Font.BOLD, 15));// chứ xuân
        g.drawString("Xuân", 55,75);
        
       
        
        g.setColor(Color.red);
        g.fillRect(150, 0, 150, 150); // hình vuông 2 
        
        g.setColor(Color.pink);;
        g.fillOval(150, 0, 150, 150); // hình tròn 2 
        
        g.setColor(Color.blue);
        g.setFont(new Font(null, Font.BOLD, 15));// chữ hạ 
        g.drawString("Hạ", 220, 75);
        
    }
}
