package fr.eql.ai108.projet3.idao;

import java.util.List;

import fr.eql.ai108.projet3.entity.CategorieAide;
import fr.eql.ai108.projet3.entity.JourSemaine;
import fr.eql.ai108.projet3.entity.Materiel;
import fr.eql.ai108.projet3.entity.Service;
import fr.eql.ai108.projet3.entity.TypeAide;

public interface ServiceIDao extends GenericIDao<Service> {
	List<Service> getAll();
	List<Service> getAllNoVolontaire();
	Long getNbServices();
	List<TypeAide> typesAide();
	List<Materiel> materiels();
	List<CategorieAide> getCategoriesAide();
	List<TypeAide> getTypesAideCat1();
	List<TypeAide> getTypesAideCat2();
	List<TypeAide> getTypesAideCat3();
	List<TypeAide> getTypesAideCat4();
	List<TypeAide> getTypesAideCat5();
	List<TypeAide> getTypesAideCat6();
	List<TypeAide> getTypesAideCat7();
	List<TypeAide> getTypesAideCat8();
	List<TypeAide> getTypesAideCat9();
	List<TypeAide> getTypesAideCat10();
	List<TypeAide> getTypesAideCat11();
}
