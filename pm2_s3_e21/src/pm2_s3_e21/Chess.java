
package pm2_s3_e21;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Hip_1
 */
public class Chess extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
       
    }

    // TODO overwrite start(), stop() and destroy() methods

    @Override
    public void paint(Graphics g) {
        super.paint(g);
       /* int m=0,n=0  ;
        int x,y,h,w;        
            x=y=m;
            w=h=n;
            g.setColor(Color.black);
            g.drawOval(x, y, WIDTH, HEIGHT);*/
       int x,y;
       int h=50;       
       for(int i=0;i<8;i++)
           for(int j=0;j<8;j++)          
           {               
            if((i+j)%2==0)  
               g.setColor(Color.red);                
            else
                g.setColor(Color.black);            
            g.fillRect(i*50,j*50, h,h);
            
           }
        
                


                


//To change body of generated methods, choose Tools | Templates.
    }
}
