package customer.service.representative.toolbox.payment.application.port.in;

import customer.service.representative.toolbox.payment.application.port.out.MakePaymentOutPort;
import customer.service.representative.toolbox.payment.application.useCase.MakePaymentUseCase;
import customer.service.representative.toolbox.payment.domain.Payment;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Component
@Transactional
public class MakePaymentInPort implements MakePaymentUseCase {

    private final MakePaymentOutPort makePaymentOutPort;

    @Override
    public boolean makePayment(MakePaymentCommand command) {
        Payment payment = Payment.withoutId(command.getMoney(), command.getInvoice());

        if (payment.mayPay())
        makePaymentOutPort.createPayment(payment);

        return true;
    }

}
