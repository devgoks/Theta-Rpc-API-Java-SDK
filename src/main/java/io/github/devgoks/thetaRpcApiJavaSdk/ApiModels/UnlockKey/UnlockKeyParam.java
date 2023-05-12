package io.github.devgoks.thetaRpcApiJavaSdk.ApiModels.UnlockKey;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UnlockKeyParam {
    private String address;
    private String password;
}
