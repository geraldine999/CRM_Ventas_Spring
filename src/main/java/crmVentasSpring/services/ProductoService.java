package crmVentasSpring.services;


import crmVentasSpring.entities.ProductoEntity;
import crmVentasSpring.repositories.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductoService {

    private final ProductoRepository productoRepository;

    @Autowired
    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public List<ProductoEntity> getProductos(){
        return productoRepository.findAll();
    }



    public List<ProductoEntity> buscarProductosPorCategoria(String categoria) {
        return productoRepository.getProductoEntitiesByCategoria(categoria);
    }

    public List<ProductoEntity> buscarProductosPorNombreContaining(String nombre) {
        return productoRepository.getProductoEntitiesByNombreContaining(nombre);
    }

    public List<ProductoEntity> buscarProductosPorDescripcionContaining(String descripcion) {
        return productoRepository.getProductoEntitiesByDescripcionContaining(descripcion);
    }

    public void eliminarProductoPorId(Integer id) {
        productoRepository.deleteById(id);
    }

    public void guardarProducto(ProductoEntity producto){
        productoRepository.save(producto);

    }

    public ProductoEntity buscarProductoPorCodigo(String codigoproducto) {
        return productoRepository.findProductoEntityByCodigoproducto(codigoproducto);
    }
}
