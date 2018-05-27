package com.epam.beans;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Tour implements Identifier {
    static final long serialVersionUID = 5L;
    private int id;
    private String photo;
    private LocalDateTime date;
    private LocalTime duration;
    private String description;
    private BigDecimal cost;
    private TourType tourType;
    private Hotel hotel;

    public Tour() {
    }

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

