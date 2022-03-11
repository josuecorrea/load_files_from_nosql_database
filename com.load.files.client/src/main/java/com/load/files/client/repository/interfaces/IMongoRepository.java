package com.load.files.client.repository.interfaces;

import com.load.files.client.models.cep;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface IMongoRepository extends MongoRepository<cep, String> {
}
