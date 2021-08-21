package co.edu.utp.misiontic2022.c2;

public class Requerimiento_2 {
     // Operaciones de la clase requerimiento 2 -- su código   

 
    // Atributos
    private String InitDate;
    private String City;
    private String Builder;
    private String Leader;
    private Integer TypeCode;
    private Integer BuildStratum;

    public Requerimiento_2(){

    }

    public Requerimiento_2(String InitDate, String City, String Builder, String Leader, 
                           Integer TypeCode, Integer BuildStratum){
        this.setInitDate(InitDate);
        this.setCity(City);
        this.setBuilder(Builder);
        this.setLeader(Leader);
        this.setTypeCode(TypeCode);
        this.setBuildStratum(BuildStratum);
    }


    public Integer getBuildStratum() {
        return BuildStratum;
    }
    public String getInitDate() {
        return InitDate;
    }
    public void setInitDate(String InitDate) {
        this.InitDate = InitDate;
    }
    public String getCity() {
        return City;
    }
    public void setCity(String City) {
        this.City = City;
    }
    public String getBuilder() {
        return Builder;
    }
    public void setBuilder(String Builder) {
        this.Builder = Builder;
    }
    public String getLeader() {
        return Leader;
    }
    public void setLeader(String Leader) {
        this.Leader = Leader;
    }
    public Integer getTypeCode() {
        return TypeCode;
    }
    public void setTypeCode(Integer TypeCode) {
        this.TypeCode = TypeCode;
    }
    public void setBuildStratum(Integer BuildStratum) {
        this.BuildStratum = BuildStratum;
    }
   

}
