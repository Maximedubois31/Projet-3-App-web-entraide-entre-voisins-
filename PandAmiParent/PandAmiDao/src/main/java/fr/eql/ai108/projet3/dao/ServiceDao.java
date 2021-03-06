package fr.eql.ai108.projet3.dao;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import fr.eql.ai108.projet3.entity.CategorieAide;
import fr.eql.ai108.projet3.entity.JourSemaine;
import fr.eql.ai108.projet3.entity.Materiel;
import fr.eql.ai108.projet3.entity.Service;
import fr.eql.ai108.projet3.entity.TypeAide;
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

	@Override
	public List<TypeAide> typesAide() {
		Query query = em.createQuery("SELECT t FROM TypeAide t");
		List<TypeAide> typesAide = query.getResultList();
		return typesAide;
	}

	@Override
	public List<Materiel> materiels() {
		Query query = em.createQuery("SELECT m FROM Materiel m");
		List<Materiel> materiels = query.getResultList();
		return materiels;
	}

	@Override
	public List<Service> getAllNoVolontaire() {
		System.out.println("**** REQUETE");
		Query query = em.createQuery("SELECT s FROM Service s WHERE id=1");
		List<Service> servicesSsVolontaires = query.getResultList();
		return servicesSsVolontaires;
	}

	@Override
	public List<CategorieAide> getCategoriesAide() {
		Query query = em.createQuery("SELECT c FROM CategorieAide c");
		List<CategorieAide> categoriesAide = query.getResultList();
		return categoriesAide;
	}

	@Override
	public List<TypeAide> getTypesAideCat1() {
		Query query = em.createQuery("SELECT t FROM TypeAide t WHERE t.categorieAide.id = 1");
		List<TypeAide> typesAideCat1 = query.getResultList();
		return typesAideCat1;
	}

	@Override
	public List<TypeAide> getTypesAideCat2() {
		Query query = em.createQuery("SELECT t FROM TypeAide t WHERE t.categorieAide.id = 2");
		List<TypeAide> typesAideCat2 = query.getResultList();
		return typesAideCat2;
	}

	@Override
	public List<TypeAide> getTypesAideCat3() {
		Query query = em.createQuery("SELECT t FROM TypeAide t WHERE t.categorieAide.id = 3");
		List<TypeAide> typesAideCat3 = query.getResultList();
		return typesAideCat3;
	}

	@Override
	public List<TypeAide> getTypesAideCat4() {
		Query query = em.createQuery("SELECT t FROM TypeAide t WHERE t.categorieAide.id = 4");
		List<TypeAide> typesAideCat4 = query.getResultList();
		return typesAideCat4;
	}

	@Override
	public List<TypeAide> getTypesAideCat5() {
		Query query = em.createQuery("SELECT t FROM TypeAide t WHERE t.categorieAide.id = 5");
		List<TypeAide> typesAideCat5 = query.getResultList();
		return typesAideCat5;
	}

	@Override
	public List<TypeAide> getTypesAideCat6() {
		Query query = em.createQuery("SELECT t FROM TypeAide t WHERE t.categorieAide.id = 6");
		List<TypeAide> typesAideCat6 = query.getResultList();
		return typesAideCat6;
	}

	@Override
	public List<TypeAide> getTypesAideCat7() {
		Query query = em.createQuery("SELECT t FROM TypeAide t WHERE t.categorieAide.id = 7");
		List<TypeAide> typesAideCat7 = query.getResultList();
		return typesAideCat7;
	}

	@Override
	public List<TypeAide> getTypesAideCat8() {
		Query query = em.createQuery("SELECT t FROM TypeAide t WHERE t.categorieAide.id = 8");
		List<TypeAide> typesAideCat8 = query.getResultList();
		return typesAideCat8;
	}

	@Override
	public List<TypeAide> getTypesAideCat9() {
		Query query = em.createQuery("SELECT t FROM TypeAide t WHERE t.categorieAide.id = 9");
		List<TypeAide> typesAideCat9 = query.getResultList();
		return typesAideCat9;
	}

	@Override
	public List<TypeAide> getTypesAideCat10() {
		Query query = em.createQuery("SELECT t FROM TypeAide t WHERE t.categorieAide.id = 10");
		List<TypeAide> typesAideCat10 = query.getResultList();
		return typesAideCat10;
	}

	@Override
	public List<TypeAide> getTypesAideCat11() {
		Query query = em.createQuery("SELECT t FROM TypeAide t WHERE t.categorieAide.id = 11");
		List<TypeAide> typesAideCat11 = query.getResultList();
		return typesAideCat11;
	}	
}
