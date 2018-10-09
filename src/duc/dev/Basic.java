package duc.dev;
 
import java.text.DecimalFormat;
import java.util.Scanner;
 
public class Basic{
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
         
        System.out.println("Nhap vao so a: ");
        int a = scanner.nextInt();
        System.out.println("nhap vao so b: ");
        int b = scanner.nextInt();
         
       
        int tong = a + b;
        System.out.println(a + " + " + b + " = " + tong);
         
        int hieu = a - b;
        System.out.println(a + " - " + b + " = " + hieu);
         
        int tich = a * b;
        System.out.println(a + " * " + b + " = " + tich);
         
        float thuong = (float) a / b;
        System.out.println(a + " / " + b + " = " + 
                decimalFormat.format(thuong)); 
         
     
    }
 
}
