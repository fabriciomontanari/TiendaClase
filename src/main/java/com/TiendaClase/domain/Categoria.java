
package com.TiendaClase.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;
import nonapi.io.github.classgraph.json.Id;

@Data
@Entity
@Table(name="categoria")

public class Categoria implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private static final long serialVersionUID = 1L;
    @Column(namw="id_Categoria")
    private Long idCategoria;
    private String descripcion;
    private String rutaImagen;
    private boolean activo;
    
}
