import java.util.Scanner;
public class xoaNguyenAm {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vui long nhap 1 chuoi: ");
        String chuoi = scanner.nextLine();

//        String result = chuoi.replaceAll("[AEIOUaeiou]","");
//        System.out.println(result);
//        }
//        String result = "";
        char[] mangGoc = chuoi.toCharArray();
        char[] mangTam = new char[mangGoc.length]; // mảng tạm cùng kích thước
        int index = 0;
        for (char c : mangGoc) { // vòng lặp for each, c se mang giá trị của phần tử manggoc
            if (!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')) {
                mangTam[index++] = c;
            }
        }
// Tạo chuỗi từ mảng tạm, cắt bớt phần tử thừa
        String ketQua = new String(mangTam, 0, index);
        System.out.println(ketQua);
    }}

