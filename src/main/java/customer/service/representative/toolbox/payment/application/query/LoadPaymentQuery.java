package customer.service.representative.toolbox.payment.application.query;


import customer.service.representative.toolbox.payment.domain.Payment;
import customer.service.representative.toolbox.payment.domain.Payment.PaymentId;
import customer.service.representative.toolbox.payment.framework.helpers.common.SelfValidating;
import lombok.EqualsAndHashCode;
import lombok.Value;

import javax.validation.constraints.NotNull;

public interface LoadPaymentQuery {

    Payment loadPayment(LoadPaymentCommand payment);

    @Value
    @EqualsAndHashCode(callSuper = false)
    class LoadPaymentCommand  extends SelfValidating<LoadPaymentCommand> {

        @NotNull
        private final PaymentId paymentId;

        public LoadPaymentCommand(PaymentId paymentId) {
            this.paymentId = paymentId;
            this.validateSelf();
        }
    }

}
