package io.github.devgoks.thetaRpcApiJavaSdk.ApiModels.GetVersion;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetVersionResult {
    @JsonProperty("version")
    private String version;

    @JsonProperty("git_hash")
    private String gitHash;

    @JsonProperty("timestamp")
    private String timestamp;
}
