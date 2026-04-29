import java.util.Scanner;
public class secondbigNum {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vui long nhập số lượng phần tử của mảng : ");
        int doDai = scanner.nextInt();
        int[] mang = new int[doDai];
        for (int i = 0; i < doDai ; i++) {
            System.out.println("Nhập so thứ "+ (i+1) +": ");
            mang[i] = scanner.nextInt();
        }
        switch  (doDai) {
            case 1:
            case 2:
                System.out.println("Integer.MIN_VALUE");
                break;
            default:

        int max = mang[0];
        int max2nd = mang[1];
        for ( int i =1; i < doDai; i++ ) {
            if (mang[i] > max) {
                max = mang[i];
            }

        }
        for ( int i =0; i < doDai; i++ ) {
            if (mang[i] < max) {
                if(mang[i] > max2nd) { max2nd = mang[i];}
            }

        }
        System.out.println("So lớn thứ 2 là :" + max2nd);
        break;
}}}
