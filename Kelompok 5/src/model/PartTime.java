package model;

public class PartTime extends JenisPekerjaan{

    public PartTime(String tipePekerjaanPartTime, String asuransiTenagaKerja, String tunjanganLembur) {
        super(tipePekerjaanPartTime, asuransiTenagaKerja, tunjanganLembur);
    }

    @Override
    public String toString() {
        return "" + super.toString();
    }

    
}
