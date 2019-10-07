package customer.service.representative.toolbox.payment.framework.adapters.out.persistence;

import customer.service.representative.toolbox.payment.domain.Payment;
import org.springframework.stereotype.Component;

@Component
class PaymentMapper {

    PaymentJpaEntity mapToJpaEntity(Payment payment) {
        return new PaymentJpaEntity(
                payment.getId() == null ? null : payment.getId().getValue(),
                payment.getInvoiceId().getValue(),
                payment.getMoney().getAmount().longValue());
    }

}