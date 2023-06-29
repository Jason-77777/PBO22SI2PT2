public class LowonganPekerjaan {

    private String namaPerusahaan;
    private String jobdesc;
    private String jumlahPekerja;
    private String jenisPekerjaan;
    private String lokasi;
    private String lulusan;

    public LowonganPekerjaan() {
    }


    public LowonganPekerjaan(String namaPerusahaan, String jobdesc, String jumlahPekerja, String jenisPekerjaan, String lokasi, String lulusan) {
        this.namaPerusahaan = namaPerusahaan;
        this.jobdesc = jobdesc;
        this.jumlahPekerja = jumlahPekerja;
        this.jenisPekerjaan = jenisPekerjaan;
        this.lokasi = lokasi;
        this.lulusan = lulusan;
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

    public String getJenisPekerjaan() {
        return this.jenisPekerjaan;
    }

    public void setJenisPekerjaan(String jenisPekerjaan) {
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
            " namaPerusahaan='" + getNamaPerusahaan() + "'" +
            ", jobdesc='" + getJobdesc() + "'" +
            ", jumlahPekerja='" + getJumlahPekerja() + "'" +
            ", jenisPekerjaan='" + getJenisPekerjaan() + "'" +
            ", lokasi='" + getLokasi() + "'" +
            ", lulusan='" + getLulusan() + "'" +
            "}";
    }




    
}
