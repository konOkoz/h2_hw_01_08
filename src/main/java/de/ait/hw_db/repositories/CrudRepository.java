package de.ait.hw_db.repositories;

import java.util.List;

public interface CrudRepository <T>{
    List<T> findAll();
}
