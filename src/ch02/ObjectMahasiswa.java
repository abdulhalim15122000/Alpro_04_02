package ch02;

public class ObjectMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        mhs.nim = "10201";
        mhs.nama = "Andi";
        mhs.alamat = "Jl. Sudirman No.123";
        mhs.hp = "08123456789";
        mhs.cetak();
    }
}