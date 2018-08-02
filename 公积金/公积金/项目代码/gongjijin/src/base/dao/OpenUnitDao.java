package base.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import base.po.SystemParameter;
import base.po.UnitBasicInformation;

public class OpenUnitDao {
	public Session getSession() {
		SessionFactory sf = new AnnotationConfiguration().configure()
				.buildSessionFactory();
		Session session = sf.openSession();
		return session;
	}
	
	public boolean openUnit(UnitBasicInformation ubi) {
		Session session = getSession();
		System.out.println("111111111..................");
		Query query = (Query) session
		.createQuery("from SystemParameter as sp where sp.seq = ?");
		query.setParameter(0, "op1");
		List<SystemParameter> list = query.list();
		System.out.println(list.size()+"................");
		for(SystemParameter sp:list){
			System.out.println(sp.getSeq());
			ubi.setUnitaccnum(""+sp.getSeq()+"");
		}
		Transaction tx=session.beginTransaction();
    	session.save(ubi);
    	tx.commit();
		return true;
	}

}
