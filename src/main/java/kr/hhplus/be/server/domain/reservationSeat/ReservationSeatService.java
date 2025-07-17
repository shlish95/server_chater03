package kr.hhplus.be.server.domain.reservationSeat;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ReservationSeatService {

    private final ReservationSeatRepository reservationSeatRepository;

//    public ReservationSeat reserveTemporarily(UUID userId, Long seatId) {
//
//    }

    public void confirmReservation(UUID userId, Long seatId) {
        ReservationSeat seat = reservationSeatRepository.findByUserIdAndSeatId(userId, seatId)
                .orElseThrow(() -> new IllegalArgumentException("예약 좌석을 찾을 수 없습니다."));

//        seat.
        reservationSeatRepository.save(seat);
    }

    public void cancelReservation(LocalDateTime now) {
        reservationSeatRepository.cancelExpired(now);
    }
}
