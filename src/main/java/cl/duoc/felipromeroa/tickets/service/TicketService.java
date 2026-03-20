package cl.duoc.felipromeroa.tickets.service;

import cl.duoc.felipromeroa.tickets.model.Ticket;
import cl.duoc.felipromeroa.tickets.repository.TicketRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class TicketService {
    private TicketRepository repository;

    public TicketService(TicketRepository repository) {
        this.repository = repository;
    }
    public List<Ticket> getTickets() {
        return this.repository.getAll();
    }
    public Ticket create(Ticket ticket) {
        boolean exists = this.repository.existsByTitle(ticket.getTitle());
        if (exists) {
            return null;
        }

        LocalDateTime now = LocalDateTime.now();
        LocalDate ldNow = LocalDate.now();
        LocalDate estimated = ldNow.plusDays(5L);

        ticket.setStatus("NEW");
        ticket.setCreatedAt(LocalDateTime.now());
        ticket.setEstimatedResolutionDate(estimated);
        return this.repository.save(ticket);
    }
}
