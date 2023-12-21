package searchengine.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "lemma")
public class Lemma {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "site_id")
    private Site site;

    @Column(nullable = false)
    private String lemma;
    @Column(nullable = false)
    private int frequency;

    @OneToMany(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "lemma_id")
    private List<Index> indexes = new ArrayList<>();
}
