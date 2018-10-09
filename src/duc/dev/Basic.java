package duc.dev;
 import java.util.Scanner;
public class Basic {
	 
    public static void main(String[] args) {
    	 Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so : ");
        int a = scanner.nextInt();
        switch (a) {
            case 0:
                System.out.println("Zero");
            break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two ");
                break;
            case 3:
                System.out.println("three ");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
                break;
            case 10:
                System.out.println(" ten");
                break;
                
            default:
                System.out.println("B?n dã gán sai giá tr?, ch? du?c gán s? nguyên t? 0 t?i 10");
                break;
        }
    }
}
