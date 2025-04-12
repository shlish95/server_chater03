package kr.hhplus.be.server.domain.reservation;

import kr.hhplus.be.server.infrastructure.entity.ReservationEntity;
import kr.hhplus.be.server.infrastructure.entity.SeatEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface ReservationRepository extends JpaRepository<SeatEntity, Long> {
    List<ReservationEntity> findAllByUserid(UUID userId);
    Optional<ReservationEntity> findBySeatIdAndDate(Long seatId, LocalDate date);
}
