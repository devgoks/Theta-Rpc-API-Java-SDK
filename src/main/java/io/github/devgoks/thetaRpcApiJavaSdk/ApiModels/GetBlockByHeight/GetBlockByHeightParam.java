package io.github.devgoks.thetaRpcApiJavaSdk.ApiModels.GetBlockByHeight;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetBlockByHeightParam {
    private String height;
    @JsonProperty("include_eth_tx_hashes")
    private Boolean includeEthTxHashes;
}
