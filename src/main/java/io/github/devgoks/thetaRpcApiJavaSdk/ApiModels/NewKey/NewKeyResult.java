package io.github.devgoks.thetaRpcApiJavaSdk.ApiModels.NewKey;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NewKeyResult {
    @JsonProperty("address")
    private String address;
}
