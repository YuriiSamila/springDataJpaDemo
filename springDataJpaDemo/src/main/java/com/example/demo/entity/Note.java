package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name = "notes")
public class Note {

    @Id
    @GeneratedValue
   private Long id;

    @Column(name = "body")
    private String body;

    @JsonBackReference
    @ManyToOne(optional = false)
    @JoinColumn(name = "person_id")
    private Person person;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Note() {
    }

    @Override
    public String toString() {
        return "Note{" +
                "id=" + id +
                ", body='" + body + '\'' +
                '}';
    }
}
