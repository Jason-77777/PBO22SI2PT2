public class FilterRekomendasi {
    private String usia;
    private String jenisKelamin;
    private String gajiYangDiinginkan;
    private String jenisPekerjaan;
    private String namaPerusahaan;
    private String lokasi;
    private String lulusan;

    private Perusahaan perusahaan;
    
    public FilterRekomendasi(){

    }

    public FilterRekomendasi(Perusahaan perusahaan){
        this.perusahaan = perusahaan;
    }

    public Perusahaan getPerusahaan() {
        return this.perusahaan;
    }

    public void setPerusahaan(Perusahaan perusahaan) {
        this.perusahaan = perusahaan;
    }


    public FilterRekomendasi(String usia, String jenisKelamin, String gajiYangDiinginkan, String jenisPekerjaan, String namaPerusahaan, String lokasi, String lulusan) {
        this.usia = usia;
        this.jenisKelamin = jenisKelamin;
        this.gajiYangDiinginkan = gajiYangDiinginkan;
        this.jenisPekerjaan = jenisPekerjaan;
        this.namaPerusahaan = namaPerusahaan;
        this.lokasi = lokasi;
        this.lulusan = lulusan;
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

    public String getGajiYangDiinginkan() {
        return this.gajiYangDiinginkan;
    }

    public void setGajiYangDiinginkan(String gajiYangDiinginkan) {
        this.gajiYangDiinginkan = gajiYangDiinginkan;
    }

    public String getJenisPekerjaan() {
        return this.jenisPekerjaan;
    }

    public void setJenisPekerjaan(String jenisPekerjaan) {
        this.jenisPekerjaan = jenisPekerjaan;
    }

    public String getNamaPerusahaan() {
        return this.namaPerusahaan;
    }

    public void setNamaPerusahaan(String namaPerusahaan) {
        this.namaPerusahaan = namaPerusahaan;
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
            " usia='" + getUsia() + "'" +
            ", jenisKelamin='" + getJenisKelamin() + "'" +
            ", gajiYangDiinginkan='" + getGajiYangDiinginkan() + "'" +
            ", jenisPekerjaan='" + getJenisPekerjaan() + "'" +
            ", namaPerusahaan='" + getNamaPerusahaan() + "'" +
            ", lokasi='" + getLokasi() + "'" +
            ", lulusan='" + getLulusan() + "'" +
            "}";
    }

}
