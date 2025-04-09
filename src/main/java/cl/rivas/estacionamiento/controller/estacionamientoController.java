package cl.rivas.estacionamiento.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.rivas.estacionamiento.model.EstacionamientoModel;
import cl.rivas.estacionamiento.service.IEstacionamientoService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/api/crud/estacionamiento")
public class estacionamientoController {
    @Autowired
    IEstacionamientoService estacionamientoService;
    @PostMapping("path")
    public EstacionamientoModel insert(@RequestBody EstacionamientoModel estacionamiento) {
        return estacionamientoService.insert(estacionamiento);
    }

@PutMapping("/{id}")
public EstacionamientoModel update(@PathVariable Integer id,@RequestBody EstacionamientoModel estacionamiento) {
    return estacionamientoService.update(id,estacionamiento);
    }

@DeleteMapping("/{id}")
public EstacionamientoModel delete(@PathVariable Integer id) {
    return estacionamientoService.delete(id);
}

@GetMapping("/{id}")
public EstacionamientoModel getById(@PathVariable Integer id) {
    return estacionamientoService.getById(id);
}

@GetMapping
public List<EstacionamientoModel> getAll() {
    return estacionamientoService.getAll();
}
}