package customer.service.representative.toolbox.payment.framework.helpers.testdata;


import customer.service.representative.toolbox.payment.domain.Invoice;
import customer.service.representative.toolbox.payment.domain.Money;
import customer.service.representative.toolbox.payment.domain.Payment;
import customer.service.representative.toolbox.payment.domain.Payment.PaymentId;

public class PaymentTestData {


    public static class PaymentBuilder {

        private PaymentId paymentId;
        private Money money;
        private Invoice invoice;

        public PaymentBuilder withPaymentId(PaymentId paymentId) {
            this.paymentId = paymentId;
            return this;
        }

        public PaymentBuilder withMoney(Money money) {
            this.money = money;
            return this;
        }

        public PaymentBuilder withInvoice(Invoice InvoiceId) {
            this.invoice = invoice;
            return this;
        }

        public Payment build() {
            return Payment.withId(this.paymentId, this.money, this.invoice);
        }

    }


}