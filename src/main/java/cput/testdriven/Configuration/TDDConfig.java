/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cput.testdriven.Configuration;

import cput.testdriven.Service.Impl.TDDServiceImpl;
import cput.testdriven.Service.TDDService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Khanya
 */
@Configuration
public class TDDConfig {
    
@Bean(name = " getService ")
public TDDService getService(){
    return new TDDServiceImpl();
}

}
