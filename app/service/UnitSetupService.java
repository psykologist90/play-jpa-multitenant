package service;

import common.AsyncJPA;
import dao.UnitEntityDAO;
import models.application.UnitEntity;
import play.libs.F.Promise;

import javax.inject.Singleton;
import java.util.Set;

import static play.libs.F.Promise.promise;

/**
 * Created by RP on 1/7/16.
 */
@Singleton
public class UnitSetupService {

    private UnitEntityDAO dao;

    public UnitSetupService(){
        this.dao = new UnitEntityDAO();
    }

    public Promise<Set<UnitEntity>> findAll() {
        return AsyncJPA.doInAsync(() -> dao.findAll());
    }
}
