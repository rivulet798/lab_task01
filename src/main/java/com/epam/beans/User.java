package com.epam.beans;

import java.util.List;

public class User implements Identifier {
    static final long serialVersionUID = 1L;
    private int id;
    private String login;
    private String password;
    private List<Tour> visitedTours;
    private List<Review> reviews;

    public User() {
    }

    public User(int id, String login, String password, List<Tour> visitedTours, List<Review> reviews) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.visitedTours = visitedTours;
        this.reviews = reviews;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Tour> getVisitedTours() {
        return visitedTours;
    }

    public void setVisitedTours(List<Tour> visitedTours) {
        this.visitedTours = visitedTours;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        User user = (User) o;

        if (id != user.id) {
            return false;
        }
        if (login != null ? !login.equals(user.login) : user.login != null) {
            return false;
        }
        if (password != null ? !password.equals(user.password) : user.password != null) {
            return false;
        }
        if (visitedTours != null ? !visitedTours.equals(user.visitedTours) : user.visitedTours != null) {
            return false;
        }
        return reviews != null ? reviews.equals(user.reviews) : user.reviews == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (login != null ? login.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (visitedTours != null ? visitedTours.hashCode() : 0);
        result = 31 * result + (reviews != null ? reviews.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", visitedTours=" + visitedTours +
                ", reviews=" + reviews +
                '}';
    }
}

