package model;

public abstract class JenisPekerjaan {

    private String namaPerusahaan;
    private String alamatPerusahaan;
    private String nomorTelp;
    private String jamKerja;
    private String gaji;
    private String tipepekerjaan;
    private String tipePekerjaanFulllTime;
    private String tipePekerjaanPartTime;

    public JenisPekerjaan(String namaPerusahaan, String alamatPerusahaan, String nomorTelp, String jamKerja, String gaji, String tipepekerjaan, String tipePekerjaanFulllTime, String tipePekerjaanPartTime) {
        this.namaPerusahaan = namaPerusahaan;
        this.alamatPerusahaan = alamatPerusahaan;
        this.nomorTelp = nomorTelp;
        this.jamKerja = jamKerja;
        this.gaji = gaji;
        this.tipepekerjaan = tipepekerjaan;
        this.tipePekerjaanFulllTime = tipePekerjaanFulllTime;
        this.tipePekerjaanPartTime = tipePekerjaanPartTime;
    }


    @Override
    public String toString() {
        return "{" +
            " namaPerusahaan='" + getNamaPerusahaan() + "'" +
            ", alamatPerusahaan='" + getAlamatPerusahaan() + "'" +
            ", nomorTelp='" + getNomorTelp() + "'" +
            ", jamKerja='" + getJamKerja() + "'" +
            ", gaji='" + getGaji() + "'" +
            ", tipepekerjaan='" + getTipepekerjaan() + "'" +
            ", tipePekerjaanFulllTime='" + getTipePekerjaanFulllTime() + "'" +
            ", tipePekerjaanPartTime='" + getTipePekerjaanPartTime() + "'" +
            "}";
    }


    private String getTipePekerjaanPartTime() {
        return null;
    }


    private String getTipePekerjaanFulllTime() {
        return null;
    }


    private String getTipepekerjaan() {
        return null;
    }


    private String getGaji() {
        return null;
    }


    private String getJamKerja() {
        return null;
    }


    private String getNomorTelp() {
        return null;
    }


    private String getAlamatPerusahaan() {
        return null;
    }


    private String getNamaPerusahaan() {
        return null;
    }



}