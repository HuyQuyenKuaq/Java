/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pm2_s3_e2.Pm2_s3_e2;

/**
 *
 * @author Hip_1
 */
public class Pheptinh {    
    /**
     * @param args the command line arguments
     */
    
    private double Toanhang1;

    public double getToanhang1(){ 
        return Toanhang1;
    }

    public void setToanhang1(double Toanhang1) {
        this.Toanhang1 = Toanhang1;
    }
    
    private double Toanhang2;

    public double getToanhang2() {
        return Toanhang2;
    }

    public void setToanhang2(double Toanhang2) {
        this.Toanhang2 = Toanhang2;
    }

    private String Toantu;

    public String getToantu() {
        return Toantu;
    }

    public void setToantu(String Toantu) {
        this.Toantu = Toantu;
    }

    public Pheptinh(double Toanhang1, double Toanhang2, String Toantu) {
        this.Toanhang1 = Toanhang1;
        this.Toanhang2 = Toanhang2;
        this.Toantu = Toantu;
    }

    public Pheptinh() {
    }
    public boolean KiemTra(String s){
        try 
        { 
            Double.parseDouble(s); return true;           
        } 
        catch (NumberFormatException e) 
        {
            return false;
        }     
    }
    public double tinhToan()
    {
        switch(Toantu){
            case "+":
                return Toanhang1 + Toanhang2;                 
            case "-":
                return Toanhang1 - Toanhang2;
            case "*":
                return Toanhang1 * Toanhang2;
            case "/":
                if(Toanhang2==0)
                    System.out.println("Math Errors \n");
                else return (double)Toanhang1/Toanhang2;
            default:
                System.out.println("This is not an operation");
        }
        return 0;
    }

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
