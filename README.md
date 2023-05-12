# Theta_RPC_API_Java_SDK

### Steps to use the Theta Java SpringBoot SDK

### Add the dependency to your Pom file:
```
        <dependency>
            <groupId>io.github.devgoks</groupId>
            <artifactId>Theta_RPC_API_Java_SDK</artifactId>
            <version>1.0.0</version>
        </dependency>
```

### Sample usage in your codebase:
#### 1. GetVersion
``` 
    ThetaRequest<Object> request = new ThetaRequest<>();
    request.setJsonRpc("2.0");
    request.setMethod("theta.GetVersion");
    request.setId(1);
    request.setParams(Collections.emptyList());
    ThetaResponse<GetVersionResult> response = ThetaRPCService.request("http://localhost:16888/rpc", request, 
                new ParameterizedTypeReference<ThetaResponse<GetVersionResult>>(){});
    System.out.println(response.toString());
```
#### 2. GetAccount
``` 
    ThetaRequest<GetAccountParam> request = new ThetaRequest<>();
    request.setJsonRpc("2.0");
    request.setMethod("theta.GetAccount");
    request.setId(1);
    GetAccountParam getAccountParam = new GetAccountParam();
    getAccountParam.setAddress("0x2E833968E5bB786Ae419c4d13189fB081Cc43bab");
    request.setParams(Collections.singletonList(getAccountParam));
    ThetaResponse<GetAccountResult> response = ThetaRPCService.request("http://localhost:16888/rpc", request, 
                new ParameterizedTypeReference<ThetaResponse<GetAccountResult>>(){});
    System.out.println(response.toString());
```
#### 3. GetBlock
``` 
    ThetaRequest<GetBlockParam> request = new ThetaRequest<>();
    request.setJsonRpc("2.0");
    request.setMethod("theta.GetBlock");
    request.setId(1);
    GetBlockParam getBlockParam = new GetBlockParam();
    getBlockParam.setHash("0x9f1e77b08c9fa8984096a735d0aae6b0e43aee297e42c54ce36334103ddd67a7");
    getBlockParam.setIncludeEthTxHashes(false);
    request.setParams(Collections.singletonList(getBlockParam));
    ThetaResponse<GetBlockResult> response = ThetaRPCService.request("http://localhost:16888/rpc", request, 
                new ParameterizedTypeReference<ThetaResponse<GetBlockResult>>(){});
    System.out.println(response.toString());
```
#### 4. GetBlockByHeight
``` 
    ThetaRequest<GetBlockByHeightParam> request = new ThetaRequest<>();
    request.setJsonRpc("2.0");
    request.setMethod("theta.GetBlockByHeight");
    request.setId(1);
    GetBlockByHeightParam param = new GetBlockByHeightParam();
    param.setHeight("3");
    param.setIncludeEthTxHashes(false);
    request.setParams(Collections.singletonList(param));
    ThetaResponse<GetBlockByHeightResult> response = ThetaRPCService.request("http://localhost:16888/rpc", request, 
                new ParameterizedTypeReference<ThetaResponse<GetBlockByHeightResult>>(){});
    System.out.println(response.toString());
```
#### 5. GetTransaction
``` 
    ThetaRequest<GetTransactionParam> request = new ThetaRequest<>();
    request.setJsonRpc("2.0");
    request.setMethod("theta.GetTransaction");
    request.setId(1);
    GetTransactionParam param = new GetTransactionParam();
    param.setHash("0xf3cc94af7a1520b384999ad106ade9738b6cde66e2377ceab37067329d7173a0");
    request.setParams(Collections.singletonList(param));
    ThetaResponse<GetTransactionResult> response = ThetaRPCService.request("http://localhost:16888/rpc", request, 
                new ParameterizedTypeReference<ThetaResponse<GetTransactionResult>>(){});
    System.out.println(response.toString());
```
#### 6. GetPendingTransactions
``` 
    ThetaRequest<Object> request = new ThetaRequest<>();
    request.setJsonRpc("2.0");
    request.setMethod("theta.GetPendingTransactions");
    request.setId(1);
    request.setParams(Collections.emptyList());
    ThetaResponse<GetPendingTransactionsResult> response = ThetaRPCService.request("http://localhost:16888/rpc", request, 
                new ParameterizedTypeReference<ThetaResponse<GetPendingTransactionsResult>>(){});
    System.out.println(response.toString());
```
#### 7. BroadcastRawTransaction
``` 
    ThetaRequest<BroadcastRawTransactionParam> request = new ThetaRequest<>();
    request.setJsonRpc("2.0");
    request.setMethod("theta.BroadcastRawTransaction");
    request.setId(1);
    BroadcastRawTransactionParam param = new BroadcastRawTransactionParam();
    param.setTxBytes("02f8a4c78085e8d4a51000f86ff86d942e833968e5bb786ae419c4d13189fb081cc43babd3888ac7230489e800008901158e46f1e875100015b841c2daae6cab92e37308763664fcbe93d90219df5a3520853a9713e70e734b11f27a43db6b77da4f885213b45a294c2b4c74dc9a018d35ba93e5b9297876a293c700eae9949f1233798e905e173560071255140b4a8abd3ec6d3888ac7230489e800008901158e460913d00000");
    request.setParams(Collections.singletonList(param));
    ThetaResponse<BroadcastRawTransactionResult> response = ThetaRPCService.request("http://localhost:16888/rpc", request, 
                new ParameterizedTypeReference<ThetaResponse<BroadcastRawTransactionResult>>(){});
    System.out.println(response.toString());
```
#### 8. BroadcastRawTransactionAsync
``` 
    ThetaRequest<BroadcastRawTransactionAsyncParam> request = new ThetaRequest<>();
    request.setJsonRpc("2.0");
    request.setMethod("theta.BroadcastRawTransactionAsync");
    request.setId(1);
    BroadcastRawTransactionAsyncParam param = new BroadcastRawTransactionAsyncParam();
    param.setTxBytes("02f8a4c78085e8d4a51000f86ff86d942e833968e5bb786ae419c4d13189fb081cc43babd3888ac7230489e800008901158e46f1e875100016b841393e2eba6241482098cf11ef4dd869209d7ebd716397f3c862ca5b762bbf403006b1fa009786102383c408cabdf7450c1c73d4dd4a20d3b48a39a88ffe0ecb0e01eae9949f1233798e905e173560071255140b4a8abd3ec6d3888ac7230489e800008901158e460913d00000");
    request.setParams(Collections.singletonList(param));
    ThetaResponse<BroadcastRawTransactionAsyncResult> response = ThetaRPCService.request("http://localhost:16888/rpc", request, 
                new ParameterizedTypeReference<ThetaResponse<BroadcastRawTransactionAsyncResult>>(){});
    System.out.println(response.toString());
```
#### 9. CallSmartContract
``` 
    ThetaRequest<CallSmartContractParam> request = new ThetaRequest<>();
    request.setJsonRpc("2.0");
    request.setMethod("theta.CallSmartContract");
    request.setId(1);
    CallSmartContractParam param = new CallSmartContractParam();
    param.setSctxBytes("02f8a4c78085e8d4a51000f86ff86d942e833968e5bb786ae419c4d13189fb081cc43babd3888ac7230489e800008901158e46f1e875100016b841393e2eba6241482098cf11ef4dd869209d7ebd716397f3c862ca5b762bbf403006b1fa009786102383c408cabdf7450c1c73d4dd4a20d3b48a39a88ffe0ecb0e01eae9949f1233798e905e173560071255140b4a8abd3ec6d3888ac7230489e800008901158e460913d00000");
    request.setParams(Collections.singletonList(param));
    ThetaResponse<CallSmartContractResult> response = ThetaRPCService.request("http://localhost:16888/rpc", request, 
                new ParameterizedTypeReference<ThetaResponse<CallSmartContractResult>>(){});
    System.out.println(response.toString());
```
#### 10. NewKey
``` 
    ThetaRequest<NewKeyParam> request = new ThetaRequest<>();
    request.setJsonRpc("2.0");
    request.setMethod("thetacli.NewKey");
    request.setId(1);
    NewKeyParam param = new NewKeyParam();
    param.setPassword("qwertyuiop");
    request.setParams(Collections.singletonList(param));
    ThetaResponse<NewKeyResult> response = ThetaRPCService.request("http://localhost:16889/rpc", request,
            new ParameterizedTypeReference<ThetaResponse<NewKeyResult>>(){});
    System.out.println(response.toString());
```
