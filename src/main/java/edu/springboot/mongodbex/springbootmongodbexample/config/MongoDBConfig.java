package edu.springboot.mongodbex.springbootmongodbexample.config;

import edu.springboot.mongodbex.springbootmongodbexample.document.Bookings;
import edu.springboot.mongodbex.springbootmongodbexample.document.Users;
import edu.springboot.mongodbex.springbootmongodbexample.repository.BookingRepository;
import edu.springboot.mongodbex.springbootmongodbexample.repository.UsersRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = UsersRepository.class)
@Configuration
public class MongoDBConfig {

    @Bean
    CommandLineRunner commandLineRunner(UsersRepository usersRepository){
        return strings -> { usersRepository.save(new Users(1,"Saiprasad","JAVA","25000"));
            usersRepository.save(new Users(2,"Lenin","JAVA","35000"));};
    }

}
