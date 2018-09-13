package app.ajuber.angularappwithspringboot.converter;

import app.ajuber.angularappwithspringboot.entity.RoomEntity;
import app.ajuber.angularappwithspringboot.model.Links;
import app.ajuber.angularappwithspringboot.model.Self;
import app.ajuber.angularappwithspringboot.model.response.ReservationResponse;
import app.ajuber.angularappwithspringboot.rest.ResourceConstants;
import org.springframework.core.convert.converter.Converter;




public class RoomEntityToReservableRoomResponseConverter implements Converter<RoomEntity, ReservationResponse> {


    @Override
    public  ReservationResponse convert(RoomEntity source) {

        ReservationResponse reservationResponse = new ReservationResponse();

        reservationResponse.setRoomNumber(source.getRoomNumber());
        reservationResponse.setPrice(Integer.valueOf(source.getPrice()));

        Links links = new Links();
        Self self = new Self();


        self.setRef(ResourceConstants.ROOM_RESERVATION_V1 + "/" + source.getId());
        links.setSelf(self);

        reservationResponse.setLinks(links);
        return reservationResponse;


    }

}
