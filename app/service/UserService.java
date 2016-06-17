package service;

import common.AsyncJPA;
import dao.UserDAO;
import models.application.User;
import play.libs.F.Promise;

import javax.inject.Singleton;
import java.util.Set;

import static play.libs.F.Promise.promise;

/**
 * Created by RP on 1/7/16.
 */
@Singleton
public class UserService {

    private UserDAO dao;

    public UserService(){
        this.dao = new UserDAO();
    }

    public Promise<Set<User>> findAll() {
        return AsyncJPA.doInAsync(() -> dao.findAll());
    }
}
