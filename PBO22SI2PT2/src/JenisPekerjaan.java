// Class ini adalah untuk menampung semua data mengenai jenis pekerjaan

public class JenisPekerjaan {

    private String nama_perusahaan;
    private String alamat_perusahaan;
    private String pekerjaan_yang_ditawarkan;
    private String kriteria;
    private String gaji;


    public String getNama_perusahaan() {
        return this.nama_perusahaan;
    }

    public void setNama_perusahaan(String nama_perusahaan) {
        this.nama_perusahaan = nama_perusahaan;
    }

    public String getAlamat_perusahaan() {
        return this.alamat_perusahaan;
    }

    public void setAlamat_perusahaan(String alamat_perusahaan) {
        this.alamat_perusahaan = alamat_perusahaan;
    }

    public String getPekerjaan_yang_ditawarkan() {
        return this.pekerjaan_yang_ditawarkan;
    }

    public void setPekerjaan_yang_ditawarkan(String pekerjaan_yang_ditawarkan) {
        this.pekerjaan_yang_ditawarkan = pekerjaan_yang_ditawarkan;
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
    
}