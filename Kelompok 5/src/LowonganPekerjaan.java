public class LowonganPekerjaan {

    private String idLowongan;
    private String idPerusahaan;
    private String namaPerusahaan;
    private String jobdesc;
    private String jumlahPekerja;
    private JenisPekerjaan jenisPekerjaan;
    private String lokasi;
    private String lulusan;


    public LowonganPekerjaan() {
    }


    public LowonganPekerjaan(String idLowongan, String idPerusahaan, String namaPerusahaan, String jobdesc, String jumlahPekerja, JenisPekerjaan jenisPekerjaan, String lokasi, String lulusan) {
        this.idLowongan = idLowongan;
        this.idPerusahaan = idPerusahaan;
        this.namaPerusahaan = namaPerusahaan;
        this.jobdesc = jobdesc;
        this.jumlahPekerja = jumlahPekerja;
        this.jenisPekerjaan = jenisPekerjaan;
        this.lokasi = lokasi;
        this.lulusan = lulusan;
    }


    public String getIdLowongan() {
        return this.idLowongan;
    }

    public void setIdLowongan(String idLowongan) {
        this.idLowongan = idLowongan;
    }

    public String getIdPerusahaan() {
        return this.idPerusahaan;
    }

    public void setIdPerusahaan(String idPerusahaan) {
        this.idPerusahaan = idPerusahaan;
    }

    public String getNamaPerusahaan() {
        return this.namaPerusahaan;
    }

    public void setNamaPerusahaan(String namaPerusahaan) {
        this.namaPerusahaan = namaPerusahaan;
    }

    public String getJobdesc() {
        return this.jobdesc;
    }

    public void setJobdesc(String jobdesc) {
        this.jobdesc = jobdesc;
    }

    public String getJumlahPekerja() {
        return this.jumlahPekerja;
    }

    public void setJumlahPekerja(String jumlahPekerja) {
        this.jumlahPekerja = jumlahPekerja;
    }

    public JenisPekerjaan getJenisPekerjaan() {
        return this.jenisPekerjaan;
    }

    public void setJenisPekerjaan(JenisPekerjaan jenisPekerjaan) {
        this.jenisPekerjaan = jenisPekerjaan;
    }

    public String getLokasi() {
        return this.lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public String getLulusan() {
        return this.lulusan;
    }

    public void setLulusan(String lulusan) {
        this.lulusan = lulusan;
    }


    @Override
    public String toString() {
        return "{" +
            " Id Lowongan ='" + getIdLowongan() + "'" +
            ", Id Perusahaan = '" + getIdPerusahaan() + "'" +
            ", Nama perusahaan = '" + getNamaPerusahaan() + "'" +
            ", Job desc = '" + getJobdesc() + "'" +
            ", Jumlah pekerja = '" + getJumlahPekerja() + "'" +
            ", Jenis pekerjaan = '" + getJenisPekerjaan() + "'" +
            ", Lokasi = '" + getLokasi() + "'" +
            ", Lulusan = '" + getLulusan() + "'" +
            "}";
    }
    
    
}
