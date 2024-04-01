public class Company {
    private int idCompany;
    private String name;
    private String segment;

    public Company(int idCompany, String name, String segment) {
        this.idCompany = idCompany;
        this.name = name;
        this.segment = segment;
    }

//    Adicionar métodos

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
