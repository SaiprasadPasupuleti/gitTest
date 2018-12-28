package edu.springboot.mongodbex.springbootmongodbexample.repository;

import edu.springboot.mongodbex.springbootmongodbexample.document.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsersRepository extends MongoRepository<Users,Integer> {
}
