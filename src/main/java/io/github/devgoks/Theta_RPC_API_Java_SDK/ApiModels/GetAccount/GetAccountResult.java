package io.github.devgoks.Theta_RPC_API_Java_SDK.ApiModels.GetAccount;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAccountResult {
    @JsonProperty("sequence")
    private String sequence;

    @JsonProperty("coins")
    private Map<String, String> coins;

    @JsonProperty("reserved_funds")
    private List<String> reservedFunds;

    @JsonProperty("last_updated_block_height")
    private String lastUpdatedBlockHeight;

    @JsonProperty("root")
    private String root;

    @JsonProperty("code")
    private String code;
}
