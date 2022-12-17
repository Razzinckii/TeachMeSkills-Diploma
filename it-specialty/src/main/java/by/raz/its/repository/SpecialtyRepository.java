package by.raz.its.repository;

import by.raz.its.entity.Specialty;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpecialtyRepository extends JpaRepository<Specialty, Integer> {

    Optional<Specialty> findByName(String name);
}
