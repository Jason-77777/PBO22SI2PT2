//Class ini adalah untuk menyimpan data Narasumber yang akan melakukan sesi training
// Data narasumber ini berisikan nama, usia, profesi, cv, dan fokus materi

public class Narasumber {
    private String nama;
    private String jenis_kelamin;
    private String usia;
    private String email;
    private String nomor_telepon;
    private String lulusan;
    private String jabatan;
    private String perusahaan;

<<<<<<< HEAD
    public Narasumber (){
        
    }
    
    public Narasumber(String nama, String jenis_kelamin, String usia, String email, String nomor_telepon, String lulusan, String jabatan, String perusahaan) {
        this.nama = nama;
        this.jenis_kelamin = jenis_kelamin;
        this.usia = usia;
        this.email = email;
        this.nomor_telepon = nomor_telepon;
        this.lulusan = lulusan;
        this.jabatan = jabatan;
        this.perusahaan = perusahaan;
    }

=======
>>>>>>> 72eab9bbdb3f417467008d5b95ebec58348b1535
    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis_kelamin() {
        return this.jenis_kelamin;
    }

    public void setJenis_kelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
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

    public String getNomor_telepon() {
        return this.nomor_telepon;
    }

    public void setNomor_telepon(String nomor_telepon) {
        this.nomor_telepon = nomor_telepon;
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

<<<<<<< HEAD
    @Override
    public String toString() {
        return "{" +
            " nama='" + getNama() + "'" +
            ", jenis_kelamin='" + getJenis_kelamin() + "'" +
            ", usia='" + getUsia() + "'" +
            ", email='" + getEmail() + "'" +
            ", nomor_telepon='" + getNomor_telepon() + "'" +
            ", lulusan='" + getLulusan() + "'" +
            ", jabatan='" + getJabatan() + "'" +
            ", perusahaan='" + getPerusahaan() + "'" +
            "}";
    }
=======
>>>>>>> 72eab9bbdb3f417467008d5b95ebec58348b1535
}