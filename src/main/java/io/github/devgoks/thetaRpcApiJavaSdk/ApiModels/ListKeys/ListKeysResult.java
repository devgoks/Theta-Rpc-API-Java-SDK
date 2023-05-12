package io.github.devgoks.thetaRpcApiJavaSdk.ApiModels.ListKeys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ListKeysResult {
    private List<String> addresses;
}
