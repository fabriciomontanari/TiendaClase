
package com.TiendaClase.service;

import com.TiendaClase.domain.Categoria;
import java.util.List;

public interface CategoriaService {
    
    //se obtiene la lista de categorias en un List
    public List<Categoria> getCategorias(boolean activo);
    
}
