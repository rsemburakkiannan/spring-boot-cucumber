Feature: the version can be retrieved

  Scenario: client makes call to GET /nosql/version
    When the client calls /nosql/version
    Then the client receives nosql version status code of 200
		And the client receives nosql server version 2.0