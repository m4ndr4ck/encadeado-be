package customer.service.representative.toolbox.payment.domain;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.Value;

import java.math.BigInteger;

@Value
public class Invoice {

    @NonNull
    @Getter
    @Setter
    private final BigInteger amount;

    @Getter private final InvoiceId id;

    @Value
    public static class InvoiceId {
        private Long value;
    }



}
