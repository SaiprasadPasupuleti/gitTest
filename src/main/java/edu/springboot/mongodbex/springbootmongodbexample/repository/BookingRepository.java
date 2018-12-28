package edu.springboot.mongodbex.springbootmongodbexample.repository;

import edu.springboot.mongodbex.springbootmongodbexample.document.Bookings;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookingRepository extends MongoRepository<Bookings,Integer> {
}
