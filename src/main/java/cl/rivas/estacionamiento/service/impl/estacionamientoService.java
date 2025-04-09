package cl.rivas.estacionamiento.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.rivas.estacionamiento.model.EstacionamientoModel;
import cl.rivas.estacionamiento.repository.EstacionamientoRepository;
import cl.rivas.estacionamiento.service.IEstacionamientoService;

@Service
public class estacionamientoService implements IEstacionamientoService {
    @Autowired
    EstacionamientoRepository EstacionamientoRepository;
    @Override
    public EstacionamientoModel insert(EstacionamientoModel estacionamiento) {
        return EstacionamientoRepository.save(estacionamiento);
        }
        
    @Override
    public EstacionamientoModel update(Integer id, EstacionamientoModel estacionamiento) {
        estacionamiento.setIdEstacionamiento(id); 
        return EstacionamientoRepository.save(estacionamiento);
    }

    @Override
    public EstacionamientoModel delete(Integer id) {
        EstacionamientoRepository.deleteById(id);
        return null; 
    }

    @Override
    public EstacionamientoModel getById(Integer id) {
        return EstacionamientoRepository.findById(id).get();
        }

    @Override
    public List<EstacionamientoModel> getAll() {
        return (List<EstacionamientoModel>) EstacionamientoRepository.findAll();
    }

}
