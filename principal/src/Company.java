public class Company {
    private int idCompany;
    private String name;
    private String segment;

    public Company(int idCompany, String name, String segment) {
        this.idCompany = idCompany;
        this.name = name;
        this.segment = segment;
    }

    public Company addCompany(int idCompany, String name, String segment){
        Company newCompany = new Company(idCompany, name, segment);
        return newCompany;
    }

    public void updateCompany(String name, String segment){
        this.name = name;
        this.segment = segment;
    }

    public void deleteCompany() {
        this.idCompany = -1;
        this.name = null;
        this.segment = null;
    }

    public void showCompany(){
        System.out.println("Id: " + this.idCompany + "Nome: " +this.name + "Segmento: " + this.segment);
    }


    public int getIdCompany() {
        return idCompany;
    }

    public void setIdCompany(int idCompany) {
        this.idCompany = idCompany;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSegment() {
        return segment;
    }

    public void setSegment(String segment) {
        this.segment = segment;
    }
}
