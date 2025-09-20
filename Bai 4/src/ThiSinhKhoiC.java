public class ThiSinhKhoiC extends ThiSinh {
    private String mon_325 = "Van, Su, Dia";

    public ThiSinhKhoiC(String soBaoDanh_325, String hoTen_325, String diaChi_325, String uuTien_325) {
        super(soBaoDanh_325, hoTen_325, diaChi_325, uuTien_325);
    }

    @Override
    public void hienThiThongTin_325() {
        super.hienThiThongTin_325();
        System.out.println("Khoi thi: C");
        System.out.println("Mon thi: " + mon_325);
    }
}
