import java.util.Scanner;

public class ChuoiDoiXungDaiNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Bước 1: Nhập chuỗi
        System.out.print("Nhập chuỗi: ");
        String s = sc.nextLine();
        sc.close();

        String chuoiDoiXungMax = ""; // Lưu kết quả

        // Bước 2: Duyệt tất cả các chuỗi con
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String sub = s.substring(i, j);

                // Bước 3: Kiểm tra xem sub có đối xứng không
                if (kiemTraDoiXung(sub)) {
                    // Bước 4: Nếu dài hơn chuỗi đã lưu thì cập nhật
                    if (sub.length() > chuoiDoiXungMax.length()) {
                        chuoiDoiXungMax = sub;
                    }
                }
            }
        }

        // Bước 5: In kết quả
        if (chuoiDoiXungMax.length() > 0) {
            System.out.println("Chuỗi đối xứng dài nhất: " + chuoiDoiXungMax  );

        } else {
            System.out.println("Không có chuỗi đối xứng nào.");
        }
    }

    // Hàm kiểm tra chuỗi đối xứng
    public static boolean kiemTraDoiXung(String s) {
        char[] mang = s.toCharArray();
        String s1 = "";
        for (int i = (mang.length-1); i >= 0 ; i--) {
            s1 = s1 + mang[i];
        }
        return (s.equals(s1));
    }
}