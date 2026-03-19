package cl.duoc.felipromeroa.tickets.controller;

import cl.duoc.felipromeroa.tickets.model.Ticket;
import cl.duoc.felipromeroa.tickets.service.TicketService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
