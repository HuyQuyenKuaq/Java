
package pm2_s2_e6;
import java.util.*;
public class DLNhanVien extends NhanVien {
    private int n;
    
    private int k;
    
    NhanVien[] dsnv=new NhanVien[n];
    
    Scanner input=new Scanner(System.in);
    public void NhapNhanVien(){
        System.out.println("nhap manv: ");
        String manv=input.nextLine();this.setManv(manv);
        System.out.println("nhap hotennv: ");
        String hoten=input.nextLine();this.setHoten(hoten);
        System.out.println("nhap que: ");
        String que=input.nextLine();this.setQue(que);
    }
    public void HienThiNhanVien()
    {
        System.out.println("danh sach nhan vien la: \n");
        
    }
    
    
}
