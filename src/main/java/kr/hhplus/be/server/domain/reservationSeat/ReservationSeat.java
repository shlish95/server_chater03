package kr.hhplus.be.server.domain.reservationSeat;

import java.time.LocalDateTime;
import java.util.UUID;

public class ReservationSeat {
    private final UUID id;
    private final UUID reservationId;
    private final UUID seatId;
    private final LocalDateTime expiresAt;

    public ReservationSeat(UUID reservationId, UUID seatId, LocalDateTime expiresAt) {
        this.reservationId = reservationId;
        this.seatId = seatId;
        this.expiresAt = expiresAt;
        this.id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public UUID getReservationId() {
        return reservationId;
    }

    public UUID getSeatId() {
        return seatId;
    }

    public LocalDateTime getExpiresAt() {
        return expiresAt;
    }
}
