package com.hotel.HotelService.services;

import com.hotel.HotelService.entities.Hotel;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface HotelService {

    Hotel create(Hotel hotel);
    List<Hotel> getAll();
    Hotel get(String id);
}
