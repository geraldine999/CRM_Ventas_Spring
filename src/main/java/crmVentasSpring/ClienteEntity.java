package crmVentasSpring;

import javax.persistence.*;

@Entity
@Table(name="clientes")
public class ClienteEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_cliente;
    private String nombre;
    private String nombre_Empresa;
    private String cargo;
    private String telefono;
    private String mail;

    public ClienteEntity() {
    }

    public ClienteEntity(Integer id_cliente, String nombre, String nombre_Empresa, String cargo, String telefono, String mail) {
        this.id_cliente = id_cliente;
        this.nombre = nombre;
        this.nombre_Empresa = nombre_Empresa;
        this.cargo = cargo;
        this.telefono = telefono;
        this.mail = mail;
    }

    public ClienteEntity(String nombre, String nombre_Empresa, String cargo, String telefono, String mail) {
        this.nombre = nombre;
        this.nombre_Empresa = nombre_Empresa;
        this.cargo = cargo;
        this.telefono = telefono;
        this.mail = mail;
    }


    public Integer getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Integer idCliente) {
        this.id_cliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre_Empresa() {
        return nombre_Empresa;
    }

    public void setNombre_Empresa(String nombreEmpresa) {
        this.nombre_Empresa = nombreEmpresa;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "ClienteEntity{" +
                "idCliente=" + id_cliente +
                ", nombre='" + nombre + '\'' +
                ", nombreEmpresa='" + nombre_Empresa + '\'' +
                ", cargo='" + cargo + '\'' +
                ", telefono='" + telefono + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}
