package com.filemanager.onlinemg.controllers;



import com.filemanager.onlinemg.domain.Ticket;
import com.filemanager.onlinemg.exeptions.NotFoundExeptions;
import com.filemanager.onlinemg.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
@RestController
@RequestMapping("/films")
public class FilmController {

    @Autowired
    TicketService ticketService;


    @GetMapping("/tickets")
    public  List<Ticket> getHome()
    {
        List<Ticket> tickets=ticketService.GetAllFreeTickets();
        return tickets;
    }

    @GetMapping("/tickets/{id}")
    public Ticket  getHome(@PathVariable String id)
    {
        List<Ticket> tickets=ticketService.GetAllFreeTickets();
        Ticket currentTicker=tickets.stream().filter(tick->tick.getId()==id).findFirst().orElseThrow(NotFoundExeptions::new);
        return currentTicker;
    }

    @PostMapping("/tickets/add")
    public boolean create(@RequestBody Ticket employee)
    {
          ticketService.addTicket(employee);
          return true;

    }

    @GetMapping("login")
    public String getLogin()
    {
        return "login";
    }

}
