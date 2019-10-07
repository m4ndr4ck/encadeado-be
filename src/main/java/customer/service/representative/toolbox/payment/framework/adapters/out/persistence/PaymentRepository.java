package customer.service.representative.toolbox.payment.framework.adapters.out.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface PaymentRepository extends JpaRepository<PaymentJpaEntity, Long> {
    PaymentJpaEntity getPaymentJpaEntityById(long id);
}
