package customer.service.representative.toolbox.payment.domain;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Value;


/**
 * An application that create and holds information as Architecture Type, Gitlab repository, Jenkins CI/CD pipeline URLs,
 * Kubernetes Deployment, Ingress and Service information, Docker latest image version and the Docker image version
 * in production.
 */


@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Payment {


    @Getter private final PaymentId id;

    @Getter private final Money money;

    @Getter private final Invoice invoice;


    /**
     * Creates an {@link Payment} entity without an ID. Use to create a new entity that is not yet
     * persisted.
     */
    public static Payment withoutId(
            Money money,
            Invoice invoice) {
        return new Payment(null, money, invoice);
    }

    /**
     * Creates an {@link Payment} entity with an ID. Use to reconstitute a persisted entity.
     */
    public static Payment withId(
            PaymentId paymentId,
            Money money,
            Invoice invoice) {
        return new Payment(paymentId, money, invoice);
    }

    //Businesss logic
    public boolean makePayment() {
        if (!mayPay()) {
            return false;
        }
        return true;
    }

    //Businesss logic
    public boolean mayPay() {
        /* Has enough money to pay the invoice */
        return true;
    }

    @Value
    public static class PaymentId {
        private Long value;
    }

}
