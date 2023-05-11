package io.github.devgoks.Theta_RPC_API_Java_SDK.ApiModels.GetTransaction;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetTransactionResult {
    @JsonProperty("block_hash")
    private String blockHash;

    @JsonProperty("block_height")
    private String blockHeight;

    @JsonProperty("status")
    private String status;

    @JsonProperty("hash")
    private String hash;

    @JsonProperty("transaction")
    private Transaction transaction;

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
