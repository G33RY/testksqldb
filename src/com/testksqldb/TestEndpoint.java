package com.testksqldb;

import io.confluent.ksql.api.client.Client;
import io.confluent.ksql.api.client.ClientOptions;
import io.confluent.ksql.api.client.Row;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;

@Path("/")
public class TestEndpoint {
    @GET
    @Path("/")
    public String test() throws ExecutionException, InterruptedException {
        Client client = Client.create(ClientOptions.create()
                .setHost("localhost")
                .setPort(8088));

        HashMap<String, Object> props = new HashMap<>();

        String sql = "SELECT * FROM SomeTable;";

        List<Row> rows = client.executeQuery(sql, props).get();

        for(Row row : rows) {
            System.out.println(row);
        }

        client.close();

        return "Hello World!";
    }
}
