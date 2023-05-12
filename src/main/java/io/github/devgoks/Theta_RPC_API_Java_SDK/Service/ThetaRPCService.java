package io.github.devgoks.Theta_RPC_API_Java_SDK.Service;

import io.github.devgoks.Theta_RPC_API_Java_SDK.ApiModels.ThetaRequest;
import io.github.devgoks.Theta_RPC_API_Java_SDK.ApiModels.ThetaResponse;
import io.github.devgoks.Theta_RPC_API_Java_SDK.RestClient.ThetaSdkRestClient;
import org.springframework.core.ParameterizedTypeReference;

public class ThetaRPCService {
    private static final ThetaSdkRestClient thetaSdkRestClient = new ThetaSdkRestClient();

    public static <T> ThetaResponse<T> request(String rpcApiUrl, ThetaRequest<?> request,
                                               ParameterizedTypeReference<ThetaResponse<T>> responseType) {
        ThetaResponse<T> response = thetaSdkRestClient.post(rpcApiUrl, request, responseType);
        return response;
    }
}
