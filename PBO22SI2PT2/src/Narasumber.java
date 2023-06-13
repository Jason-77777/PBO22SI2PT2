//Class ini adalah untuk menyimpan data Narasumber yang akan melakukan sesi training
// Data narasumber ini berisikan nama, usia, profesi, cv, dan fokus materi

public class Narasumber {
    private String nama;
    private String jenisKelamin;
    private String usia;
    private String email;
    private String nomorTelepon;
    private String lulusan;
    private String jabatan;
    private String perusahaan;


    public Narasumber (){
        
    }
    
    public Narasumber(String nama, String jenisKelamin, String usia, String email, String nomorTelepon, String lulusan, String jabatan, String perusahaan) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
        this.email = email;
        this.nomorTelepon = nomorTelepon;
        this.lulusan = lulusan;
        this.jabatan = jabatan;
        this.perusahaan = perusahaan;
    }


    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenisKelamin() {
        return this.jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getUsia() {
        return this.usia;
    }

    public void setUsia(String usia) {
        this.usia = usia;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNomorTelepon() {
        return this.nomorTelepon;
    }

    public void setNomorTelepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }

    public String getLulusan() {
        return this.lulusan;
    }

    public void setLulusan(String lulusan) {
        this.lulusan = lulusan;
    }

    public String getJabatan() {
        return this.jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getPerusahaan() {
        return this.perusahaan;
    }

    public void setPerusahaan(String perusahaan) {
        this.perusahaan = perusahaan;
    }


    @Override
    public String toString() {
        return "{" +
            " nama='" + getNama() + "'" +
            ", jenis_kelamin='" + getJenisKelamin() + "'" +
            ", usia='" + getUsia() + "'" +
            ", email='" + getEmail() + "'" +
            ", nomor_telepon='" + getNomorTelepon() + "'" +
            ", lulusan='" + getLulusan() + "'" +
            ", jabatan='" + getJabatan() + "'" +
            ", perusahaan='" + getPerusahaan() + "'" +
            "}";
    }

}