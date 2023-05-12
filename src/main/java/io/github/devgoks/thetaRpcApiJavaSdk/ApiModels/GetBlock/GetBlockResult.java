package io.github.devgoks.thetaRpcApiJavaSdk.ApiModels.GetBlock;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetBlockResult {
    @JsonProperty("chain_id")
    private String chainId;

    @JsonProperty("epoch")
    private String epoch;

    @JsonProperty("height")
    private String height;

    @JsonProperty("parent")
    private String parent;

    @JsonProperty("transactions_hash")
    private String transactionsHash;

    @JsonProperty("state_hash")
    private String stateHash;

    @JsonProperty("timestamp")
    private String timestamp;

    @JsonProperty("proposer")
    private String proposer;

    @JsonProperty("children")
    private List<String> children;

    @JsonProperty("status")
    private int status;

    @JsonProperty("hash")
    private String hash;

    @JsonProperty("transactions")
    private List<Transaction> transactions;

    @Data
    public static class Transaction {

        @JsonProperty("raw")
        private Raw raw;

        @JsonProperty("type")
        private int type;

        @JsonProperty("hash")
        private String hash;

        @Data
        public static class Raw {

            @JsonProperty("proposer")
            private Proposer proposer;

            @JsonProperty("outputs")
            private List<Output> outputs;

            @JsonProperty("block_height")
            private String blockHeight;

            @JsonProperty("fee")
            private Map<String, String> fee;

            @JsonProperty("inputs")
            private List<Input> inputs;

            @Data
            public static class Input {
                @JsonProperty("address")
                private String address;

                @JsonProperty("coins")
                private Map<String, String> coins;

                @JsonProperty("sequence")
                private String sequence;

                @JsonProperty("signature")
                private String signature;
            }

            @Data
            public static class Proposer {

                @JsonProperty("address")
                private String address;

                @JsonProperty("coins")
                private Map<String, String> coins;

                @JsonProperty("sequence")
                private String sequence;

                @JsonProperty("signature")
                private String signature;
            }

            @Data
            public static class Output {

                @JsonProperty("address")
                private String address;

                @JsonProperty("coins")
                private Map<String, String> coins;
            }
        }
    }
}
