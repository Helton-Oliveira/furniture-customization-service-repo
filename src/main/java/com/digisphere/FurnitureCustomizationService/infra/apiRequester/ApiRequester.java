package com.digisphere.FurnitureCustomizationService.infra.apiRequester;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;

import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

public class ApiRequester {

    public static String getData(String url) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        HttpResponse<String> response = null;
        try {
             response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }

        return response.body();
    }

    public static void postData(String url, Map<String, String> requestData, String endpoint) {
        WebClient webClient = WebClient.create(url);

        Mono<String> response = webClient.post()
                .uri("")
                .bodyValue(requestData)
                .retrieve()
                .bodyToMono(String.class);
    }
}
