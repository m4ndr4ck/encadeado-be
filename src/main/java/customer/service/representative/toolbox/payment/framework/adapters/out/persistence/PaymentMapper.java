package customer.service.representative.toolbox.payment.framework.adapters.out.persistence;

import customer.service.representative.toolbox.payment.domain.Invoice;
import customer.service.representative.toolbox.payment.domain.Money;
import customer.service.representative.toolbox.payment.domain.Payment;
import customer.service.representative.toolbox.payment.domain.Payment.PaymentId;
import org.springframework.stereotype.Component;

@Component
class PaymentMapper {

    PaymentJpaEntity mapToJpaEntity(Payment payment) {
        return new PaymentJpaEntity(
                payment.getId() == null ? null : payment.getId().getValue(),
                payment.getInvoice().getId(),
                payment.getMoney().getAmount().longValue());
    }

    Payment mapToDomainEntity(PaymentJpaEntity payment){
        return Payment.withId(
                new PaymentId(payment.getId()),
                Money.of(payment.getMoney()),
                Invoice.withId(payment.getId()));

    }

}