package com.logs.app.dao;

import com.logs.app.model.Point;

import org.springframework.data.repository.CrudRepository;

public interface PointRepository extends CrudRepository<Point, Long> {}
