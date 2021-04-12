Feature: the RDBMS version can be retrieved

  Scenario: client makes call to GET /rdbms/version
    When the client calls /rdbms/version
    Then the client receives status code of 200
		And the client receives server version 1.0