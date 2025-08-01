package hu.cubix.koszegig.logosztics.logosztics.repository;

import hu.cubix.koszegig.logosztics.logosztics.model.LgUser;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<LgUser, Long> {

    Optional<LgUser> findByUsername(String username);
}

