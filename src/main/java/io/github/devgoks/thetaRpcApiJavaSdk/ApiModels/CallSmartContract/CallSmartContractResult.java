package io.github.devgoks.thetaRpcApiJavaSdk.ApiModels.CallSmartContract;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CallSmartContractResult {
    @JsonProperty("vm_return")
    private String vmReturn;
    @JsonProperty("contract_address")
    private String contractAddress;
    @JsonProperty("gas_used")
    private String gasUsed;
    @JsonProperty("vm_error")
    private String vmError;
}
