package crmVentasSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    @Autowired
    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public List<ClienteEntity> getClientes(){
        return clienteRepository.findAll();
    }

    public List<ClienteEntity> encontrarClientesPorNombre(String nombre){
        return clienteRepository.findClienteEntitiesByNombre(nombre);
    }
}
