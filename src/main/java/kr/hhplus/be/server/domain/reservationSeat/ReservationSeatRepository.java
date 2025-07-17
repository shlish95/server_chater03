package kr.hhplus.be.server.domain.reservationSeat;

import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface ReservationSeatRepository {
    ReservationSeat save(ReservationSeat reservationSeat);
    Optional<ReservationSeat> findByUserIdAndSeatId(UUID userId, Long seatId);
    void cancelExpired(LocalDateTime currentTime);
}
