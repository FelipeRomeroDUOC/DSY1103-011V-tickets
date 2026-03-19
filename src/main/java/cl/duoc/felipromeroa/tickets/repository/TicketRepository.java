package cl.duoc.felipromeroa.tickets.repository;

import cl.duoc.felipromeroa.tickets.model.Ticket;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TicketRepository {
    List<Ticket> tickets;

    public TicketRepository(){
        tickets = new ArrayList<>();
        tickets.add(new Ticket(1L,"Ticket1","Ticket1","NEW"));
        tickets.add(new Ticket(2L,"Ticket2","Ticket2","NEW"));
    }

    public List<Ticket> getAll() {
        return tickets;
    }
}
