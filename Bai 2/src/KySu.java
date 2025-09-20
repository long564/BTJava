import java.util.ArrayList;
import java.util.Scanner;
public class KySu extends CanBo {
    private String nganhDaoTao_325;

    public KySu(String hoTen_325, String ngaySinh_325, String gioiTinh_325, String diaChi_325, String nganhDaoTao_325) {
        super(hoTen_325, ngaySinh_325, gioiTinh_325, diaChi_325);
        this.nganhDaoTao_325 = nganhDaoTao_325;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Nganh dao tao: " + nganhDaoTao_325);
    }
}
