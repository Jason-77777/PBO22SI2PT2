package model;

public class PartTime extends JenisPekerjaan{

    public PartTime(String idJenisPekerjaan, String tipePekerjaanFullTime,
            String tipePekerjaanPartTime) {
        super(idJenisPekerjaan, tipePekerjaanFullTime, tipePekerjaanPartTime);
    }

    @Override
    public String toString() {
        return "" + super.toString();
    }

    
}
