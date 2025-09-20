public class Sach extends TaiLieu {
    private String tenTacGia_325;
    private int soTrang_325;

    public Sach(String maTaiLieu_325, String tenNhaXuatBan_325, int soBanPhatHanh_325, String tenTacGia_325, int soTrang_325) {
        super(maTaiLieu_325, tenNhaXuatBan_325, soBanPhatHanh_325);
        this.tenTacGia_325 = tenTacGia_325;
        this.soTrang_325 = soTrang_325;
    }

    @Override
    public void hienThiThongTin_325() {
        super.hienThiThongTin_325();
        System.out.println("Tac gia: " + tenTacGia_325);
        System.out.println("So trang: " + soTrang_325);
    }
}
