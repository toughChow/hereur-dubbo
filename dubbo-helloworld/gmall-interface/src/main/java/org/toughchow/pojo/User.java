package org.toughchow.pojo;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = -6878053406541100993L;

    public Integer id;

    public String username;

    public String password;

    public User() {
    }

    public User(int i, String rikey, String bericky) {
        this.id = i;
        this.username = rikey;
        this.password = bericky;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
