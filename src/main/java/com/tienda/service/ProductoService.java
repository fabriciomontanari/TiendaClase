package com.tienda.service;

import com.tienda.domain.Producto;
import java.util.List;

public interface ProductoService {
    
    //Se obtiene la lista de productos en un List
    public List<Producto> getProductos(boolean activo);
    
    // Se obtiene un Producto, a partir del id de un producto
    public Producto getProducto(Producto producto);
    
    // Se inserta un nuevo producto si el id del producto esta vacÃ­o
    // Se actualiza un producto si el id del producto NO esta vacÃ­o
    public void save(Producto producto);
    
    // Se elimina el producto que tiene el id pasado por parÃ¡metro
    public void delete(Producto producto);
    
//Lista de los productos que estan en un rango de precios y los ordena por descripcion.
    public List<Producto> findByPrecioBetweenOrderByDescripcion(double precioInf, double precioSup);
    
    //Lista de los productos mediante un JPQL
    public List<Producto> metodoJPQL(double precioInf, double precioSup);
    
    //Lista de los productos mediante un SQL Nativo
    public List<Producto> metodoNativo(double precioInf, double precioSup);
}
