// Class ini adalah untuk menampung semua data mengenai jenis pekerjaan

public class JenisPekerjaan {

    private String namaPerusahaan;
    private String alamatPerusahaan;
    private String pekerjaanYangDitawarkan;
    private String kriteria;
    private String gaji;

    public JenisPekerjaan() {
    }

    public JenisPekerjaan(String namaPerusahaan, String alamatPerusahaan, String pekerjaanYangDitawarkan, String kriteria, String gaji) {
        this.namaPerusahaan = namaPerusahaan;
        this.alamatPerusahaan = alamatPerusahaan;
        this.pekerjaanYangDitawarkan = pekerjaanYangDitawarkan;
        this.kriteria = kriteria;
        this.gaji = gaji;
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

    public String getPekerjaanYangDitawarkan() {
        return this.pekerjaanYangDitawarkan;
    }

    public void setPekerjaanYangDitawarkan(String pekerjaanYangDitawarkan) {
        this.pekerjaanYangDitawarkan = pekerjaanYangDitawarkan;
    }

    public String getKriteria() {
        return this.kriteria;
    }

    public void setKriteria(String kriteria) {
        this.kriteria = kriteria;
    }

    public String getGaji() {
        return this.gaji;
    }

    public void setGaji(String gaji) {
        this.gaji = gaji;
    }

    @Override
    public String toString() {
        return "{" +
                " nama_perusahaan='" + getNamaPerusahaan() + "'" +
                ", alamat_perusahaan='" + getAlamatPerusahaan() + "'" +
                ", pekerjaan_yang_ditawarkan='" + getPekerjaanYangDitawarkan() + "'" +
                ", kriteria='" + getKriteria() + "'" +
                ", gaji='" + getGaji() + "'" +
                "}";
    }

}