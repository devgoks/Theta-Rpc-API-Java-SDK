package io.github.devgoks.thetaRpcApiJavaSdk.Service;

import io.github.devgoks.thetaRpcApiJavaSdk.ApiModels.ThetaRequest;
import io.github.devgoks.thetaRpcApiJavaSdk.ApiModels.ThetaResponse;
import io.github.devgoks.thetaRpcApiJavaSdk.RestClient.ThetaSdkRestClient;
import org.springframework.core.ParameterizedTypeReference;

public class ThetaRPCService {
    private static final ThetaSdkRestClient thetaSdkRestClient = new ThetaSdkRestClient();

    public static <T> ThetaResponse<T> request(String rpcApiUrl, ThetaRequest<?> request,
                                               ParameterizedTypeReference<ThetaResponse<T>> responseType) {
        ThetaResponse<T> response = thetaSdkRestClient.post(rpcApiUrl, request, responseType);
        return response;
    }
}
