package com.epam.beans;

public class Hotel implements Identifier {
    static final long serialVersionUID = 3L;
    private int id;
    private String name;
    private String photo;
    private int stars;
    private Country country;

    public Hotel() {
    }

    public Hotel(int id, String name, String photo, int stars, Country country) {
        this.id = id;
        this.name = name;
        this.photo = photo;
        this.stars = stars;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Hotel hotel = (Hotel) o;

        if (id != hotel.id) {
            return false;
        }
        if (stars != hotel.stars) {
            return false;
        }
        if (name != null ? !name.equals(hotel.name) : hotel.name != null) {
            return false;
        }
        if (photo != null ? !photo.equals(hotel.photo) : hotel.photo != null) {
            return false;
        }
        return country != null ? country.equals(hotel.country) : hotel.country == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (photo != null ? photo.hashCode() : 0);
        result = 31 * result + stars;
        result = 31 * result + (country != null ? country.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", photo='" + photo + '\'' +
                ", stars=" + stars +
                ", country=" + country +
                '}';
    }
}

