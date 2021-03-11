package fr.eql.ai108.projet3.dao;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import fr.eql.ai108.projet3.entity.Service;
import fr.eql.ai108.projet3.idao.ServiceIDao;

@Remote(ServiceIDao.class)
@Stateless
public class ServiceDao extends GenericDao<Service> implements ServiceIDao{

	@PersistenceContext (unitName="PUPandAmi")
	private EntityManager em;
	
	@Override
	public List<Service> getAll() {
		Query query = em.createQuery("SELECT s FROM Service s");
		List<Service> services = query.getResultList();
		return services;
	}

	@Override
	public Long getNbServices() {
		Query query = em.createQuery("SELECT COUNT(s) FROM Service s");
		Long nbServices = (Long) query.getSingleResult();
		return nbServices;
	}
	
}
