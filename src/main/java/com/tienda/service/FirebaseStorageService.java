
package com.tienda.service;

import org.springframework.web.multipart.MultipartFile;

public interface FirebaseStorageService {
    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);
    
    //El BuketName es el <id del proyecto> +.appspot.com
    final String BucketName="techoshop-9c660.appspot.com";
    
    //Esta es la ruta base de este proyecto en el storage
    final String rutaSuperiorStorage="techshop";
    
    //Ubicacion del achivo de configuracion Json
    final String rutaJsonFile="firebase";
    
    final String archivoJsonFile="techoshop-9c660-firebase-adminsdk-6frfb-4047de61d7"; 
}
