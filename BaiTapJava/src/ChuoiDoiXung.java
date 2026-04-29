import java.util.Scanner;
public class ChuoiDoiXung {
    public static void main(String[] argsg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui long nhập 1 chuỗi");
        String s = scanner.nextLine();
        char[] mang = s.toCharArray();
        String s1 = "";
        for (int i = (mang.length-1); i >= 0 ; i--) {
            s1 = s1 + mang[i];
        }
        System.out.println(s1.equals(s));
}}
