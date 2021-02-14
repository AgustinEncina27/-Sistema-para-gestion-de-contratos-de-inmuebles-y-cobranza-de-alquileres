package interDAO;

import Clases.Inmueble;
import java.util.ArrayList;
import java.util.List;

public interface inmuebledao extends DAO<Inmueble, Long>{
   
    public void desconectar();
    public List <Inmueble> obtener(String a);
}
