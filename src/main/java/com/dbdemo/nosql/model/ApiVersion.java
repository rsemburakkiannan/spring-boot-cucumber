package com.dbdemo.nosql.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "version-table")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiVersion {
    @Id
    private Long id;

    private String version;
}

