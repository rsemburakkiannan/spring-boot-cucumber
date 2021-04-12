package com.dbdemo.nosql.repository;

import com.dbdemo.nosql.model.ApiVersion;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VersionNoSqlRepository extends MongoRepository<ApiVersion,Long> {
}
