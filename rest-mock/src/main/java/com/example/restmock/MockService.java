package com.example.restmock;

import com.github.tomakehurst.wiremock.client.WireMock;

public class MockService {

    public static void main(String[] args) {

        WireMock wireMock1 = new WireMock("1st.remote.host", 8089);
    }


}
