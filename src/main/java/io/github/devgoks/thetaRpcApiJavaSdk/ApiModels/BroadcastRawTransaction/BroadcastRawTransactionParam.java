package io.github.devgoks.thetaRpcApiJavaSdk.ApiModels.BroadcastRawTransaction;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BroadcastRawTransactionParam {
    @JsonProperty("tx_bytes")
    private String txBytes;
}
