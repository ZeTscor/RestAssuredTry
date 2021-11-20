package jacson;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserPojoFull {

    private  int id;
    private String email;
    private String first_name;
    private String last_name;
}
