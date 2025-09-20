import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc325 = new Scanner(System.in);
        ArrayList<BienLai> danhSach325 = new ArrayList<>();

        System.out.print("Nhap so ho su dung dien: ");
        int n325 = Integer.parseInt(sc325.nextLine());

        // Nhap thong tin cho n ho
        for (int i = 0; i < n325; i++) {
            System.out.println("\n--- Nhap thong tin ho thu " + (i+1) + " ---");
            BienLai bl325 = new BienLai();
            bl325.nhapThongTin325(sc325);
            danhSach325.add(bl325);
        }

        // Hien thi thong tin cac bien lai
        System.out.println("\n--- Danh sach bien lai ---");
        for (BienLai bl325 : danhSach325) {
            bl325.hienThiThongTin325();
            System.out.println("----------------------------");
        }

        sc325.close();
    }
}
