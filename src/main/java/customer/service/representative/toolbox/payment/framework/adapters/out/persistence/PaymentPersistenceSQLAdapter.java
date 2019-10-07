package customer.service.representative.toolbox.payment.framework.adapters.out.persistence;

import customer.service.representative.toolbox.payment.application.port.out.LoadPaymentOutPort;
import customer.service.representative.toolbox.payment.application.port.out.MakePaymentOutPort;
import customer.service.representative.toolbox.payment.domain.Payment;
import customer.service.representative.toolbox.payment.domain.Payment.PaymentId;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
class PaymentPersistenceSQLAdapter implements MakePaymentOutPort, LoadPaymentOutPort {

    private final PaymentRepository paymentRepository;
    private final PaymentMapper paymentMapper;

    @Override
    public void createPayment(Payment payment) {

        paymentRepository.save(paymentMapper.mapToJpaEntity(payment));
    }

    @Override
    public Payment loadPayment(PaymentId paymentId){
        PaymentJpaEntity payment =  paymentRepository.getPaymentJpaEntityById(paymentId.getValue());
        return paymentMapper.mapToDomainEntity(payment);
    }

}
