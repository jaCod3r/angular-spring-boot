package app.ajuber.angularappwithspringboot;

import app.ajuber.angularappwithspringboot.entity.RoomEntity;
import app.ajuber.angularappwithspringboot.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class H2Boostrap implements CommandLineRunner {

    @Autowired
    RoomRepository roomRepository;

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Bootstrapping data");


        roomRepository.save(new RoomEntity(101, "100"));
        roomRepository.save(new RoomEntity(102, "200"));
        roomRepository.save(new RoomEntity(103, "300"));


        Iterable<RoomEntity> itr = roomRepository.findAll();
        System.out.println("Printing out data");

        for (RoomEntity room: itr) {
            System.out.println(room.getRoomNumber());
        }
    }
}
