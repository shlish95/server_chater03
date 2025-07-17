package kr.hhplus.be.server.domain.queueToken;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface QueueTokenRepository extends JpaRepository<QueueToken, UUID> {
    Optional<QueueToken> findByUserId(UUID userId);
    QueueToken save(QueueToken token);
}
