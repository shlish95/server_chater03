package kr.hhplus.be.server.domain.reservationSeat;

public enum ReservationSeatStatus {
    PENDING,   // 임시 예약 상태
    CONFIRMED, // 결제 완료된 상태
    EXPIRED    // 예약 만료 상태
}
