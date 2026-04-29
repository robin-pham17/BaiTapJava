import java.util.Scanner;
public class ThueThuNhap {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Vui long nhập thu nhập hàng năm: ");
        int n = nhap.nextInt();
        if (n <= 5000000) {
            System.out.println("Thue phai tra là 5%");
        } else if (n <= 10000000) {
            System.out.println("Thue phai tra la 10%");
        } else if (n <= 18000000) {
            System.out.println("Thue phai tra la 15%");
        } else if (n <= 32000000) {
            System.out.println("Thue phai tra la 20%");
        } else if (n <= 52000000) {
            System.out.println("Thue phai tra la 25%");
        } else if (n <= 80000000) {
            System.out.println("Thue phai tra la 30%");
        } else {System.out.println("Thue phai tra la 35%");}
} }
