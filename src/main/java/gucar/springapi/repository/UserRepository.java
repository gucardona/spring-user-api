package gucar.springapi.repository;

import gucar.springapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByName( String name );
    User findByUsername( String username );
    User findByEmail( String email );
}
