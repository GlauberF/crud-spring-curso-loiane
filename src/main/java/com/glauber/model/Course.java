package com.glauber.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@JsonProperty("_id") // Muda o nome da propriedade no json de return se nao for usar DTO
    //@JsonIgnore // Não envia no json
    private Long id;

    // mantive name mais para fins de teste, mas não precisaria, pois é o mesmo
    // nome descrito na classe
    @Column(name = "name", length = 200, nullable = false)
    private String name;

    @Column(length = 10, nullable = false)
    private String category;
}
