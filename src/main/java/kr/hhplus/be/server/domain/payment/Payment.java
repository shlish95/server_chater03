package kr.hhplus.be.server.domain.payment;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class Payment {
    private final Long id;
    private final Long reservationId;
    private final BigDecimal amount;
    private final String status;
    private final LocalDateTime paidAt;

    public Payment(Long id, Long reservationId, BigDecimal amount, String status, LocalDateTime paidAt) {
        this.id = id;
        this.reservationId = reservationId;
        this.amount = amount;
        this.status = status;
        this.paidAt = paidAt;
    }

    public Long getId() {
        return id;
    }

    public Long getReservationId() {
        return reservationId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public String getStatus() {
        return status;
    }

    public LocalDateTime getPaidAt() {
        return paidAt;
    }
}
