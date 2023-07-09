package com.gaviria.GameStop.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Entity
@Table(name = "videogames")
@NoArgsConstructor
@AllArgsConstructor
public class VideoGameEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String videoGameType;
    private String gameName;
    private Date createdAt;

}
