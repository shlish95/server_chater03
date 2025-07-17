package kr.hhplus.be.server.domain.queueToken;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Clock;
import java.time.LocalDateTime;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class QueueTokenService {

    private final QueueTokenRepository queueTokenRepository;
    private Clock clock;

    public QueueToken issueToken(UUID userId, int queuePosition) {
        LocalDateTime now = LocalDateTime.now(clock);
//        LocalDateTime expiresAt = now.plusMinutes(5);

        QueueToken token = QueueToken.issue(userId, queuePosition, now);
        return queueTokenRepository.save(token);
    }

    public QueueToken getToken(UUID userId) {
        return queueTokenRepository.findByUserId(userId)
                .orElseThrow(() -> new IllegalArgumentException("토큰을 찾을 수 없습니다."));
    }
}
