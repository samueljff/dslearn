package com.devsuperior.dslearnbds.services;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dslearnbds.dto.DeliverRevisionDTO;
import com.devsuperior.dslearnbds.entities.Deliver;
import com.devsuperior.dslearnbds.repositories.DeliverRepositoy;
import com.devsuperior.dslearnbds.services.exceptions.ResourceNotFoundException;

@Service
public class DeliverService {

	@Autowired
	private DeliverRepositoy repository;

	@Transactional
	public void saveRevision(Long id, DeliverRevisionDTO dto) {
		try {
			Deliver deliver = repository.getOne(id);
			deliver.setStatus(dto.getStatus());
			deliver.setFeedback(dto.getFeedback());
			deliver.setCorrectCount(dto.getCorrectCount());
			repository.save(deliver);
		}catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException("Id not Found!");
		}
	}
}
