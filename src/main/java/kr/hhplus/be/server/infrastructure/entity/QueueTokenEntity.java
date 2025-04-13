package kr.hhplus.be.server.infrastructure.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "queue_token")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class QueueTokenEntity {

    @Id
    private UUID id;

    private Long userId;

    private Integer queuePosition;

    private LocalDateTime issuedAt;

    private LocalDateTime expiredAt;
}
