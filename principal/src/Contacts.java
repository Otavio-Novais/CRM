public class Contacts {
    private int idContacts;
    private String name;
    private String job;
    private String phone;
    private String email;
    private Company company;

    private Contacts(int id, String n, String j, String p, String e, Company c){
        this.idContacts = id;
        this.name = n;
        this.job = j;
        this.phone = p;
        this.email = e;
        this.company = c;
    }

    public void addContact(){
//Função
    }

    public void updateContact(){
//Função
    }

    public void deleteContact(){
//Função
    }

    public void showContact(){
//Função
    }

    public int getIdContacts() {
        return idContacts;
    }

    public void setIdContacts(int idContacts) {
        this.idContacts = idContacts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
