package app.ajuber.angularappwithspringboot.repository;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface RoomRepository extends CrudRepository<T, Long> {
    Optional<T> findById(Long id);


}
