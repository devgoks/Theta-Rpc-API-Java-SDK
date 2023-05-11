package io.github.devgoks.Theta_RPC_API_Java_SDK.ApiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ThetaResponse<T> {
    @JsonProperty("jsonrpc")
    private String jsonRpc;

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("result")
    private T result;
}
