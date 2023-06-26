package com.articui.datastream.jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@Entity
@NoArgsConstructor
public class ProgramEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long programEntityId;
    private  String program1;
    private String program2;
}
