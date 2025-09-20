import java.util.ArrayList;
import java.util.Scanner;
public class CongNhan extends CanBo {
    private int bac_325;

    public CongNhan(String hoTen_325, String ngaySinh_325, String gioiTinh_325, String diaChi_325, int bac_325) {
        super(hoTen_325, ngaySinh_325, gioiTinh_325, diaChi_325);
        this.bac_325 = bac_325;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Bac cong nhan: " + bac_325);
    }
}
