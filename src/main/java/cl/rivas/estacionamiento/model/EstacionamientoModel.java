package cl.rivas.estacionamiento.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "Estacionamiento")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class EstacionamientoModel {

    @Id
    @Column(name = "id_estacionamiento")
    private int IdEstacionamiento;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "tipo")
    private int tipo;

}
