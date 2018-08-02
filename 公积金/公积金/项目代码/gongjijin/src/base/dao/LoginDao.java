package base.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import base.po.Teller;

public class LoginDao {
	public Session getSession() {
		SessionFactory sf = new AnnotationConfiguration().configure()
				.buildSessionFactory();
		Session session = sf.openSession();
		return session;
	}

	public boolean doLogin(Teller te) {
		
		Session session = getSession();
		Query query = (Query) session
				.createQuery("from Teller as te where te.op = ? and te.password = ?");
		
		query.setParameter(0, te.getOp());
		query.setParameter(1, te.getPassword());
		List<Teller> list = query.list();
		//System.out.println(list.size());
		if (list.size() >= 1) {
			return true;
		} else {
			return false;
		}
	}

}
