package com.dbdemo.controller;

import com.dbdemo.nosql.service.VersionServiceNoSql;
import com.dbdemo.rdbms.service.VersionServiceRdbms;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Common controller for both embedded database. H2 and Embedded Mongo.
 */
@RestController
public class VersionController {

    @Autowired
    VersionServiceRdbms versionServiceRdbms;

    @Autowired
    VersionServiceNoSql versionServiceNoSql;

    /**
     * @return version info using rdbms data type. Used embedded db is h2.
     */
    @GetMapping("/rdbms/version")
    public String getVersionRdbms() {
        versionServiceRdbms.saveVersion("1.0");
        return versionServiceRdbms.getVersion().getVersion();
    }

    /**
     * @return version info using nosql data type. Used embedded db is embedded mongo using flapdoodle dependency.
     */
    @GetMapping("/nosql/version")
    public String getVersionNoSql() {
        versionServiceNoSql.saveVersion("2.0"); //Save some version before retrieve
        return versionServiceNoSql.getVersion().getVersion();
    }
}
