package customer.service.representative.toolbox.payment.framework.adapters.out.persistence;

import javax.persistence.Column;
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
class PaymentJpaEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private Long invoice;

    @Column
    private Long money;

}