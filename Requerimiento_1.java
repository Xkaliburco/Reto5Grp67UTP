package co.edu.utp.misiontic2022.c2;

public class Requerimiento_1 {
    // Operaciones de la clase requerimiento 1 -- su código
    private String BuyDate;
    private Integer BuyCode;
    private String SupplierName;
    private String Paid;

    public Requerimiento_1(){

    }

    public Requerimiento_1(String BuyDate,Integer BuyCode, String SupplierName, String Paid){
        this.setBuyDate(BuyDate);
        this.setBuyCode(BuyCode);
        this.setSupplierName(SupplierName);
        this.setPaid(Paid);
    }

    
    public String getPaid() {
        return Paid;
    }
    public String getBuyDate() {
        return BuyDate;
    }
    public void setBuyDate(String BuyDate) {
        this.BuyDate = BuyDate;
    }
    public Integer getBuyCode() {
        return BuyCode;
    }
    public void setBuyCode(Integer BuyCode) {
        this.BuyCode = BuyCode;
    }
    public String getSupplierName() {
        return SupplierName;
    }
    public void setSupplierName(String SupplierName) {
        this.SupplierName = SupplierName;
    }
    public void setPaid(String Paid) {
        this.Paid = Paid;
    }


}
