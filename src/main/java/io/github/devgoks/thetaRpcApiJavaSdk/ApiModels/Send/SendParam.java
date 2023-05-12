package io.github.devgoks.thetaRpcApiJavaSdk.ApiModels.Send;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SendParam {
    @JsonProperty("chain_id")
    private String chainId;

    @JsonProperty("from")
    private String from;

    @JsonProperty("to")
    private String to;

    @JsonProperty("thetawei")
    private String thetaWei;

    @JsonProperty("tfuelwei")
    private String tFuelWei;

    @JsonProperty("fee")
    private String fee;

    @JsonProperty("sequence")
    private String sequence;

    @JsonProperty("async")
    private boolean async;
}
