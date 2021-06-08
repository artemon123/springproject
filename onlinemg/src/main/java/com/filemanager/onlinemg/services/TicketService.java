package com.filemanager.onlinemg.services;


import com.filemanager.onlinemg.domain.Ticket;
import com.filemanager.onlinemg.repository.TicketRepository;
import com.filemanager.onlinemg.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Service
public class TicketService {

    @Autowired
    TicketRepository ticketRepository;


    public List<Ticket> GetAllFreeTickets()
    {
        Date data=new Date();
        List<Ticket> ticketList=new ArrayList<>();
        for(int i=0;i<10;i++)
        {
            ticketList.add(new Ticket(String.valueOf(i),100+i,"avatar",24));
            ticketRepository.save(new Ticket(String.valueOf(i),100+i,"avatar",24));
        }
        return ticketRepository.findAll();
    }


    public boolean addTicket(Ticket ticket)
    {

        ticketRepository.save(ticket);

        return true;

    }



}
