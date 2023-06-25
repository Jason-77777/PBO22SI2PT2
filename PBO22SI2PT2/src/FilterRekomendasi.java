public class FilterRekomendasi {
    private String usia;
    private String jenisKelamin;
    private String gajiYangDiinginkan;
    private String jenis;
    private String namaPerusahaan;
    private String lokasi;
    private String lulusan;

    public FilterRekomendasi(){

    }

    public FilterRekomendasi(String usia, String jenisKelamin, String gajiYangDiinginkan, String jenis, String namaPerusahaan, String lokasi, String lulusan) {
        this.usia = usia;
        this.jenisKelamin = jenisKelamin;
        this.gajiYangDiinginkan = gajiYangDiinginkan;
        this.jenis = jenis;
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

    public String getJenis() {
        return this.jenis;
    }

    public void setJenisPekerjaan(String jenis) {
        this.jenis = jenis;
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
            ", jenis='" + getJenis() + "'" +
            ", namaPerusahaan='" + getNamaPerusahaan() + "'" +
            ", lokasi='" + getLokasi() + "'" +
            ", lulusan='" + getLulusan() + "'" +
            "}";
    }

}
