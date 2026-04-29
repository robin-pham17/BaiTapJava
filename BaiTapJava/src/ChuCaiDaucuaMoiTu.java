import java.util.Scanner;
public class ChuCaiDaucuaMoiTu { public static void main(String[] argsg) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Vui long nhập 1 chuỗi");
    String s = scanner.nextLine();
    String[] mang = s.split(" ");
    for (int i = 0; i < mang.length; i ++)
    {
        System.out.print(mang[i].substring(0,1) + " ");

    }
}
}
