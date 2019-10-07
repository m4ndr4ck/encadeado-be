package customer.service.representative.toolbox.payment.framework.adapters.out.persistence;

import customer.service.representative.toolbox.payment.application.ports.out.MakePaymentOutPort;
import customer.service.representative.toolbox.payment.domain.Payment;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
class PaymentPersistenceSQLAdapter implements MakePaymentOutPort {

    private final PaymentRepository paymentRepository;
    private final PaymentMapper paymentMapper;

    @Override
    public void createPayment(Payment payment) {

        paymentRepository.save(paymentMapper.mapToJpaEntity(payment));
    }


}
