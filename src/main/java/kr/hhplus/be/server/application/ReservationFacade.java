package kr.hhplus.be.server.application;

import kr.hhplus.be.server.domain.reservation.ReservationService;
import kr.hhplus.be.server.domain.reservationSeat.ReservationSeatService;
import kr.hhplus.be.server.domain.user.UserService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ReservationFacade {
    private final UserService userService;
    private final ReservationService reservationService;
    private final ReservationSeatService reservationSeatService;


}
