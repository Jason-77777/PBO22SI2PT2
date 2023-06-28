//Perusahaan adalah sebuah badan usaha yang tetap dan didirikan oleh manusia yang bertujuan mencari laba atau keuntungan

public class Perusahaan {
    private String namaPerusahaan;
    private String alamatPerusahaan;
    private String email;
    private String nomorTelp;


    public Perusahaan() {
    }


    public Perusahaan(String namaPerusahaan, String alamatPerusahaan, String email, String nomorTelp) {
        this.namaPerusahaan = namaPerusahaan;
        this.alamatPerusahaan = alamatPerusahaan;
        this.email = email;
        this.nomorTelp = nomorTelp;
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

    public String getNomorTelp() {
        return this.nomorTelp;
    }

    public void setNomorTelp(String nomorTelp) {
        this.nomorTelp = nomorTelp;
    }


    @Override
    public String toString() {
        return "{" +
            " namaPerusahaan='" + getNamaPerusahaan() + "'" +
            ", alamatPerusahaan='" + getAlamatPerusahaan() + "'" +
            ", email='" + getEmail() + "'" +
            ", nomorTelp='" + getNomorTelp() + "'" +
            "}";
    }
    
    
}
