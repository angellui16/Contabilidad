package Control;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import HibernateUtil.hibernateUtil;
import modelos.Catalogo;



public class CatalogoDAO {
	private Session session;
	private Transaction trans;
	
	public List<Catalogo> listado_Cuentas() {
		List<Catalogo> catalogo = null;
		try {
			session = hibernateUtil.getSessionFactory().openSession();
			String hql = "from Catalogo";
			Query qr = (Query) session.createQuery(hql);
			catalogo= new ArrayList<Catalogo>();
			for (int i = 0; i < qr.list().size(); i++) {
				catalogo.add((Catalogo) qr.list().get(i));
			}
		} catch (Exception ex) {
			System.out.println(ex);
		} finally {
			session.close();
		}
		return catalogo;
	}

	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

	public Transaction getTrans() {
		return trans;
	}

	public void setTrans(Transaction trans) {
		this.trans = trans;
	}

}
