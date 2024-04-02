public class EmployeeCLT implements Employee {
    private String name;
    private String email;
    private String phone;
    private Double salary;
    private Double FGTS;

    public EmployeeCLT(String name, String email, String phone, Double salary, Double FGTS) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.FGTS = FGTS;
    }

    @Override
    public void addEmployee(String n, String j, String p, Double k, Double i) {
        this.name=n;
        this.email = j;
        this.phone = p;
        this.salary = k;
        this.FGTS = i;
    }

    @Override
    public void updateEmployee(String n, String j, String p, Double k, Double i) {
        this.name=n;
        this.email = j;
        this.phone = p;
        this.salary = k;
        this.FGTS = i;
    }

    @Override
    public void deleteEmployee() {
        this.name = null;
        this.phone = null;
        this.email = null;
        this.salary = null;
        this.FGTS = null;
    }

    @Override
    public void showEmployee() {
        System.out.println(this.name + this.email + this.phone + this.salary + this.FGTS);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Double getFGTS() {
        return FGTS;
    }

    public void setFGTS(Double FGTS) {
        this.FGTS = FGTS;
    }
}
