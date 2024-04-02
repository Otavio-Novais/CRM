// Principio de Segregação de Interface
// Inversão de Dependência
public interface Employee {
    public void addEmployee(String n, String j, String p,Double k, Double i);

    public void updateEmployee(String n, String j, String p, Double k, Double i);

    public void deleteEmployee();
    public void showEmployee();
}