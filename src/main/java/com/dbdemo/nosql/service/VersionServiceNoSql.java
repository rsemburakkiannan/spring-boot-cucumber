package com.dbdemo.nosql.service;

import com.dbdemo.nosql.model.ApiVersion;

public interface VersionServiceNoSql {
    public ApiVersion getVersion();

    public ApiVersion saveVersion(String version);
}
