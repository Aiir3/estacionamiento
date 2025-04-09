package cl.rivas.estacionamiento.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.rivas.estacionamiento.model.EstacionamientoModel;

@Repository
public interface EstacionamientoRepository extends CrudRepository<EstacionamientoModel, Integer> {
    // Custom query methods can be defined here if needed

}
