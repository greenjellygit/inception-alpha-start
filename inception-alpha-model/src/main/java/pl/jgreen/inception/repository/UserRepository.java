package pl.jgreen.inception.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pl.jgreen.inception.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
