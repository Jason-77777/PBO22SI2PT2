//Pekerja adalah sebuah badan usaha yang melibatkan hubungan antara atasan dengan pekerja/karyawan.
// isinya adalah data yang menyangkut pekerja seperti data diri, alamat, dll

public class Pekerja {

    private String idPekerja;
    private String idJenisPekerjaan;
    private String nama;
    private String usia;
    private String jenisKelamin;
    private String alamat;
    private String nomorHP;
    private String email;
    private String lulusan;
    private String jenisPekerjaan;

    public Pekerja() {
    }
   

    public Pekerja(String idPekerja, String idJenisPekerjaan, String nama, String usia, String jenisKelamin, String alamat, String nomorHP, String email, String lulusan, String jenisPekerjaan) {
        this.idPekerja = idPekerja;
        this.idJenisPekerjaan = idJenisPekerjaan;
        this.nama = nama;
        this.usia = usia;
        this.jenisKelamin = jenisKelamin;
        this.alamat = alamat;
        this.nomorHP = nomorHP;
        this.email = email;
        this.lulusan = lulusan;
        this.jenisPekerjaan = jenisPekerjaan;
    }


    public String getIdPekerja() {
        return this.idPekerja;
    }

    public void setIdPekerja(String idPekerja) {
        this.idPekerja = idPekerja;
    }

    public String getIdJenisPekerjaan() {
        return this.idJenisPekerjaan;
    }

    public void setIdJenisPekerjaan(String idJenisPekerjaan) {
        this.idJenisPekerjaan = idJenisPekerjaan;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUsia() {
        return this.usia;
    }

    public void setUsia(String usia) {
        this.usia = usia;
    }

    public String getJenisKelamin() {
        return this.jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNomorHP() {
        return this.nomorHP;
    }

    public void setNomorHP(String nomorHP) {
        this.nomorHP = nomorHP;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLulusan() {
        return this.lulusan;
    }

    public void setLulusan(String lulusan) {
        this.lulusan = lulusan;
    }

    public String getJenisPekerjaan() {
        return this.jenisPekerjaan;
    }

    public void setJenisPekerjaan(String jenisPekerjaan) {
        this.jenisPekerjaan = jenisPekerjaan;
    }


    @Override
    public String toString() {
        return "{" +
            " ID Pekerja = '" + getIdPekerja() + "'" +
            ", ID Jenis Pekerjaan = '" + getIdJenisPekerjaan() + "'" +
            ", Nama = '" + getNama() + "'" +
            ", Usia = '" + getUsia() + "'" +
            ", Jenis Kelamin = '" + getJenisKelamin() + "'" +
            ", Alamat = '" + getAlamat() + "'" +
            ", No.HP = '" + getNomorHP() + "'" +
            ", Email = '" + getEmail() + "'" +
            ", Lulusan = '" + getLulusan() + "'" +
            ", Jenis pekerjaan = '" + getJenisPekerjaan() + "'" +
            "}";
    }

    
}
