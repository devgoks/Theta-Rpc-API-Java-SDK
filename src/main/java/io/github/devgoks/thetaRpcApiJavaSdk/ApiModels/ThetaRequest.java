package io.github.devgoks.thetaRpcApiJavaSdk.ApiModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ThetaRequest<T> {
    @JsonProperty("jsonrpc")
    private String jsonRpc;

    @JsonProperty("method")
    private String method;

    @JsonProperty("params")
    private List<T> params;

    @JsonProperty("id")
    private Integer id;
}
