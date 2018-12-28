package edu.springboot.mongodbex.springbootmongodbexample.restresource;

import edu.springboot.mongodbex.springbootmongodbexample.document.Bookings;
import edu.springboot.mongodbex.springbootmongodbexample.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/bookings")
public class BookingResource {
    @Autowired
BookingRepository bookingRepository;

    @PostMapping("/addBooking")
    public String createBooking(@RequestBody Bookings bookings){
        bookingRepository.save(bookings);
        return "Inserted Success";
    }
}
