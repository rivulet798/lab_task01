package com.epam.travel_agency.beans;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * The Tour is entity class used for storage
 * information about tour.
 * Tour implements the Identifier interface.
 *
 * @author      Maryia Kharuzhenka
 * @version     1.0
 */

public class Tour implements Identifier {
    /** serialVersionUID use for interoperability */
    static final long serialVersionUID = 5L;
    /** Unique id of the tour */
    private int id;
    /** Photo of the tour */
    private String photo;
    /** Date of the beginning of the tour */
    private LocalDateTime date;
    /** Duration of the tour */
    private LocalTime duration;
    /** Description of the tour */
    private String description;
    /** Cost of the tour */
    private BigDecimal cost;
    /** Tour type */
    private TourType tourType;
    /** Hotel for the tour */
    private Hotel hotel;

    /**
     * Constructs a new tour with {@code null} as its fields
     */
    public Tour() {
    }

    /**
     * Initializes fields {@link Tour#id}, {@link Tour#photo},
     * {@link Tour#date}, {@link Tour#duration}, {@link Tour#description},
     * {@link Tour#cost}, {@link Tour#tourType}, {@link Tour#hotel}.
     */
    public Tour(int id, String photo, LocalDateTime date, LocalTime duration, String description, BigDecimal cost,
                TourType tourType, Hotel hotel) {
        this.id = id;
        this.photo = photo;
        this.date = date;
        this.duration = duration;
        this.description = description;
        this.cost = cost;
        this.tourType = tourType;
        this.hotel = hotel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public LocalTime getDuration() {
        return duration;
    }

    public void setDuration(LocalTime duration) {
        this.duration = duration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public TourType getTourType() {
        return tourType;
    }

    public void setTourType(TourType tourType) {
        this.tourType = tourType;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
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

        Tour tour = (Tour) o;

        if (id != tour.id) {
            return false;
        }
        if (photo != null ? !photo.equals(tour.photo) : tour.photo != null) {
            return false;
        }
        if (date != null ? !date.equals(tour.date) : tour.date != null) {
            return false;
        }
        if (duration != null ? !duration.equals(tour.duration) : tour.duration != null) {
            return false;
        }
        if (description != null ? !description.equals(tour.description) : tour.description != null) {
            return false;
        }
        if (cost != null ? !cost.equals(tour.cost) : tour.cost != null) {
            return false;
        }
        if (tourType != null ? !tourType.equals(tour.tourType) : tour.tourType != null) {
            return false;
        }
        return hotel != null ? hotel.equals(tour.hotel) : tour.hotel == null;

    }

    /**
     * @see Object#hashCode()
     */
    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (photo != null ? photo.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (duration != null ? duration.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (cost != null ? cost.hashCode() : 0);
        result = 31 * result + (tourType != null ? tourType.hashCode() : 0);
        result = 31 * result + (hotel != null ? hotel.hashCode() : 0);
        return result;
    }

    /**
     * @see Object#toString()
     */
    @Override
    public String toString() {
        return "Tour{" +
                "id=" + id +
                ", photo='" + photo + '\'' +
                ", date=" + date +
                ", duration=" + duration +
                ", description='" + description + '\'' +
                ", cost=" + cost +
                ", tourType=" + tourType +
                ", hotel=" + hotel +
                '}';
    }
}

