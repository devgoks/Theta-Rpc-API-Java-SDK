package io.github.devgoks.Theta_RPC_API_Java_SDK.RestClient;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

public class ThetaSdkRestClient {
    private static final RestTemplate restTemplate = new RestTemplate();

    public <T> T post(String url, Object requestObject, ParameterizedTypeReference<T> responseType) {
        HttpHeaders headers = getHeaders();
        HttpEntity<Object> entity = new HttpEntity<>(requestObject, headers);
        ResponseEntity<T> responseEntity = restTemplate.exchange(url, HttpMethod.POST, entity, responseType);
        return responseEntity.getBody();
    }

    private HttpHeaders getHeaders(){
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return headers;
    }
}
