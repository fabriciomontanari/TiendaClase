package com.tienda.service;

import org.springframework.web.multipart.MultipartFile;

public interface FirebaseStorageService {
    public String cargaImagen(MultipartFile archivoLocalCliente, 
            String carpeta, 
            Long id);
    
    //El BuketName es el <id del proyecto>+.appspot.com
    final String BucketName="techshop-6331c.appspot.com";
    
    //Esta es la ruta base de estre proyecto en el Storage
    final String rutaSuperiorStorage="techshop";
    
    //Ubicaciòn del archivo de configuraciòn Json
    final String rutaJsonFile="firebase";
    
    final String archivoJsonFile="techshop-6331c-firebase-adminsdk-lylha-6fd8f81be7.json";
}
