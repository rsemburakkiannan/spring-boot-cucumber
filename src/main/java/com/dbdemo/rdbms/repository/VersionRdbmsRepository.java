package com.dbdemo.rdbms.repository;

import com.dbdemo.rdbms.model.ApiVersion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VersionRdbmsRepository extends JpaRepository<ApiVersion, Long> {

}
