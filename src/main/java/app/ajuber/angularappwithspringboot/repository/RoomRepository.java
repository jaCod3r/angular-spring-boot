package app.ajuber.angularappwithspringboot.repository;

import app.ajuber.angularappwithspringboot.entity.RoomEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface RoomRepository extends CrudRepository<RoomEntity, Long> {
    Optional<RoomEntity> findById(Long id);


}
