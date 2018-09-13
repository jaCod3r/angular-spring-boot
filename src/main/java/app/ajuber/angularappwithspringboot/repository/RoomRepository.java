package app.ajuber.angularappwithspringboot.repository;

import org.springframework.data.repository.CrudRepository;

import app.ajuber.angularappwithspringboot.entity.RoomEntity;

import java.util.Optional;


public interface RoomRepository extends CrudRepository<RoomEntity, Long> {
    Optional<RoomEntity> findById(Long id);


}
