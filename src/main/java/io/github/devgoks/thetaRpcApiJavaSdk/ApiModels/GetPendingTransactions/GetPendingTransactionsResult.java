package io.github.devgoks.thetaRpcApiJavaSdk.ApiModels.GetPendingTransactions;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetPendingTransactionsResult {
    @JsonProperty("tx_hashes")
    private List<String> txHashes;
}
