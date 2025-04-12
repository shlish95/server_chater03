package kr.hhplus.be.server.domain.seat;

import kr.hhplus.be.server.infrastructure.entity.SeatEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface SeatRepository extends JpaRepository<SeatEntity, Long> {
    List<SeatEntity> findAllByDate(LocalDate date);
}
