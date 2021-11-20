import jacson.CreateUserRequest;
import jacson.CreateUserResponse;
import jacson.UserPojoFull;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import utils.RestWrapper;
import utils.UserGenerator;

import java.util.List;

public class ApiTestTry {
    private  static RestWrapper api;
    @BeforeAll
    public static void prepareClient(){
        api = RestWrapper.loginAs("eve.holt@reqres.in" , "cityslicka");
    }


    @Test

    void userGet() {
      List<UserPojoFull> users = api.order.getOrders();
        Assertions.assertEquals("george.bluth@reqres.in", api.user.getUsers().get(0).getEmail());
    }

    @Test
    void createUser() {
        CreateUserRequest rq = UserGenerator.getSimpleUser();
        CreateUserResponse rs = api.user.createUser(rq);
        Assertions.assertNotNull(rs);
        Assertions.assertEquals("sumple", rs.getName());

    }

}
