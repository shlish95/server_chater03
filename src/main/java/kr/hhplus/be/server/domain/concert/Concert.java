package kr.hhplus.be.server.domain.concert;

import java.time.LocalDate;
import java.util.UUID;

public class Concert {
    private final UUID id;
    private final String name;
    private final LocalDate date;

    public Concert(UUID id, String name, LocalDate date) {
        this.id = id;
        this.name = name;
        this.date = date;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }
}
