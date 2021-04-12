package com.dbdemo.rdbms.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "API_VERSION")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiVersion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "version")
    private String version;
}

