package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Location extends JobField {

    public Location(String value) {
        super(value);
    }

    // Custom toString, equals, and hashCode methods:

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // Getters and Setters:

}
