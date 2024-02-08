package it.epicode.demo.entities;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
@Entity
public class Table {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long number;
    @Setter
    private int maxCovers;
    @Setter
    private State state;

    public Table(int maxCovers, State state) {
        this.maxCovers = maxCovers;
        this.state = state;
    }

    public enum State {
        FREE,
        OCCUPIED
    }
}