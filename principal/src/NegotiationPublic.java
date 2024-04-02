import java.util.Date;

public class NegotiationPublic extends Negotiation {

private float taxPublic;

    private NegotiationPublic(float tax, int idNegotiation, Date date, Double value, String status, Contacts contacts, String productService, String observation)
    {
        super(idNegotiation, date,  value,  status,  contacts,  productService,  observation);
        this.taxPublic = tax;
    }

    public void closeNegotiation(){
        this.closeNegotiation();
    }
}
