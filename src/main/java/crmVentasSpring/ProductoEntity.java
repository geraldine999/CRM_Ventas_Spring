package crmVentasSpring;

import javax.persistence.*;

@Table(name = "productos")
@Entity
public class ProductoEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_producto;
    private String codigo_producto;
    private String categoria;
    private String nombre;
    private String descripcion;
    private Double precio_unitario;
    private Integer stock;

    public ProductoEntity(Integer id_producto, String codigo_producto, String categoria, String nombre, String descripcion, Double precio_unitario, Integer stock) {
        this.id_producto = id_producto;
        this.codigo_producto = codigo_producto;
        this.categoria = categoria;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio_unitario = precio_unitario;
        this.stock = stock;
    }

    public ProductoEntity(String codigo_producto, String categoria, String nombre, String descripcion, Double precio_unitario, Integer stock) {
        this.codigo_producto = codigo_producto;
        this.categoria = categoria;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio_unitario = precio_unitario;
        this.stock = stock;
    }

    public ProductoEntity() {
    }

    public Integer getId_producto() {
        return id_producto;
    }

    public void setId_producto(Integer id_producto) {
        this.id_producto = id_producto;
    }

    public String getCodigo_producto() {
        return codigo_producto;
    }

    public void setCodigo_producto(String codigo_producto) {
        this.codigo_producto = codigo_producto;
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

    public Double getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(Double precio_unitario) {
        this.precio_unitario = precio_unitario;
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
                "id_producto=" + id_producto +
                ", codigo_producto='" + codigo_producto + '\'' +
                ", categoria='" + categoria + '\'' +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precio_unitario=" + precio_unitario +
                ", stock=" + stock +
                '}';
    }
}