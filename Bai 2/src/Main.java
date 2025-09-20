import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc_325 = new Scanner(System.in);
        QLCB qlcb_325 = new QLCB();

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Nhap thong tin can bo moi");
            System.out.println("2. Tim kiem theo ho ten");
            System.out.println("3. Hien thi toan bo can bo");
            System.out.println("0. Thoat");
            System.out.print("Chon chuc nang: ");
            int chon_325 = Integer.parseInt(sc_325.nextLine());

            switch (chon_325) {
                case 1:
                    qlcb_325.themCanBo();
                    break;
                case 2:
                    System.out.print("Nhap ho ten can tim: ");
                    String ten_325 = sc_325.nextLine();
                    qlcb_325.timKiemTheoTen(ten_325);
                    break;
                case 3:
                    qlcb_325.hienThiDanhSach();
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh!");
                    sc_325.close();
                    return;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        }
    }
}
