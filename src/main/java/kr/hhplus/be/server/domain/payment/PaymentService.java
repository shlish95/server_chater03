package kr.hhplus.be.server.domain.payment;

import kr.hhplus.be.server.domain.queueToken.QueueTokenRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PaymentService {

    private final PaymentRepository paymentRepository;

    public Payment makePayment(Long reservationId, BigDecimal amount, String status, LocalDateTime paidAt) {
        Payment payment = new Payment(null, reservationId, amount, status, paidAt);

        return paymentRepository.save(payment);
    }
}