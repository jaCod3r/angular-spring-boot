package app.ajuber.angularappwithspringboot.rest;

import app.ajuber.angularappwithspringboot.request.ReservationRequest;
import app.ajuber.angularappwithspringboot.response.ReservationResponse;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping(ResourceConstants.ROOM_RESERVATION_V1)
public class ReservationResource {
    //http://localhost:8080/room/reservation/v1?check-in=2017-03-18&check-out=2018-03-18

    @RequestMapping(path="", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<ReservationResource> getAvailableRooms(
            @RequestParam(value = "checkin")
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
            LocalDate checkin,
            @RequestParam(value = "checkout")
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
            LocalDate checkout) {
        return new ResponseEntity(new ReservationResponse(), HttpStatus.OK);
    }

    @RequestMapping(path="", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<ReservationResponse> createReservation(
            @RequestBody ReservationRequest reservationRequest) {
        return new ResponseEntity<>(new ReservationResponse(), HttpStatus.CREATED);

    }



}
