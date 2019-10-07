package customer.service.representative.toolbox.payment.application.ports.in;

import customer.service.representative.toolbox.payment.application.ports.out.MakePaymentOutPort;
import customer.service.representative.toolbox.payment.application.useCases.MakePaymentUseCase;
import customer.service.representative.toolbox.payment.domain.Payment;
import customer.service.representative.toolbox.payment.framework.helpers.testdata.PaymentTestData;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Component
@Transactional
public class MakePaymentInPort implements MakePaymentUseCase {

    private final MakePaymentOutPort createPaymentPort;

    @Override
    public boolean makePayment(MakePaymentCommand command) {
        Payment payment = Payment.withoutId(command.getMoney(), command.getInvoiceId());
        createPaymentPort.createPayment(payment);
        return false;
    }

}
