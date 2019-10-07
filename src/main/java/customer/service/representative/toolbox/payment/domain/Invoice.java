package customer.service.representative.toolbox.payment.domain;

import lombok.Getter;
import lombok.Value;

@Value
public class Invoice {

    @Getter
    public final long id;


    public static Invoice withId(long invoiceId) {
        return new Invoice(invoiceId);
    }

}
