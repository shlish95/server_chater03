package kr.hhplus.be.server.domain.queueToken;

import java.time.Clock;
import java.time.LocalDateTime;
import java.util.UUID;

public class QueueToken {
    private final UUID id;
    private final UUID userId;
    private final int position;
    private final LocalDateTime issuedAt;
    private final LocalDateTime expiresAt;

    public QueueToken(UUID id, UUID userId, int position, LocalDateTime issuedAt, LocalDateTime expiresAt) {
        this.id = id;
        this.userId = userId;
        this.position = position;
        this.issuedAt = issuedAt;
        this.expiresAt = expiresAt;
    }

    public static QueueToken issue(UUID userId, int queuePosition, LocalDateTime issuedAt) {
        LocalDateTime expiresAt = issuedAt.plusMinutes(5);
        return new QueueToken(UUID.randomUUID(), userId, queuePosition, issuedAt, expiresAt);
    }

    public UUID getId() {
        return id;
    }
    public UUID getUserId() {
        return userId;
    }

    public int getPosition() {
        return position;
    }

    public LocalDateTime getIssuedAt() {
        return issuedAt;
    }

    public LocalDateTime getExpiresAt() {
        return expiresAt;
    }
}
