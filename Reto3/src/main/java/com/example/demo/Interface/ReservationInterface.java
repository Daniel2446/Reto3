
package com.example.demo.Interface;

import com.example.demo.Modelo.Reservation;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Daniel
 */
public interface ReservationInterface extends CrudRepository <Reservation, Integer>{
    
}
