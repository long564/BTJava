public class Bao extends TaiLieu {
    private String ngayPhatHanh_325;

    public Bao(String maTaiLieu_325, String tenNhaXuatBan_325, int soBanPhatHanh_325, String ngayPhatHanh_325) {
        super(maTaiLieu_325, tenNhaXuatBan_325, soBanPhatHanh_325);
        this.ngayPhatHanh_325 = ngayPhatHanh_325;
    }

    @Override
    public void hienThiThongTin_325() {
        super.hienThiThongTin_325();
        System.out.println("Ngay phat hanh: " + ngayPhatHanh_325);
    }
}
