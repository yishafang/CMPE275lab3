package dao;

import java.util.List;

import model.Player;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class PlayerDaoImpl implements PlayerDao {
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public void save(Player p) {
		Session session = this.sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.persist(p);
		transaction.commit();
		session.close();
	}
	
	
	@SuppressWarnings("unchecked")
	public List<Player> list() {
		Session session = this.sessionFactory.openSession();
		List<Player> playerList = session.createQuery("from Player").list();
		session.close();
		return playerList;
	}
}
