import java.util.Date;

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
