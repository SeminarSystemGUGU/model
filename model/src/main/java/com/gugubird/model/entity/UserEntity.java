package com.gugubird.model.entity;

import java.sql.Date;

/*****
 * @author TYJ
 */
public class UserEntity {
    private int userId;
    private String account;
    private String password;
    private String name;
    private String role;
    private String email;
    private String code;
    private Integer isActive;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getIsActive() {
        return isActive;
    }

    public void setStatus(Integer isActive) {
        this.isActive = isActive;
    }
}
