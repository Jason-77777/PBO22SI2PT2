public class Perusahaan {

    private String idPerusahaan;
    private String namaPerusahaan;
    private String alamatPerusahaan;
    private String email;
    private String nomorHP;
    private LowonganPekerjaan lowonganPekerjaan;

    public Perusahaan() {
    }


    public Perusahaan(String namaPerusahaan, String alamatPerusahaan, String email, String nomorHP, String lowonganPekerjaan) {
        this.namaPerusahaan = namaPerusahaan;
        this.alamatPerusahaan = alamatPerusahaan;
        this.email = email;
        this.nomorHP = nomorHP;
        this.lowonganPekerjaan = lowonganPekerjaan;
    }


    public String getNamaPerusahaan() {
        return this.namaPerusahaan;
    }

    public void setNamaPerusahaan(String namaPerusahaan) {
        this.namaPerusahaan = namaPerusahaan;
    }

    public String getAlamatPerusahaan() {
        return this.alamatPerusahaan;
    }

    public void setAlamatPerusahaan(String alamatPerusahaan) {
        this.alamatPerusahaan = alamatPerusahaan;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNomorHP() {
        return this.nomorHP;
    }

    public void setNomorHP(String nomorHP) {
        this.nomorHP = nomorHP;
    }

    public String getLowonganPekerjaan() {
        return this.lowonganPekerjaan;
    }

    public void setLowonganPekerjaan(String lowonganPekerjaan) {
        this.lowonganPekerjaan = lowonganPekerjaan;
    }


    @Override
    public String toString() {
        return "{" +
            "Nama perusahaan = '" + getNamaPerusahaan() + "'" +
            ", Alamat = '" + getAlamatPerusahaan() + "'" +
            ", Email='" + getEmail() + "'" +
            ", No.Telp = '" + getNomorHP() + "'" +
            ", Lowongan pekerjaan yang tesedia = '" + getLowonganPekerjaan() + "'" +
            "}";
    }

}
