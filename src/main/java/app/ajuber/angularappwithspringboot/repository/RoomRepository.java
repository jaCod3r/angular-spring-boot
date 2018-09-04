package app.ajuber.angularappwithspringboot.repository;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RoomRepository extends CrudRepository<RoomEntity, Long> {
    List<RoomEntity> findById(Long id);
}
