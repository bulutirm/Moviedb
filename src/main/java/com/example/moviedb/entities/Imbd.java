package com.example.moviedb.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "imbds")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Imbd {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "imbd_id")
    private Long imbd_id;

    @Column(name = "score")
    private float score;

    @Column(name = "vote_count")
    private float vote_count;
}
