package by.vovden.wowd.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Data
@AllArgsConstructor
@Entity
@Table(name = "tree")
public class Tree {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private long level;

    public Tree() {
    }
}
