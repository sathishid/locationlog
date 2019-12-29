package com.arasoftwares.locationlog;

import org.springframework.data.repository.CrudRepository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;


public interface LocationRepository extends CrudRepository<Location, Long> {


}