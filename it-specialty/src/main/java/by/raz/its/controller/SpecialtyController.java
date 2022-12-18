package by.raz.its.controller;

import by.raz.its.dto.SpecialtyRequestDto;
import by.raz.its.entity.Specialty;
import by.raz.its.service.SpecialtyService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/specialty")
@AllArgsConstructor
public class SpecialtyController {

    private final SpecialtyService specialtyService;
    private static final String INFO = "----------Ura vse rabotaet----------!";

    @PostMapping
    public Specialty getSpecialtyByName(@RequestBody SpecialtyRequestDto request) {
        return specialtyService.getSpecialtyByName(request.getName());
    }

    @GetMapping
    public String getInfo() {
        return INFO;
    }
}
