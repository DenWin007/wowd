package by.vovden.wowd.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Data
@AllArgsConstructor
@Entity
@Table(name = "block")
public class Block {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private long parent;

    private long child;

    private String name;

    private String discription;

    private String discriptionfull;

    private String timestamp;

    private String deadline;

    public Block() {
    }
}
