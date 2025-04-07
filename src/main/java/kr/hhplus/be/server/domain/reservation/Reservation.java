package kr.hhplus.be.server.domain.reservation;

import java.time.LocalDateTime;
import java.util.UUID;

public class Reservation {
    private final UUID id;
    private final UUID userId;
    private final LocalDateTime createAt;

    public Reservation(UUID id, UUID userId, LocalDateTime createAt) {
        this.id = id;
        this.userId = userId;
        this.createAt = createAt;
    }

    public UUID getId() {
        return id;
    }

    public UUID getUserId() {
        return userId;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }
}
