package customer.service.representative.toolbox.payment.framework.adapters.out.persistence;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "payment")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentJpaEntity {

    @Id
    @GeneratedValue
    private Long id;

    private Long invoiceId;

    private Long money;

}