package controllers;

import models.application.User;
import play.libs.F;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import service.UserService;

import javax.inject.Inject;
import java.util.Set;

/**
 * Delegates the calls to Service.
 * Note: @Transactional can not be used as Action compositions are called before RequestHandler and @Transactional tries
 * to bind the entity manager which fails as the tenant is not available yet.
 * Created by RP on 12/15/15.
 */
public class UserController extends Controller {

    @Inject
    private UserService userService;


    public F.Promise<Result> index() {
        return list();
    }

    /**
     * Returns list of users.
     */
    public F.Promise<Result> list() {
        F.Promise<Set<User>> entities = userService.findAll();
        return entities.map((Set<User> e) -> {
            return ok(Json.toJson(e));
        });
    }
}
