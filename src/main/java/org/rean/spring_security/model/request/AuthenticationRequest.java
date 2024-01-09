package org.rean.spring_security.model.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
public record AuthenticationRequest() {
    public static String username;
    public static String password;
    @JsonProperty("full_name") public static String fullname;
    public static String email;

}
