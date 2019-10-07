package customer.service.representative.toolbox.payment.application.useCases;

import customer.service.representative.toolbox.payment.domain.Invoice.InvoiceId;
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
        private final InvoiceId invoiceId;

        @NotNull
        private final Money money;

        public MakePaymentCommand(
                InvoiceId invoiceId,
                Money money) {
            this.invoiceId = invoiceId;
            this.money = money;
            this.validateSelf();
        }
    }

}
