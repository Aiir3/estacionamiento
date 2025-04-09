package cl.rivas.estacionamiento.service;

import java.util.List;

import cl.rivas.estacionamiento.model.EstacionamientoModel;

public interface IEstacionamientoService {

    EstacionamientoModel insert(EstacionamientoModel vaca);

    EstacionamientoModel update(Integer id, EstacionamientoModel vaca);

    EstacionamientoModel delete(Integer id);

    EstacionamientoModel getById(Integer id);

    List<EstacionamientoModel> getAll();

}
