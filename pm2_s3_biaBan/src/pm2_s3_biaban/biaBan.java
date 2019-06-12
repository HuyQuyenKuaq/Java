/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pm2_s3_biaban;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Hip_1
 */
public class biaBan extends Applet {

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
        /*int a,b,h,w;
        a=0;
        b=0;
        w=400;
        h=400;
        for(int i=0;i<2000;i+=9){
            a+=w/4;
            b+=h/4;
            
            w=h=w/2;
            
            if(i%2==0)
                g.setColor(Color.red);
            else
                g.setColor(Color.black);
        g.fillOval((a),(b),(w),(h));        
        }*/
        
        int x,y,w,h;
        for (int i=1;i<2000;i+=9){   // lẻ+lẻ =chẵn or chẵn+lẻ =lẻ ; 
            x=y=(i)*4;
            w=h=800-(i)*8;// nhân 4 hay 8 ở đây chỉ cần gấp đôi nhau để tâm không bị di chuyển khi ta vẽ hình tròn mới 
                        // 800 ở đây là định khung cho bia 
            if(i%2==0)
                g.setColor(Color.black);
            else
                g.setColor(Color.white);
            g.fillOval(x, y, w, h);
            
        }
        
        
    }
}
//ideal:làm sao dể hai vòng for liên tiếp nhau phải chẵn,lẻ,chẵn,lẻ liên tiếp nhau 