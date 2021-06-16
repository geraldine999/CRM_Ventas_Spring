package crmVentasSpring.entities;

import javax.persistence.*;


@Entity
@Table(name = "productos")
public class ProductoEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idproducto;
    private String codigoproducto;
    private String categoria;
    private String nombre;
    private String descripcion;
    private Double preciounitario;
    private Integer stock;

    public ProductoEntity(Integer idproducto, String codigoproducto, String categoria, String nombre, String descripcion, Double preciounitario, Integer stock) {
        this.idproducto = idproducto;
        this.codigoproducto = codigoproducto;
        this.categoria = categoria;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.preciounitario = preciounitario;
        this.stock = stock;
    }

    public ProductoEntity(String codigoproducto, String categoria, String nombre, String descripcion, Double preciounitario, Integer stock) {
        this.codigoproducto = codigoproducto;
        this.categoria = categoria;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.preciounitario = preciounitario;
        this.stock = stock;
    }

    public ProductoEntity() {
    }

    public Integer getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(Integer id_producto) {
        this.idproducto = id_producto;
    }

    public String getCodigoproducto() {
        return codigoproducto;
    }

    public void setCodigoproducto(String codigo_producto) {
        this.codigoproducto = codigo_producto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPreciounitario() {
        return preciounitario;
    }

    public void setPreciounitario(Double precio_unitario) {
        this.preciounitario = precio_unitario;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "ProductoEntity{" +
                "id_producto=" + idproducto +
                ", codigo_producto='" + codigoproducto + '\'' +
                ", categoria='" + categoria + '\'' +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precio_unitario=" + preciounitario +
                ", stock=" + stock +
                '}';
    }
}