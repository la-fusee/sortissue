package com.example

import io.micronaut.http.HttpRequest
import io.micronaut.http.client.HttpClient
import io.micronaut.http.client.annotation.Client
import io.micronaut.runtime.EmbeddedApplication
import io.micronaut.test.extensions.spock.annotation.MicronautTest
import spock.lang.Specification
import jakarta.inject.Inject

@MicronautTest
class SortissueSpec extends Specification {

    @Inject
    @Client("/")
    HttpClient client;


    void 'test it works'() {
        given:
        HttpRequest<Table1Record> request = HttpRequest.GET("/table1");
        String body = client.toBlocking().retrieve(request);


        expect:
        assertNotNull(body);
        assertEquals("Hello World", body);
    }

}
