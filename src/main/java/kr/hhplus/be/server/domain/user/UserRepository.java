package kr.hhplus.be.server.domain.user;

import kr.hhplus.be.server.infrastructure.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, UUID> {
    Optional<User> findByUserId(UUID userId);
    User save(User user);
}
