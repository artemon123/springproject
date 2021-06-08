package com.filemanager.onlinemg.repository;

import com.filemanager.onlinemg.domain.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, String> {



}
