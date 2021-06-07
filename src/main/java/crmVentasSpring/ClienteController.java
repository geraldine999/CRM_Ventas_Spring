package crmVentasSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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


    @GetMapping("{nombre}")
    public List<ClienteEntity> encontrarClientesPorNombre(@PathVariable String nombre){
        return clienteService.encontrarClientesPorNombre(nombre);
    }
}
