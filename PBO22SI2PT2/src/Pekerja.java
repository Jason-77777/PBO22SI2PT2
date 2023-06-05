//Pekerja adalah sebuah badan usaha yang melibatkan hubungan antara atasan dengan pekerja/karyawan.
// isinya adalah data yang menyangkut pekerja seperti data diri, alamat, dll

public class Pekerja {
    private String nama_Id;
    private String biodata;
    private String nomor_handphone;
    private String alamat;

    public Pekerja (){

    }

    public Pekerja(String nama_Id, String biodata, String nomor_handphone, String alamat){
        this.nama_Id = nama_Id;
        this.biodata = biodata;
        this.nomor_handphone = nomor_handphone;
        this.alamat= alamat;
    }
    public String getNama_Id() {
        return this.nama_Id;
    }

    public void setNama_Id(String nama_Id) {
        this.nama_Id = nama_Id;
    }

    public String getBiodata() {
        return this.biodata;
    }

    public void setBiodata(String biodata) {
        this.biodata = biodata;
    }

    public String getNomor_handphone() {
        return this.nomor_handphone;
    }

    public void setNomor_handphone(String nomor_handphone) {
        this.nomor_handphone = nomor_handphone;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }


    @Override
    public String toString() {
        return "{" +
            " nama_Id='" + getNama_Id() + "'" +
            ", biodata='" + getBiodata() + "'" +
            ", nomor_handphone='" + getNomor_handphone() + "'" +
            ", alamat='" + getAlamat() + "'" +
            "}";
    }

}
