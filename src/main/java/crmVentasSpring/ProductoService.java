package crmVentasSpring;


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

    public ProductoEntity buscarProductoPorId(Integer id){
        return productoRepository.findById(id).orElse(null);
    }

}
