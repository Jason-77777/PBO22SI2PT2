public class FilterRekomendasi {
    private String usia;
    private String jenisKelamin;
    private String gajiYangDiinginkan;
    private String jenisPekerjaan;
    private String lokasi;
    private String lulusan;


    public FilterRekomendasi() {
    }


    public FilterRekomendasi(String usia, String jenisKelamin, String gajiYangDiinginkan, String jenisPekerjaan, String lokasi, String lulusan) {
        this.usia = usia;
        this.jenisKelamin = jenisKelamin;
        this.gajiYangDiinginkan = gajiYangDiinginkan;
        this.jenisPekerjaan = jenisPekerjaan;
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
            ", lokasi='" + getLokasi() + "'" +
            ", lulusan='" + getLulusan() + "'" +
            "}";
    }
    
}
