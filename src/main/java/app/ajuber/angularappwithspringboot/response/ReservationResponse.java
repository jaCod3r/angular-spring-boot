package app.ajuber.angularappwithspringboot.response;

import sun.awt.image.ImageWatched;

public class ReservationResponse {
    private Long id;
    private Integer roomNumber;
    private Integer price;
    private ImageWatched.Link links;

    public ReservationResponse() {
        super();
    }

    public ReservationResponse(Integer roomNumber, Integer price) {
        this.roomNumber = roomNumber;
        this.price = price;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public ImageWatched.Link getLinks() {
        return links;
    }

    public void setLinks(ImageWatched.Link links) {
        this.links = links;
    }
}
