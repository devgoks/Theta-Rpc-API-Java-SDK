package io.github.devgoks.thetaRpcApiJavaSdk.ApiModels.GetBlock;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetBlockParam {
    private String hash;
    @JsonProperty("include_eth_tx_hashes")
    private Boolean includeEthTxHashes;
}
