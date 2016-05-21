package Bean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import Control.CatalogoDAO;
import modelos.Catalogo;



@ManagedBean
@SessionScoped
public class prueba {


public void mostrarAction()
{
	System.out.println("llego aqui");
    CatalogoDAO catDAO = new CatalogoDAO();
    List<Catalogo> catalogo = new ArrayList<Catalogo>();
    catalogo = catDAO.listado_Cuentas();
	
}


}
