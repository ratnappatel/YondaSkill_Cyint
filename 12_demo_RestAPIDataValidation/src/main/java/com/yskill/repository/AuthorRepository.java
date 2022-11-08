package com.yskill.repository;

import org.springframework.data.repository.CrudRepository;

import com.yskill.entity.Author;

public interface AuthorRepository extends CrudRepository<Author, Integer> {

}
