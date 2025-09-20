import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc325 = new Scanner(System.in);
        ArrayList<CBGV> danhSach325 = new ArrayList<>();

        System.out.print("Nhap so luong can bo giao vien: ");
        int n325 = Integer.parseInt(sc325.nextLine());

        for (int i = 0; i < n325; i++) {
            System.out.println("\n--- Nhap thong tin CBGV thu " + (i+1) + " ---");
            CBGV cbgv325 = new CBGV();
            cbgv325.nhapThongTin325(sc325);
            danhSach325.add(cbgv325);
        }

        System.out.println("\n--- Danh sach tat ca CBGV ---");
        for (CBGV cbgv325 : danhSach325) {
            cbgv325.hienThiThongTin325();
            System.out.println("-------------------------");
        }

        System.out.println("\n--- Danh sach CBGV co luong thuc linh >= 8,000,000 ---");
        for (CBGV cbgv325 : danhSach325) {
            if (cbgv325.tinhLuongThucLinh325() >= 8000000) {
                cbgv325.hienThiThongTin325();
                System.out.println("-------------------------");
            }
        }

        sc325.close();
    }
}
