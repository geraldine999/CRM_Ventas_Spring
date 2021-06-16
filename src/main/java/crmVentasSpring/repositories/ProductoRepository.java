package crmVentasSpring.repositories;

import crmVentasSpring.entities.ProductoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoRepository extends JpaRepository<ProductoEntity, Integer> {




    List<ProductoEntity> getProductoEntitiesByCategoria(String categoria);

    List<ProductoEntity> getProductoEntitiesByNombreContaining(String nombre);

    List<ProductoEntity> getProductoEntitiesByDescripcionContaining(String descripcion);


    ProductoEntity findProductoEntityByCodigoproducto(String codigoproducto);
}
