import java.util.Scanner;
public class DemSoTuTrongChuoi {
    public static void main(String[] argsg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui long nhập 1 chuỗi");
        String s = scanner.nextLine();
        String[] mang = s.split(" ");
        System.out.println(mang.length);

    }
}
