import org.hibernate.Session;

import br.com.campanha.entity.CampanhaEntity;
import br.com.campanha.util.HibernateHelper;

public class DAOUtil {

	public void gravar(CampanhaEntity campanha) {
		Session session = HibernateHelper.buildSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(campanha);
		session.getTransaction().commit();
		session.close();
		
	}
}
