package com.epam.agency.beans;

/**
 * The Review is entity class used for storage
 * information about review.
 * Review implements the Identifier interface.
 *
 * @author      Maryia Kharuzhenka
 * @version     1.0
 */

public class Review implements Identifier {
    /** serialVersionUID use for interoperability. */
    static final long serialVersionUID = 4L;
    /** Unique id of the review. */
    private int id;
    /** Content of the review.*/
    private String content;
    /** Tour to which is written a review. */
    private Tour tour;
    /** User who wrote a review. */
    private User user;

    /**
     * Constructs a new review with {@code null} as its fields.
     */
    public Review() {
    }

    /**
     * Initializes fields {@link Review#id}, {@link Review#content},
     * {@link Review#tour}, {@link Review#user}.
     */
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

    /**
     * @see Object#hashCode()
     */
    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (tour != null ? tour.hashCode() : 0);
        result = 31 * result + (user != null ? user.hashCode() : 0);
        return result;
    }

    /**
     * @see Object#toString()
     */
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

