import java.util.Date;
import java.text.SimpleDateFormat;

public class Negotiation {
    private int idNegotiation;
    private Date date;
    private Double value;
    private String status;
    private Contacts contacts;
    private String productService;
    private String observation;

    public Negotiation(int idNegotiation, Date date, Double value, String status, Contacts contacts, String productService, String observation) {
        this.idNegotiation = idNegotiation;
        this.date = date;
        this.value = value;
        this.status = status;
        this.contacts = contacts;
        this.productService = productService;
        this.observation = observation;
    }

    public Negotiation addNegotiation(int idNegotiation, Date date, Double value, String status, Contacts contacts, String productService, String observation){
        Negotiation newNegotiation = new Negotiation(idNegotiation, date, value, status, contacts, productService, observation);
        return newNegotiation;
    }

    public void updateNegotiation(Date date, Double value, String status, Contacts contacts, String productService, String observation){
        this.date = date;
        this.value = value;
        this.status = status;
        this.contacts = contacts;
        this.productService = productService;
        this.observation = observation;
    }

    public void deleteNegotiation(){
        this.idNegotiation = -1;
        this.date = null;
        this.value = -1.0;
        this.status = null;
        this.contacts = null;
        this.productService = null;
        this.observation = null;
    } 

    public void showNegotiation(){
        System.out.println("Id: " + this.idNegotiation + "date: " + this.date + "value: " + this.value + "status: " + this.status + "productService: " + this.productService + "Observação: " + this.observation);
    }

    public void updateObservation(String s){
        this.observation = s;
    }

    public void closeNegotiation(){
        this.status = "closed";
    }

    public int getIdNegotiation() {
        return idNegotiation;
    }

    public void setIdNegotiation(int idNegotiation) {
        this.idNegotiation = idNegotiation;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Contacts getContacts() {
        return contacts;
    }

    public void setContacts(Contacts contacts) {
        this.contacts = contacts;
    }

    public String getProductService() {
        return productService;
    }

    public void setProductService(String productService) {
        this.productService = productService;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }
}
