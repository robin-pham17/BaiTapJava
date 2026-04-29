import java.util.Scanner;
public class XoaKyTuLapLai {
    public static void main(String[] argsg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui long nhập 1 chuỗi");
        String s = scanner.nextLine();
        char[] mang = s.toCharArray();
        String result = "";
        for (int i = 1; i < mang.length; i++) {
            if (mang[i] != mang[i-1]) {
                result = result + mang[i-1];
            }
        }
        System.out.println(result);
    }}