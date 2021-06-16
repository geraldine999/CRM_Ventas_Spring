package crmVentasSpring.repositories;

import crmVentasSpring.entities.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository <ClienteEntity, Integer> {

     List<ClienteEntity> findClienteEntitiesByNombre(String nombre);

    List<ClienteEntity> findClienteEntitiesByCargoContaining(String cargo);

    List<ClienteEntity> findClienteEntitiesByNombreempresaContaining(String nombreempresa);

    List<ClienteEntity> findClienteEntitiesByMailContaining(String mail);


}
