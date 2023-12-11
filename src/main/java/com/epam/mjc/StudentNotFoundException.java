package com.epam.mjc;

/**
 * <p>An exception in the case when it was not possible to find a student using the transmitted id</p>
 * */
public class StudentNotFoundException extends IllegalArgumentException {
    private final long id;

    /**
     * @param id - student id to looking for
     * */
    public StudentNotFoundException(long id) {
        this.id = id;
    }

    @Override
    public String getMessage() {
        return String.format("Could not find student with ID %d", this.id);
    }
}
