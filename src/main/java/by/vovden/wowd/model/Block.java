package by.vovden.wowd.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

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

    @OneToMany(mappedBy = "block", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @JsonIgnore
    private Set<Task> Tasks = new HashSet<Task>(0);

    @OneToMany(mappedBy = "blocku", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @JsonIgnore
    private Set<Unittest> Unittests = new HashSet<Unittest>(0);

    public Block() {
    }
}
