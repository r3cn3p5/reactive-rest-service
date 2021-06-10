package com.example.restmock;

import com.github.tomakehurst.wiremock.client.WireMock;

public class MockSetupClient {

    public static void main(String[] args)  {
        WireMock wireMock = WireMock.create()
                .scheme("http")
                .host("127.0.0.1")
                .port(8080)
                .build();

        // The root directory of the WireMock project, under which the mappings and __files directories should be found
        wireMock.loadMappingsFrom("/wiremock-stuff");
    }

}
