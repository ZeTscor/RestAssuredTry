package service;

import io.restassured.http.Cookies;
import jacson.UserPojoFull;

import java.util.List;

import static io.restassured.RestAssured.given;

public class OrdersService extends RestService {
    public OrdersService(Cookies cookies) {
        super(cookies);
    }

    @Override
    protected String getBasePath() {
        return "/orders";
    }

    public List<UserPojoFull> getOrders() {
        return given().spec(REQ_SPEC)
                .get()
                .jsonPath().getList("data", UserPojoFull.class);
    }
}
