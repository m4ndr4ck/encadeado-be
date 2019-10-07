package customer.service.representative.toolbox.payment.framework.adapters.out.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

interface PaymentRepository extends JpaRepository<PaymentJpaEntity, Long> {
}
