package cl.duoc.felipromeroa.tickets.service;

import cl.duoc.felipromeroa.tickets.model.Ticket;
import cl.duoc.felipromeroa.tickets.repository.TicketRepository;
import org.springframework.stereotype.Service;
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
}
