package com.example.tassain;

public class Users {

    String dog_name, dog_age, dog_breed, owner_name, owner_address, owner_email, owner_phone;

    public Users() {
    }

    public Users(String dog_name, String dog_age, String dog_breed, String owner_name,
                 String owner_address, String owner_email, String owner_phone) {
        this.dog_name = dog_name;
        this.dog_age = dog_age;
        this.dog_breed = dog_breed;
        this.owner_name = owner_name;
        this.owner_address = owner_address;
        this.owner_email = owner_email;
        this.owner_phone = owner_phone;
    }

    public String getDog_name() {
        return dog_name;
    }

    public void setDog_name(String dog_name) {
        this.dog_name = dog_name;
    }

    public String getDog_age() {
        return dog_age;
    }

    public void setDog_age(String dog_age) {
        this.dog_age = dog_age;
    }

    public String getDog_breed() {
        return dog_breed;
    }

    public void setDog_breed(String dog_breed) {
        this.dog_breed = dog_breed;
    }

    public String getOwner_name() {
        return owner_name;
    }

    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }

    public String getOwner_address() {
        return owner_address;
    }

    public void setOwner_address(String owner_address) {
        this.owner_address = owner_address;
    }

    public String getOwner_email() {
        return owner_email;
    }

    public void setOwner_email(String owner_email) {
        this.owner_email = owner_email;
    }

    public String getOwner_phone() {
        return owner_phone;
    }

    public void setOwner_phone(String owner_phone) {
        this.owner_phone = owner_phone;
    }
}
