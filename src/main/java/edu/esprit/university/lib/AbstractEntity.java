package edu.esprit.university.lib;

public interface AbstractEntity<T> {
    Long getId();
    void setId(Long id);

    void update(T source);

    T create();
}
