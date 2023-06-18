
package com.TiendaClase.dao;

import com.TiendaClase.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaDao extends JpaRepository <Categoria, Long>{
    
    
}
