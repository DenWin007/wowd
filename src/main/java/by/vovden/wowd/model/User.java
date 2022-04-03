package by.vovden.wowd.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@AllArgsConstructor
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String lastName;

    private String login;

    private String pass;

    @ManyToMany(mappedBy = "likedusersTask")
    Set<Task> tasks;

    @ManyToMany(mappedBy = "likedusersTeam")
    Set<Team> teams;

    public User() {
    }
}
