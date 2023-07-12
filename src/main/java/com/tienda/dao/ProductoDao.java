package com.tienda.dao;

import com.tienda.domain.Producto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProductoDao 
        extends JpaRepository <Producto, Long>{
    
    //Consulta ampliada nativa
    public List<Producto> findByPrecioBetweenOrderByDescripcion(double precioInf, double precioSup);
    
    
    //Consulta ampliada tipo JPQL
    @Query(value="SELECT a FROM Producto a WHERE a.precio BETWEEN :precioInf AND :precioSup ORDER BY a.descripcion ASC")
    public List<Producto> metodoJPQL(@Param("precioInf") double precioInf,@Param("precioSup")double precioSup);
    
    //Consulta ampliada tipo SQL nativo
    @Query(nativeQuery = true,
            value="SELECT * FROM producto a WHERE a.precio BETWEEN :precioInf AND :precioSup ORDER BY a.descripcion ASC")
    public List<Producto> metodoNativo(@Param("precioInf") double precioInf,@Param("precioSup")double precioSup);
}
