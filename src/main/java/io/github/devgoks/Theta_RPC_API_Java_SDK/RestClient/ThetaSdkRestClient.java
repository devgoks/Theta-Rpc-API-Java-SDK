package io.github.devgoks.Theta_RPC_API_Java_SDK.RestClient;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
@Component
public class ThetaSdkRestClient {
    private static final RestTemplate restTemplate = new RestTemplate();

    public <T> T post(String url, Object requestObject, Class<T> responseType) {
        HttpHeaders headers = getHeaders();
        HttpEntity<Object> entity = new HttpEntity<>(requestObject, headers);
        ResponseEntity<T> responseEntity = restTemplate.postForEntity(url, entity, responseType);
        return responseEntity.getBody();
    }

    private HttpHeaders getHeaders(){
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return headers;
    }
}
