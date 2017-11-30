package com.AppDevFinalProject.PhilliesFlowers.repositories;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.AppDevFinalProject.PhilliesFlowers.entities.Bundle;

public interface BundleRepo extends MongoRepository<Bundle, Integer>
{
	
}
