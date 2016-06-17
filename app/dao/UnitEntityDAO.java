package dao;

import models.application.UnitEntity;

/**
 * Created by eric on 6/16/16.
 */
public class UnitEntityDAO extends BaseDAO{

    public UnitEntityDAO(){}

    @Override
    Class<?> getEntityClass() {
        return UnitEntity.class;
    }
}
