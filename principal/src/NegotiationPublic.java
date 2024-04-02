import java.util.Date;

//Todas as funções são de responsabilidade única, respeitam demeter
// Além de que respeita os conceitos de aberto/fechado e a substituição de Liskov


public class NegotiationPublic extends Negotiation {

private float taxPublic;

    private NegotiationPublic(float tax, int idNegotiation, Date date, Double value, String status, Contacts contacts, String productService, String observation)
    {
        super(idNegotiation, date,  value,  status,  contacts,  productService,  observation);
        this.taxPublic = tax;
    }

    public void CloseNegotiation(){
        this.closeNegotiation();
    }

    public float getTax(){
        return this.taxPublic;
    }

}
