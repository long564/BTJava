public class TapChi extends TaiLieu {
    private int soPhatHanh_325;
    private int thangPhatHanh_325;

    public TapChi(String maTaiLieu_325, String tenNhaXuatBan_325, int soBanPhatHanh_325, int soPhatHanh_325, int thangPhatHanh_325) {
        super(maTaiLieu_325, tenNhaXuatBan_325, soBanPhatHanh_325);
        this.soPhatHanh_325 = soPhatHanh_325;
        this.thangPhatHanh_325 = thangPhatHanh_325;
    }

    @Override
    public void hienThiThongTin_325() {
        super.hienThiThongTin_325();
        System.out.println("So phat hanh: " + soPhatHanh_325);
        System.out.println("Thang phat hanh: " + thangPhatHanh_325);
    }
}
