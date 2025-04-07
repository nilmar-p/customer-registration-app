package model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UserAccount {

    @JsonProperty("username")
    protected String userName;

    @JsonProperty("userPassword")
    protected String userPassword;

    @JsonCreator
    public UserAccount(
            @JsonProperty("username") String userName,
            @JsonProperty("userPassword") String userPassword
    ) {
        this.userName = userName;
        this.userPassword = userPassword;
    }

    // Getters e setters
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
