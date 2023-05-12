package io.github.devgoks.Theta_RPC_API_Java_SDK.ApiModels.UnlockKey;

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
