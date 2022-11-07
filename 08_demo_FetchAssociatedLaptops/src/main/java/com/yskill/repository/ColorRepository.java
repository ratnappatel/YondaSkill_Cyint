package com.yskill.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yskill.entity.Color;


public interface ColorRepository extends JpaRepository<Color, Long> {

}