import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLySach ql_325 = new QuanLySach();
        Scanner sc_325 = new Scanner(System.in);
        int chon_325;

        do {
            System.out.println("===== MENU =====");
            System.out.println("1. Nhap tai lieu moi");
            System.out.println("2. Tim kiem theo loai");
            System.out.println("3. Tim kiem theo ma tai lieu");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");
            chon_325 = sc_325.nextInt();
            sc_325.nextLine();

            switch (chon_325) {
                case 1:
                    ql_325.nhapTaiLieu_325();
                    break;
                case 2:
                    System.out.println("Chon loai: 1. Sach  2. Tap chi  3. Bao");
                    int loai_325 = sc_325.nextInt();
                    ql_325.timKiemTheoLoai_325(loai_325);
                    break;
                case 3:
                    System.out.print("Nhap ma tai lieu can tim: ");
                    String ma_325 = sc_325.nextLine();
                    ql_325.timKiemTheoMa_325(ma_325);
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (chon_325 != 0);
    }
}
