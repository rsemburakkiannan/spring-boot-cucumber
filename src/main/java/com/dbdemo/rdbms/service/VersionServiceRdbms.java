package com.dbdemo.rdbms.service;

import com.dbdemo.rdbms.model.ApiVersion;

public interface VersionServiceRdbms {
    public ApiVersion getVersion();

    public ApiVersion saveVersion(String version);
}
