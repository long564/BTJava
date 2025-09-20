import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc_325 = new Scanner(System.in);
        KhuPho kp_325 = new KhuPho();

        kp_325.nhapKhuPho_325(sc_325);

        System.out.print("Nhap nam hien tai: ");
        int namHienTai_325 = sc_325.nextInt();

        kp_325.hienThiThuongTho_325(namHienTai_325);

        sc_325.close();
    }
}
