package net.nata.pattern.db.repositorie;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.nata.pattern.db.model.User;



@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	Optional<User> findByCd(long cd);
	Optional<User> findById(String user_id);
}
