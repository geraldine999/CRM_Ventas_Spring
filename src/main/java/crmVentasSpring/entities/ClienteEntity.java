package crmVentasSpring.entities;

import javax.persistence.*;

@Entity
@Table(name="clientes")
public class ClienteEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idcliente;
    private String nombre;
    private String nombreempresa;
    private String cargo;
    private String telefono;
    private String mail;

    public ClienteEntity() {
    }

    public ClienteEntity(Integer idcliente, String nombre, String nombreempresa, String cargo, String telefono, String mail) {
        this.idcliente = idcliente;
        this.nombre = nombre;
        this.nombreempresa = nombreempresa;
        this.cargo = cargo;
        this.telefono = telefono;
        this.mail = mail;
    }

    public ClienteEntity(String nombre, String nombreempresa, String cargo, String telefono, String mail) {
        this.nombre = nombre;
        this.nombreempresa = nombreempresa;
        this.cargo = cargo;
        this.telefono = telefono;
        this.mail = mail;
    }


    public Integer getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(Integer idCliente) {
        this.idcliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreempresa() {
        return nombreempresa;
    }

    public void setNombreempresa(String nombreEmpresa) {
        this.nombreempresa = nombreEmpresa;
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
                "idCliente=" + idcliente +
                ", nombre='" + nombre + '\'' +
                ", nombreEmpresa='" + nombreempresa + '\'' +
                ", cargo='" + cargo + '\'' +
                ", telefono='" + telefono + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}
