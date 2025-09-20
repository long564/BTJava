import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc_325 = new Scanner(System.in);
        ArrayList<HSHocSinh> dsHocSinh_325 = new ArrayList<>();

        System.out.print("Nhap so luong hoc sinh: ");
        int n_325 = Integer.parseInt(sc_325.nextLine());

        // Nhap danh sach hoc sinh
        for (int i = 0; i < n_325; i++) {
            System.out.println("\nNhap thong tin hoc sinh thu " + (i + 1));
            System.out.print("Ho ten: ");
            String hoTen_325 = sc_325.nextLine();
            System.out.print("Ngay sinh (yyyy): ");
            String ngaySinh_325 = sc_325.nextLine();
            System.out.print("Que quan: ");
            String queQuan_325 = sc_325.nextLine();
            System.out.print("Lop: ");
            String lop_325 = sc_325.nextLine();
            System.out.print("Khoa hoc: ");
            String khoaHoc_325 = sc_325.nextLine();
            System.out.print("Ky hoc: ");
            String kyHoc_325 = sc_325.nextLine();

            HSHocSinh hs_325 = new HSHocSinh(hoTen_325, ngaySinh_325, queQuan_325,
                                             lop_325, khoaHoc_325, kyHoc_325);
            dsHocSinh_325.add(hs_325);
        }

        // 1. Hien thi hoc sinh sinh nam 1985 va que Thai Nguyen
        System.out.println("\nHoc sinh sinh nam 1985 va que Thai Nguyen:");
        for (HSHocSinh hs_325 : dsHocSinh_325) {
            if (hs_325.getNgaySinh_325().equals("1985") &&
                hs_325.getQueQuan_325().equalsIgnoreCase("Thai Nguyen")) {
                hs_325.hienThiThongTin_325();
                System.out.println("-----------------");
            }
        }

        // 2. Hien thi hoc sinh lop 10A1
        System.out.println("\nHoc sinh lop 10A1:");
        for (HSHocSinh hs_325 : dsHocSinh_325) {
            if (hs_325.getLop_325().equalsIgnoreCase("10A1")) {
                hs_325.hienThiThongTin_325();
                System.out.println("-----------------");
            }
        }

        sc_325.close();
    }
}
