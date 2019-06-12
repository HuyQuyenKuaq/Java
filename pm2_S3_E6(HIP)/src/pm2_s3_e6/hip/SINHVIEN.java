/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pm2_s3_e6.hip;
import java.util.Date;

/**
 *
 * @author Hip_1
 */
public class SINHVIEN {
    
    
        private String ma;

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    private String ht;

    public String getHt() {
        return ht;
    }
    private boolean gt;

    public boolean isGt() {
        return gt;
    }

    public void setGt(boolean gt) {
        this.gt = gt;
    }


    public void setHt(String ht) {
        this.ht = ht;
    }

    private Date ns;

    public Date getNs() {
        return ns;
    }

    public void setNs(Date ns) {
        this.ns = ns;
    }

    private String dc;

    public String getDc() {
        return dc;
    }

    public void setDc(String dc) {
        this.dc = dc;
    }

    public SINHVIEN() {
    }

    public SINHVIEN(String ma, String ht, boolean gt, Date ns, String dc) {
        this.ma = ma;
        this.ht = ht;
        this.gt = gt;
        this.ns = ns;
        this.dc = dc;
    }


}
