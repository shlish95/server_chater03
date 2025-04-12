package kr.hhplus.be.server.domain.queueToken;

import kr.hhplus.be.server.infrastructure.entity.QueueTokenEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface QueueTokenRepository extends JpaRepository<QueueTokenEntity, UUID> {
    Optional<QueueTokenEntity> findByUserId(UUID userId);
}
