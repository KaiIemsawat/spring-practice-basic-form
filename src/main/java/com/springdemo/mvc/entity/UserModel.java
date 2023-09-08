package com.springdemo.mvc.entity;

import jakarta.validation.constraints.*;

public class UserModel {

    @NotBlank(message = "Firstname cannot be blank")
    @Size(min=2, message = "Firstname cannot be shorter than 2 characters")
    @Size(max=24, message = "Firstname cannot be longer than 24 characters")
    @Pattern(regexp = "^[a-zA-Z]*$", message = "Firstname cannot contain any number or special character" )
    private String firstname;

    @NotBlank(message = "Lastname cannot be blank")
    @Size(min=3, message = "Lastname cannot be shorter than 3 characters")
    @Size(max=24, message = "Lastname cannot be longer than 24 characters")
    @Pattern(regexp = "^[a-zA-Z]*$", message = "Lastname cannot contain any number or special character" )
    private String lastname;

    @NotNull(message = "This field cannot be empty")
    @Min(value = 0, message = "Must be greater than 0")
    @Max(value = 9, message = "Must not be over 9")
    private Integer favoriteNumber;

    @Size(max=255, message = "Personal info} cannot be longer than 24 characters")
    private String info;




    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public Integer getFavoriteNumber() {
        return favoriteNumber;
    }
    public void setFavoriteNumber(Integer favoriteNumber) {
        this.favoriteNumber = favoriteNumber;
    }
    public String getInfo() {
        return info;
    }
    public void setInfo(String info) {
        this.info = info;
    }
}
