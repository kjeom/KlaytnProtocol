/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package org.web3j.klaytnprotocol;

import org.junit.Test;
import org.web3j.protocol.core.methods.response.EthChainId;
import org.web3j.protocol.core.methods.response.NetVersion;
import org.web3j.protocol.http.HttpService;
import org.web3j.protocol.Web3j;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Map;

import caver.sdk.apis.KlayApi;
import caver.sdk.models.GetRewardsResponse;
import opensdk.sdk.models.GovernanceChainConfigResponse;

public class Web3jTest {
    @Test public void testSomeLibraryMethod() throws IOException {
        Web3j w3 = Web3j.build(new HttpService("http://127.0.0.1:8551"));
        NetVersion nv = w3.netVersion().send();
        System.out.println(nv.getResult());
    }

    @Test public void testSomeLibraryMethod2() throws IOException {
        KlayApi klaytnWeb3j = new KlayApi(new HttpService("http://127.0.0.1:8551"));
        GetRewardsResponse nv = klaytnWeb3j.getRewards(new BigDecimal(10)).send();
        System.out.println(nv.getResult());
    } 

    @Test public void testSomeLibraryMethod3() throws IOException {
        KlaytnWeb3j kw3 = KlaytnWeb3j.build(new HttpService("http://127.0.0.1:8551"));
        GovernanceChainConfigResponse response =  kw3.governance.chainConfig().send();
        Object cc = response.getResult();
        System.out.println(cc);
    }

    @Test public void testSomeLibraryMethod4() throws IOException {
        KlaytnWeb3j kw3 = KlaytnWeb3j.build(new HttpService("http://127.0.0.1:8551"));
        EthChainId chainId = kw3.ethChainId().send();
        String sChainId = chainId.getResult();
        System.out.println(sChainId);
    }
}
