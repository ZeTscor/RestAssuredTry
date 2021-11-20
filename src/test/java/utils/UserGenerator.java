package utils;

import jacson.CreateUserRequest;

public class UserGenerator {

    public static CreateUserRequest getSimpleUser(){
        return CreateUserRequest.builder()
                .name("sumple")
                .job("jobs")
                .build();
    }
}
