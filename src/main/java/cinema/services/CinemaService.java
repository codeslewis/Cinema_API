package cinema.services;

import cinema.models.*;

import java.util.UUID;

public interface CinemaService {
    Cinema showCinema();
    Ticket purchase(SeatPosition seat);
    Refund returnTicket(UUID token);
    Statistics getStatistics();
}
