package io.github.devgoks.thetaRpcApiJavaSdk.ApiModels.BroadcastRawTransaction;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BroadcastRawTransactionResult {
    @JsonProperty("hash")
    private String hash;

    @JsonProperty("block")
    private Block block;

    @Data
    public static class Block {
        @JsonProperty("ChainID")
        private String chainID;

        @JsonProperty("Epoch")
        private int epoch;

        @JsonProperty("Height")
        private int height;

        @JsonProperty("Parent")
        private String parent;

        @JsonProperty("HCC")
        private HCC hcc;

        @JsonProperty("TxHash")
        private String txHash;

        @JsonProperty("ReceiptHash")
        private String receiptHash;

        @JsonProperty("Bloom")
        private String bloom;

        @JsonProperty("StateHash")
        private String stateHash;

        @JsonProperty("Timestamp")
        private long timestamp;

        @JsonProperty("Proposer")
        private String proposer;

        @JsonProperty("Signature")
        private String signature;

        @Data
        public static class HCC {
            @JsonProperty("Votes")
            private Object votes;

            @JsonProperty("BlockHash")
            private String blockHash;
        }
    }
}
