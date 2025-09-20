import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TuyenSinh ts = new TuyenSinh();
        Scanner sc = new Scanner(System.in);
        int chon;

        do {
            System.out.println("===== MENU =====");
            System.out.println("1. Nhap thong tin thi sinh moi");
            System.out.println("2. Hien thi thong tin 1 thi sinh");
            System.out.println("3. Tim kiem thi sinh theo SBD");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");
            chon = sc.nextInt();
            sc.nextLine(); 

            switch (chon) {
                case 1:
                    ts.nhapThiSinh_325();
                    break;
                case 2:
                    ts.hienThiMotThiSinh_325();
                    break;
                case 3:
                    System.out.print("Nhap so bao danh can tim: ");
                    String sbd = sc.nextLine();
                    ts.timKiemThiSinh_325(sbd);
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (chon != 0);

        sc.close();
    }
}
