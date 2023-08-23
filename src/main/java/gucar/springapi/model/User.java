package gucar.springapi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table( name = "users" )
public class User {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;

    @Column(length = 30, nullable = false)
    private String name;

    @Column(length = 30, nullable = false, unique = true)
    private String email;

    @Column(length = 20, nullable = false, unique = true)
    private String username;

    @Column(length = 100, nullable = false)
    private String password;
}
