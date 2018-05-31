/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ibm.plan111mil;

import com.cloudant.client.api.ClientBuilder;
import com.cloudant.client.api.CloudantClient;
import io.github.cdimascio.dotenv.Dotenv;

/**
 *
 * @author fmgordillo
 */
public class Db {
    
    Dotenv envVar = Dotenv.load();
    
    CloudantClient client = ClientBuilder.account(envVar.get("CLOUDANT_ACCOUNT"))
                                     .username(envVar.get("CLOUDANT_USERNAME"))
                                     .password(envVar.get("CLOUDANT_PASSWORD"))
                                     .build();
    
    
}
