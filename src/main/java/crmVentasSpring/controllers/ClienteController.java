package crmVentasSpring.controllers;

import crmVentasSpring.entities.ClienteEntity;
import crmVentasSpring.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/clientes")
public class ClienteController {

    public final ClienteService clienteService;

    @Autowired
    public ClienteController(ClienteService clienteService) {
        this.clienteService =clienteService ;
    }

    @GetMapping
    public List<ClienteEntity> getClientes(){

        return clienteService.getClientes();
    }

//todo modificar


    @GetMapping("nombre/{nombre}")
    public List<ClienteEntity> encontrarClientesPorNombre(@PathVariable String nombre){
        return clienteService.encontrarClientesPorNombre(nombre);
    }

    @GetMapping("cargo/{cargo}")
    public List<ClienteEntity> encontrarClientesPorCargoContaining(@PathVariable String cargo){
        return clienteService.encontrarClientesPorCargoContaining(cargo);
    }

    @GetMapping("empresa/{empresa}")
    public List<ClienteEntity> encontrarClientesPorEmpresaContaining(@PathVariable String empresa){
        return clienteService.encontrarClientesPorEmpresaContaining(empresa);
    }

    @GetMapping("mail/{mail}")
    public List<ClienteEntity> encontrarClientesPorMailContaining(@PathVariable String mail){
        return clienteService.encontrarClientesPorMailContaining(mail);
    }

    @PostMapping("crear")
    public ClienteEntity crearCliente(@RequestBody ClienteEntity cliente){
        return clienteService.save(cliente);
    }



    @DeleteMapping("eliminar/{id}")
    public void eliminarClientePorId(@PathVariable Integer id){
        clienteService.eliminarClientePorId(id);
    }
}
