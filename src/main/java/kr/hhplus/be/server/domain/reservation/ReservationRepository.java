package kr.hhplus.be.server.domain.reservation;

import kr.hhplus.be.server.infrastructure.entity.SeatEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ReservationRepository extends JpaRepository<SeatEntity, Long> {
    Reservation save(Reservation reservation);
}
