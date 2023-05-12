package io.github.devgoks.thetaRpcApiJavaSdk.ApiModels.CallSmartContract;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CallSmartContractParam {
    @JsonProperty("sctx_bytes")
    private String sctxBytes;
}
