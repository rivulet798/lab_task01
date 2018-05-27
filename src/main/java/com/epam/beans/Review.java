package com.epam.beans;

public class Review implements Identifier {
    static final long serialVersionUID = 4L;
    private int id;
    private String content;
    private Tour tour;
    private User user;

    public Review() {
    }

    public Review(int id, String content, Tour tour, User user) {
        this.id = id;
        this.content = content;
        this.tour = tour;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Tour getTour() {
        return tour;
    }

    public void setTour(Tour tour) {
        this.tour = tour;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Review review = (Review) o;

        if (id != review.id) {
            return false;
        }
        if (content != null ? !content.equals(review.content) : review.content != null) {
            return false;
        }
        if (tour != null ? !tour.equals(review.tour) : review.tour != null) {
            return false;
        }
        return user != null ? user.equals(review.user) : review.user == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (tour != null ? tour.hashCode() : 0);
        result = 31 * result + (user != null ? user.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Review{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", tour=" + tour +
                ", user=" + user +
                '}';
    }
}

