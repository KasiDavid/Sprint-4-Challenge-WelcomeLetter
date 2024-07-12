package com.bloomtech.welcomeletter.models;

public class Company {
    private static int maxId = 1;
    private int id;

    private String companyname;
    private String country;

    public static Builder builder() {
        return new Builder();
    }

    //TODO: Replace with Builder Constructor
    private Company(Builder builder) {
        //Auto-generate an id
        this.id = maxId;
        maxId++;

        //Initialize fields
        this.companyname = builder.companyname;
        this.country = builder.country;
    }

    public static final class Builder {
        //TODO: Implement Builder Pattern
        private static int maxId = 1;
        private int id;

        private String companyname;
        private String country;

        public Builder() {

        }

        public Builder withCompanyname(String companyname) {
            this.companyname = companyname;
            return this;
        }
        public Builder withCountry(String country) {
            this.country = country;
            return this;
        }
        public Company build() {
            return new Company(this);
        }
    }

    public int getId() {
        return id;
    }

    public String getCompanyname() {
        return companyname;
    }

    public String getCountry() {
        return country;
    }
}
