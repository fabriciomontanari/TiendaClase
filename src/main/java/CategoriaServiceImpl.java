
import com.TiendaClase.dao.CategoriaDao;
import com.TiendaClase.domain.Categoria;
import com.TiendaClase.service.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CategoriaServiceImpl implements CategoriaService{

    
    //se crea un objeto tipo Autowired que se creara automaticamente y solo una vez
    @Autowired
    private CategoriaDao categoriaDao;
    @Override
    @Transactional(readOnly=true)
    
    public List<Categoria> getCategorias(boolean activo) {
        var lista = categoriaDao.findAll();
        if(activo){
            lista.removeIf(e -> !e.isActivo());
        }
        return lista;
        
    }
    
}
