package kr.hhplus.be.server.domain.seat;

import java.util.UUID;

public class Seat {
    private final UUID id;
    private final int number;
    private final UUID concertId;

    public Seat(UUID id, int number, UUID concertId) {
        this.id = id;
        this.number = number;
        this.concertId = concertId;
    }

    public UUID getId() {
        return id;
    }

    public int getNumber() {
        return number;
    }

    public UUID getConcertId() {
        return concertId;
    }
}
