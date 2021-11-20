package steps;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import jacson.CreateUserRequest;
import jacson.CreateUserResponse;
import jacson.UserPojoFull;

import java.util.List;

import static io.restassured.RestAssured.*;

public class UserSteps {
    private static final RequestSpecification REQUEST_SPECIFICATION =
            new RequestSpecBuilder()
                    .setBaseUri("https://reqres.in/api/")
                    .setBasePath("/users")
                    .setContentType(ContentType.JSON)
                    .build();



    private CreateUserResponse user;

    public UserPojoFull getUser(){
        return given().spec(REQUEST_SPECIFICATION).get("/"+user.getId()).as(UserPojoFull.class);
    }

}
