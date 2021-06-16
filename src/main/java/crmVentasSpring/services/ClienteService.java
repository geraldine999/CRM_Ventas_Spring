package crmVentasSpring.services;

import crmVentasSpring.entities.ClienteEntity;
import crmVentasSpring.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public ClienteEntity save(ClienteEntity cliente) {
        return clienteRepository.save(cliente);
    }

    public List<ClienteEntity> encontrarClientesPorCargoContaining(String cargo) {
        return clienteRepository.findClienteEntitiesByCargoContaining(cargo);
    }

    public List<ClienteEntity> encontrarClientesPorEmpresaContaining(String empresa) {
        return clienteRepository.findClienteEntitiesByNombreempresaContaining(empresa);
    }

    public List<ClienteEntity> encontrarClientesPorMailContaining(String mail) {
        return clienteRepository.findClienteEntitiesByMailContaining(mail);
    }

    public void eliminarClientePorId(Integer id) {
        clienteRepository.deleteById(id);
    }

    public Optional<ClienteEntity> findById(Integer id) {
        return clienteRepository.findById(id);
    }
}
