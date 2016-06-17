package dao;

import models.application.User;

/**
 * Created by eric on 6/16/16.
 */
public class UserDAO extends BaseDAO{

    public UserDAO(){}

    @Override
    Class<?> getEntityClass() {
        return User.class;
    }
}
