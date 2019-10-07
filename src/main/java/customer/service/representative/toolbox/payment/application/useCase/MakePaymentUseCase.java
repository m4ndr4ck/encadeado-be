package customer.service.representative.toolbox.payment.application.useCase;

import customer.service.representative.toolbox.payment.domain.Invoice;
import customer.service.representative.toolbox.payment.domain.Money;
import customer.service.representative.toolbox.payment.framework.helpers.common.SelfValidating;
import lombok.EqualsAndHashCode;
import lombok.Value;

import javax.validation.constraints.NotNull;

public interface MakePaymentUseCase {

    boolean makePayment(MakePaymentCommand command);

    @Value
    @EqualsAndHashCode(callSuper = false)
    class MakePaymentCommand  extends SelfValidating<MakePaymentCommand> {

        @NotNull
        private final Invoice invoice;

        @NotNull
        private final Money money;

        public MakePaymentCommand(
                Invoice invoice,
                Money money) {
            this.invoice = invoice;
            this.money = money;
            this.validateSelf();
        }
    }

}
