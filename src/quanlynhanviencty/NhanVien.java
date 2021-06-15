package quanlynhanviencty;

public class NhanVien {
    private int maNhanVien;
    private String hoVaTen;
    private int age;
    private int phoneNumber;
    private String email;

    public NhanVien() {
    }

    public NhanVien(int maNhanVien, String hoVaTen, int age, int phoneNumber, String email) {
        this.maNhanVien = maNhanVien;
        this.hoVaTen = hoVaTen;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public int getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(int maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Thông Tin Nhân Viên Là: {" +
                "maNhanVien=" + maNhanVien +
                ", hoVaTen='" + hoVaTen + '\'' +
                ", age=" + age +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                '}';
    }
}
