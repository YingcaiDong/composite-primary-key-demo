package com.Employee.DataManagement.topic;

import org.springframework.data.repository.CrudRepository;

/* 
 * CrudRepository interface contains common functions (add, get, update, delete)
 * In the generic, the first generic type is the return type
 * The second generic type is the id type (AKA primary key type)
 */
public interface TopicRepository extends CrudRepository<Topic, String> {

}
