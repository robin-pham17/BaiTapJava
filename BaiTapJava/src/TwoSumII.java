import java.util.Scanner;
public class TwoSumII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap 1 mảng đã sắp xếp tăng dần - cách dấu phẩy: ");
        String chuoiSo = sc.nextLine();
        String[] arr = chuoiSo.trim().split(",");
        int[] arrSo = new int[arr.length];
        for ( int i=0; i < arr.length; i++) {
            arrSo[i] = Integer.parseInt(arr[i]);
        }
        System.out.print(" Nhap số target: ");
        int target = sc.nextInt();
        sc.close();

        int left = 0;
        int right = arrSo.length - 1;
        boolean timThay = false;

        while (left < right) {
            int tong = arrSo[left] + arrSo[right];
            if (tong == target) {
                // Trả về chỉ số bắt đầu từ 1
                System.out.println("Hai số ở vị trí: " + (left + 1) + " và " + (right + 1));
                timThay = true;
                break;
            } else if (tong < target) {
                left++; // cần tổng lớn hơn → tăng left
            } else {
                right--; // cần tổng nhỏ hơn → giảm right
            }
        }

        if (!timThay) {
            System.out.println("Không tìm thấy hai số nào có tổng bằng " + target);
    }}
    }

