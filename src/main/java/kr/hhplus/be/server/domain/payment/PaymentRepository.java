package kr.hhplus.be.server.domain.payment;

import kr.hhplus.be.server.infrastructure.entity.PaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<PaymentEntity, Long> {
    Payment save(Payment payment);
}
