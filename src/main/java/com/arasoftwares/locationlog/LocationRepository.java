package com.arasoftwares.locationlog;

import org.springframework.data.repository.CrudRepository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "location", path = "location")
public interface LocationRepository extends CrudRepository<Location, Long> {

    Location findById(long id);

}