package crmVentasSpring;

import ch.qos.logback.core.net.server.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository <ClienteEntity, Integer> {

     List<ClienteEntity> findClienteEntitiesByNombre(String nombre);


}