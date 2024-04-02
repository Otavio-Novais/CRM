import java.util.Date;

public class NegotiationPrivate extends Negotiation {

private float taxPrivate;

    private NegotiationPrivate(float taxPrivate, int idNegotiation, Date date, Double value, String status, Contacts contacts, String productService, String observation)
    {
        super(idNegotiation, date,  value,  status,  contacts,  productService,  observation);
        this.taxPrivate = taxPrivate;
    }

    public void closeNegotiation(){
        this.closeNegotiation();
    }
}
