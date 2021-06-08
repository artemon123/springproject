package com.filemanager.onlinemg.domain;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

@Entity
@Table(name = "tickets")
public class Ticket {

    @Id
    private String id;
    private int price;
    private String film;
    private int data;

    public Ticket() {
    }

    public Ticket(String id, int price, String film, int data) {
        this.id = id;
        this.price = price;
        this.film = film;
        this.data = data;
    }

    public Ticket(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getFilm() {
        return film;
    }

    public void setFilm(String film) {
        this.film = film;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

}
