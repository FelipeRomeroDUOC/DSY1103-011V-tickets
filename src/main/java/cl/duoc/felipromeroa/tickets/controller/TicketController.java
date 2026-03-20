package cl.duoc.felipromeroa.tickets.controller;

import cl.duoc.felipromeroa.tickets.model.Ticket;
import cl.duoc.felipromeroa.tickets.service.TicketService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tickets")
public class TicketController {
    private TicketService service;
    public TicketController(TicketService ticketService) {
        this.service = ticketService;
    }

    @GetMapping
    public List<Ticket> getAllTickets() {
        return this.service.getTickets();
    }

    @PostMapping
    public Ticket create(@RequestBody Ticket ticket){
        Ticket created = this.service.create(ticket);
        if (created != null){
            return created;
        }
        return null;
    }
}
