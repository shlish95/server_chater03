package kr.hhplus.be.server.domain.seat;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SeatService {

    private final SeatRepository seatRepository;

    public List<Seat> getAvailableSeats(Long concertId, LocalDate concertDate) {
        return seatRepository.findAvailableSeatsByConcertIdAndDate(concertId, concertDate);
    }
}
