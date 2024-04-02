public class EmployeePJ implements Employee{
    private String name;
    private String email;
    private String phone;
    private Double salary;
    private Double tax;

    public EmployeePJ(String name, String email, String phone, Double salary, Double tax) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.tax = tax;
    }

    @Override
    public void addEmployee(String n, String j, String p, Double k, Double i) {
        this.name=n;
        this.email = j;
        this.phone = p;
        this.salary = k;
        this.tax = i;
    }

    @Override
    public void updateEmployee(String n, String j, String p, Double k, Double i) {
        this.name=n;
        this.email = j;
        this.phone = p;
        this.salary = k;
        this.tax = i;
    }

    @Override
    public void deleteEmployee() {
        this.name = null;
        this.phone = null;
        this.email = null;
        this.salary = null;
        this.tax = null;
    }

    @Override
    public void showEmployee() {
        System.out.println(this.name + this.email + this.phone + this.salary + this.tax);
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

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }
}
