import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc_325 = new Scanner(System.in);

        // Nhập phân số thứ 1
        System.out.print("Nhập tử số phân số 1: ");
        int tu1_325 = sc_325.nextInt();
        System.out.print("Nhập mẫu số phân số 1: ");
        int mau1_325 = sc_325.nextInt();
        PhanSo sp1_325 = new PhanSo(tu1_325, mau1_325);

        // Nhập phân số thứ 2
        System.out.print("Nhập tử số phân số 2: ");
        int tu2_325 = sc_325.nextInt();
        System.out.print("Nhập mẫu số phân số 2: ");
        int mau2_325 = sc_325.nextInt();
        PhanSo sp2_325 = new PhanSo(tu2_325, mau2_325);

        // Thực hiện các phép toán
        System.out.print("Tổng: ");
        sp1_325.cong(sp2_325).hienThi();

        System.out.print("Hiệu: ");
        sp1_325.tru(sp2_325).hienThi();

        System.out.print("Tích: ");
        sp1_325.nhan(sp2_325).hienThi();

        System.out.print("Thương: ");
        sp1_325.chia(sp2_325).hienThi();

        // Kiểm tra tối giản
        System.out.println("sp1_325 có tối giản không? " + sp1_325.laToiGian());
        System.out.println("sp2_325 có tối giản không? " + sp2_325.laToiGian());

        sc_325.close();
    }
}