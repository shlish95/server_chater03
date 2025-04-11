package kr.hhplus.be.server.infrastructure.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "reservation_seat")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class ReservationSeatEntity {

    @EmbeddedId
    private ReservationSeatId id;

    @ManyToOne
    @MapsId("reservationId")
    @JoinColumn(name = "reservationId")
    private ReservationEntity reservation;

    @ManyToOne
    @MapsId("seatId")
    @JoinColumn(name = "seat_id")
    private SeatEntity seat;

    private LocalDateTime expiredAt;
}
