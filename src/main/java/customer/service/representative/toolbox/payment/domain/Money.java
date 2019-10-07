package customer.service.representative.toolbox.payment.domain;

import java.math.BigInteger;
import lombok.NonNull;
import lombok.Value;

@Value
public class Money {

    @NonNull
    private final BigInteger amount;

    public static Money of(long value) {
        return new Money(BigInteger.valueOf(value));
    }

}
