package by.raz.its.service.impl;

import by.raz.its.entity.Specialty;
import by.raz.its.exception.SpecialtyNotFoundException;
import by.raz.its.repository.SpecialtyRepository;
import by.raz.its.service.SpecialtyService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SpecialtyServiceImpl implements SpecialtyService {

    private final SpecialtyRepository specialtyRepository;

    @Override
    public Specialty getSpecialtyByName(String name) {
        return specialtyRepository.findByName(name)
                .orElseThrow(() -> new SpecialtyNotFoundException("no specialty found"));
    }
}
