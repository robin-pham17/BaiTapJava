import java.util.Scanner;

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi s: ");
        String s = sc.nextLine();
        System.out.print("Nhập chuỗi t: ");
        String t = sc.nextLine();
        sc.close();

        String result = timChuoiConNhoNhat(s, t);
        System.out.println("Kết quả: \"" + result + "\"");
    }

    // Hàm tìm chuỗi con nhỏ nhất của s chứa mọi ký tự trong t
    public static String timChuoiConNhoNhat(String s, String t) {
        String ketQua = ""; // Lưu chuỗi con tốt nhất

        // Duyệt tất cả các chuỗi con của s
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String sub = s.substring(i, j); // Lấy chuỗi con từ i đến j-1

                // Kiểm tra chuỗi con có chứa toàn bộ ký tự của t không
                if (chuaHetKyTu(sub, t)) {
                    // Nếu chưa có kết quả hoặc chuỗi con ngắn hơn kết quả cũ -> cập nhật
                    if (ketQua.equals("") || sub.length() < ketQua.length()) {
                        ketQua = sub;
                    }
                }
            }
        }
        return ketQua;
    }

    // Hàm kiểm tra chuỗi sub có chứa tất cả ký tự trong t không
    public static boolean chuaHetKyTu(String sub, String t) {
        // Đếm số lượng từng ký tự trong sub
        int[] demSub = new int[128]; // Mảng 128 phần tử cho ký tự ASCII
        for (char c : sub.toCharArray()) {
            demSub[c]++;
        }

        // Đếm số lượng từng ký tự trong t
        int[] demT = new int[128];
        for (char c : t.toCharArray()) {
            demT[c]++;
        }

        // Kiểm tra xem sub có đủ số lượng mỗi ký tự như t yêu cầu không
        for (int i = 0; i < 128; i++) {
            if (demT[i] > demSub[i]) {
                return false; // Thiếu ký tự
            }
        }
        return true;
    }
}