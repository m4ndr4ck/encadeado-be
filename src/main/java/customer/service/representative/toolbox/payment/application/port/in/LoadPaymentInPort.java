package customer.service.representative.toolbox.payment.application.port.in;

import customer.service.representative.toolbox.payment.application.port.out.LoadPaymentOutPort;
import customer.service.representative.toolbox.payment.application.query.LoadPaymentQuery;
import customer.service.representative.toolbox.payment.domain.Payment;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Component
@Transactional
public class LoadPaymentInPort implements LoadPaymentQuery {

    private final LoadPaymentOutPort loadPaymentOutPort;

    @Override
    public Payment loadPayment(LoadPaymentCommand loadPaymentCommand){
        return loadPaymentOutPort.loadPayment(loadPaymentCommand.getPaymentId());
    }

}
