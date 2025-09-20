import java.util.Scanner;
// Lớp phân số
class PhanSo {
    private int tuSo;
    private int mauSo;

    // Constructor không tham số
    public PhanSo() {
        this.tuSo = 0;
        this.mauSo = 1;
    }

    // Constructor có tham số
    public PhanSo(int tuSo, int mauSo) {
        if (mauSo == 0) {
            throw new IllegalArgumentException("Mẫu số không được bằng 0");
        }
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    // Getter
    public int getTuSo() {
        return tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    // Tìm UCLN
    private int ucln(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    // Kiểm tra tối giản
    public boolean laToiGian() {
        return ucln(tuSo, mauSo) == 1;
    }

    // Rut gon
    public PhanSo toiGian() {
        int u = ucln(tuSo, mauSo);
        return new PhanSo(tuSo / u, mauSo / u);
    }

    // Cộng
    public PhanSo cong(PhanSo ps) {
        int tu = this.tuSo * ps.mauSo + ps.tuSo * this.mauSo;
        int mau = this.mauSo * ps.mauSo;
        return new PhanSo(tu, mau).toiGian();
    }

    // Trừ
    public PhanSo tru(PhanSo ps) {
        int tu = this.tuSo * ps.mauSo - ps.tuSo * this.mauSo;
        int mau = this.mauSo * ps.mauSo;
        return new PhanSo(tu, mau).toiGian();
    }

    // Nhân
    public PhanSo nhan(PhanSo ps) {
        int tu = this.tuSo * ps.tuSo;
        int mau = this.mauSo * ps.mauSo;
        return new PhanSo(tu, mau).toiGian();
    }

    // Chia
    public PhanSo chia(PhanSo ps) {
        int tu = this.tuSo * ps.mauSo;
        int mau = this.mauSo * ps.tuSo;
        return new PhanSo(tu, mau).toiGian();
    }

    // Hiển thị phân số
    public void hienThi() {
        if (mauSo == 1) {
            System.out.println(tuSo);
        } else {
            System.out.println(tuSo + "/" + mauSo);
        }
    }
}