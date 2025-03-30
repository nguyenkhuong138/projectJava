package uth.edu.project2.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import uth.edu.project2.models.User;
import org.springframework.stereotype.Repository;
import java.util.Optional;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
    Optional<User>

}