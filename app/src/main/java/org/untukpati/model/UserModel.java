package org.untukpati.model;

/**
 * Dummy Class For Retrofit Testing
 */

public class UserModel {

    private String stuNumber;
    private String stuName;

    public UserModel(String stuNumber, String stuName) {
        this.stuNumber = stuNumber;
        this.stuName = stuName;
    }

    public String getStuNumber() {
        return stuNumber;
    }

    public void setStuNumber(String stuNumber) {
        this.stuNumber = stuNumber;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }
}
