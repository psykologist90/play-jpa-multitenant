package dao;

import models.bo.BaseDo;
import play.db.jpa.JPA;

import javax.persistence.Query;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by eric on 6/16/16.
 */
abstract class BaseDAO {

    abstract Class<?> getEntityClass();

    private <T extends BaseDo> Set<T> findAllEntities(Class<T> t) {
        Query query = JPA.em().createQuery("SELECT t FROM "+ t.getName()+" t");
        return new LinkedHashSet<>(query.getResultList());
    }

    private <T extends BaseDo> T find(Class<T> t, Object primaryKey) {
        return JPA.em().find(t, primaryKey);
    }

    public <T extends BaseDo> T findById(Object primaryKey){
        return this.find((Class<T>) getEntityClass(), primaryKey);
    }

    public <T extends BaseDo> Set<T> findAll(){
        return this.findAllEntities((Class<T>) getEntityClass());
    }
}
