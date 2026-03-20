package cl.duoc.felipromeroa.tickets.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Ticket {
    private Long id;
    private String title;
    private String description;
    private String status;
    private LocalDateTime createdAt;
    private LocalDate estimatedResolutionDate;
    private LocalDateTime effectiveResolutionDate;
}
