package com.fantasticWork.bike.repositoraries;

import com.fantasticWork.bike.models.Bike;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BikeRepositorary extends JpaRepository<Bike, Long> {

}
