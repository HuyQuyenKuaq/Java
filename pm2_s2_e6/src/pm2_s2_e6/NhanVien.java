
package pm2_s2_e6;
//import java.util.*;
public abstract class NhanVien {
    protected String manv;
    protected String hoten;
    protected String que;
    protected String hesoluong;

    public void setManv(String manv) {
        this.manv = manv;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setQue(String que) {
        this.que = que;
    }

    public void setHesoluong(String hesoluong) {
        this.hesoluong = hesoluong;
    }

    public String getManv() {
        return manv;
    }

    public String getHoten() {
        return hoten;
    }

    public String getQue() {
        return que;
    }

    public String getHesoluong() {
        return hesoluong;
    }
    
    public NhanVien() {
    }

    public NhanVien(String manv, String hoten, String que, String hesoluong) {
        this.manv = manv;
        this.hoten = hoten;
        this.que = que;
        this.hesoluong = hesoluong;
    }

    public abstract void NhapNhanVien();
  public static void main(String[] agrs){      
  }
  
}
