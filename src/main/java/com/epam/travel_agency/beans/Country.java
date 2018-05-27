package com.epam.travel_agency.beans;

/**
 * The Country is entity class used for storage
 * information about country.
 * Country implements the Identifier interface.
 *
 * @author      Maryia Kharuzhenka
 * @version     1.0
 */

public class Country implements Identifier{
    /** serialVersionUID use for interoperability */
    static final long serialVersionUID = 2L;
    /** Unique id of the country */
    private int id;
    /** Name of the country */
    private String name;

    /**
     * Constructs a new country with {@code null} as its fields
     */
    public Country() {
    }

    /**
     * Initializes fields {@link Country#id}, {@link Country#name}.
     */
    public Country(int id, String name) {
        this.id = id;
        this.name = name;
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


    /**
     * @see java.lang.Object#equals(Object)
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country country = (Country) o;

        if (id != country.id) return false;
        return name != null ? name.equals(country.name) : country.name == null;

    }

    /**
     * @see Object#hashCode()
     */
    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    /**
     * @see Object#toString()
     */
    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

