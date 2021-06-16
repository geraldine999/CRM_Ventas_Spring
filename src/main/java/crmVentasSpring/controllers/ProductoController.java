package crmVentasSpring.controllers;

import crmVentasSpring.entities.ProductoEntity;
import crmVentasSpring.services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/productos")
public class ProductoController {
    private final ProductoService productoService;

    @Autowired
    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping
    public List<ProductoEntity> mostrarProductos(){
        return productoService.getProductos();
    }


    @GetMapping("buscar/codigo_producto/{codigoproducto}")
    public ProductoEntity buscarProductoPorCodigo(@PathVariable String codigoproducto){
        return productoService.buscarProductoPorCodigo(codigoproducto);
    }

    @GetMapping("buscar/categoria/{categoria}")
    public List<ProductoEntity> buscarProductosPorCategoria(@PathVariable String categoria){
        return productoService.buscarProductosPorCategoria(categoria);
    }

    @GetMapping("buscar/nombre/{nombre}")
    public List<ProductoEntity> buscarProductosPorNombreContaining(@PathVariable String nombre){
        return productoService.buscarProductosPorNombreContaining(nombre);
    }

    @GetMapping("buscar/descripcion/{descripcion}")
    public List<ProductoEntity> buscarProductosPorDescripcionContaining(@PathVariable String descripcion){
        return productoService.buscarProductosPorDescripcionContaining(descripcion);
    }

    @DeleteMapping("eliminar/id/{id_producto}")
    public void  eliminarProductoPorId(@PathVariable Integer id_producto){
        productoService.eliminarProductoPorId(id_producto);
    }

    @PostMapping("crear")
    public void guardarProducto(@RequestBody ProductoEntity producto){
        productoService.guardarProducto(producto);
    }
}

//TODO MODIFICAR
