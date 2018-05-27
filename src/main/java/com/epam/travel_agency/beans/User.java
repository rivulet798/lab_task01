package com.epam.travel_agency.beans;

import java.util.List;

/**
 * The User is entity class used for storage
 * information about user.
 * User implements the Identifier interface.
 *
 * @author      Maryia Kharuzhenka
 * @version     1.0
 */

public class User implements Identifier {
    /** serialVersionUID use for interoperability */
    static final long serialVersionUID = 1L;
    /** Unique id of the user */
    private int id;
    /** Login of the user */
    private String login;
    /** Password of the user */
    private String password;
    /** List of tours visited by the user */
    private List<Tour> visitedTours;
    /** List of reviews the user wrote */
    private List<Review> reviews;

    /**
     * Constructs a new user with {@code null} as its fields
     */
    public User() {
    }

    /**
     * Initializes fields {@link User#id}, {@link User#login},
     * {@link User#password}, {@link User#visitedTours}, {@link User#reviews}.
     */
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

    /**
     * @see java.lang.Object#equals(Object)
     */
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

    /**
     * @see Object#hashCode()
     */
    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (login != null ? login.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (visitedTours != null ? visitedTours.hashCode() : 0);
        result = 31 * result + (reviews != null ? reviews.hashCode() : 0);
        return result;
    }

    /**
     * @see Object#toString()
     */
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

