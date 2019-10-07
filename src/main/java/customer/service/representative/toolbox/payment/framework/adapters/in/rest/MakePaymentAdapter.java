package customer.service.representative.toolbox.payment.framework.adapters.in.rest;

import customer.service.representative.toolbox.payment.application.useCase.MakePaymentUseCase;
import customer.service.representative.toolbox.payment.application.useCase.MakePaymentUseCase.MakePaymentCommand;
import customer.service.representative.toolbox.payment.domain.Invoice;

import customer.service.representative.toolbox.payment.domain.Money;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MakePaymentAdapter {

    private final MakePaymentUseCase makePaymentUseCase;

    @GetMapping(path = "/customer/service/representative/toolbox/payment/{money}/{invoiceId}")
    void makePayment(
            @PathVariable("money") Long money,
            @PathVariable("invoiceId") Long invoiceId) {

        MakePaymentCommand command = new MakePaymentCommand(
                Invoice.withId(invoiceId),
                Money.of(money));

        makePaymentUseCase.makePayment(command);
    }

}