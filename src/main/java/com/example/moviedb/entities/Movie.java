package com.example.moviedb.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "movies")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long movie_id;

    @Column(name = "name")
    private String name;

    @Column(name = "producer")
    private String producer;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "imbd_id")
    private Imbd imbd;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "year_id")
    private Year year;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "movie_category",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id"))
    private Set<Category> categories = new HashSet<>();
}
