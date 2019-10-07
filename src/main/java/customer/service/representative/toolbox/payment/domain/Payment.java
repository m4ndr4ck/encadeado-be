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

    @Getter private final Invoice.InvoiceId invoiceId;


    /**
     * Creates an {@link Payment} entity without an ID. Use to create a new entity that is not yet
     * persisted.
     */
    public static Payment withoutId(
            Money money,
            Invoice.InvoiceId invoiceId) {
        return new Payment(null, money, invoiceId);
    }

    /**
     * Creates an {@link Payment} entity with an ID. Use to reconstitute a persisted entity.
     */
    public static Payment withId(
            PaymentId paymentId,
            Money money,
            Invoice.InvoiceId invoiceId) {
        return new Payment(paymentId, money, invoiceId);
    }


    public boolean makePayment() {
        if (!mayPay(this.invoiceId)) {
            return false;
        }
        return true;
    }

    private boolean mayPay(Invoice.InvoiceId invoiceId) {
        /* Has enough money to pay the invoice */
        return true;
    }

    @Value
    public static class PaymentId {
        private Long value;
    }

}
