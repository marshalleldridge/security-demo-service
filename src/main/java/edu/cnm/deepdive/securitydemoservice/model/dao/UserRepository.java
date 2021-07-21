package edu.cnm.deepdive.securitydemoservice.model.dao;

import edu.cnm.deepdive.securitydemoservice.model.entity.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {

  Optional<User> findFirstByOauthKey(String oauthKey);

}
