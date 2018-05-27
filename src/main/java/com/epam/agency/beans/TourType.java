package com.epam.agency.beans;

/**
 * The TourType is entity class used for storage
 * information about tour type.
 * TourType implements the Identifier interface.
 *
 * @author      Maryia Kharuzhenka
 * @version     1.0
 */

public class TourType implements Identifier {
    /** serialVersionUID use for interoperability. */
    static final long serialVersionUID = 6L;
    /** Unique id of the tourType. */
    private int id;
    /** Name of the tour type. */
    private String name;

    /**
     * Constructs a new type of tour with {@code null} as its fields.
     */
    public TourType() {
    }

    /**
     * Initializes fields {@link TourType#id}, {@link TourType#name}.
     */
    public TourType(int id, String name) {
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
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        TourType tourType = (TourType) o;

        if (id != tourType.id) {
            return false;
        }
        return name != null ? name.equals(tourType.name) : tourType.name == null;

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
        return "TourType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

