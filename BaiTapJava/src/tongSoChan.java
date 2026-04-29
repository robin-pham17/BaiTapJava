import java.util.Scanner;
public class tongSoChan {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Vui long nhap so duong N:");
        int n = nhap.nextInt();
        int sum = 0;
        for (int i = 0; i <=n; i++) {
            if ((i % 2 ) == 0) { sum = sum + i;}
        }
        System.out.println("Tổng số chẳn là: " + sum);
    }
}
