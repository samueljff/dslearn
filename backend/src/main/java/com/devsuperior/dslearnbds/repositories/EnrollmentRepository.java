package com.devsuperior.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslearnbds.entities.Notification;

public interface EnrollmentRepository extends JpaRepository<Notification, Long> {

}
