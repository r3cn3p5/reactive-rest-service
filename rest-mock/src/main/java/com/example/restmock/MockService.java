package com.example.restmock;

import com.github.tomakehurst.wiremock.standalone.WireMockServerRunner;

public class MockService {

    public static void main(String[] args)  {

        new WireMockServerRunner().run(args);
    }

}
