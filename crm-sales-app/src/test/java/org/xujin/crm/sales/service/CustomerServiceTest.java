package org.xujin.crm.sales.service;

import org.xujin.crm.sales.common.AppConstants;
import org.xujin.crm.sales.common.BizCode;
import org.xujin.crm.sales.dto.clientobject.CustomerType;
import org.xujin.halo.context.TenantContext;
import org.xujin.crm.sales.api.CustomerServiceI;
import org.xujin.crm.sales.dto.CustomerAddCmd;
import org.xujin.crm.sales.dto.clientobject.CustomerCO;
import org.xujin.halo.dto.Response;
import org.xujin.halo.exception.BasicErrorCode;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;


/**
 * For TDD development, Recommend use {@link AppTestsContainer} to make test agile
 * 
 * @author fulan.zjf 2017年10月27日 下午3:26:11
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"}) 
public class CustomerServiceTest {

    @Autowired
    private CustomerServiceI customerService;  

    @Test
    public void testCustomerAddSuccess( ) {
        //1.Prepare
    	TenantContext.set("10001", BizCode.DD);
    	CustomerAddCmd cmd = new CustomerAddCmd();
    	CustomerCO customerCO = new CustomerCO();
    	customerCO.setCustomerName("xujin");
    	customerCO.setCustomerType(CustomerType.VIP);
    	cmd.setCustomer(customerCO);

    	//2.Execute
    	Response response = customerService.addCustomer(cmd);

    	//3.Expect
        Assert.assertTrue(response.isSuccess());
    }

    @Test
    public void testCustomerAddValidationFail( ) {
        //1.Prepare
        TenantContext.set("10001", BizCode.CGS);
        CustomerAddCmd cmd = new CustomerAddCmd();
        CustomerCO customerCO = new CustomerCO();
        customerCO.setCustomerName("xujin");
        customerCO.setCustomerType(CustomerType.VIP);
        cmd.setCustomer(customerCO);

        //2.Execute
        Response response = customerService.addCustomer(cmd);

        //3.Expect
        Assert.assertFalse(response.isSuccess());
        Assert.assertEquals(response.getErrCode(), BasicErrorCode.BIZ_ERROR.getErrCode());
    }

    @Test
    public void testCustomerAddRuleVoilation( ){
        //1.Prepare
        TenantContext.set("10001", BizCode.DD);
        CustomerAddCmd cmd = new CustomerAddCmd();
        CustomerCO customerCO = new CustomerCO();
        customerCO.setCustomerName("xujin");
        customerCO.setCustomerType(CustomerType.VIP);
        customerCO.setSource(AppConstants.SOURCE_AD);
        cmd.setCustomer(customerCO);

        //2.Execute
        Response response = customerService.addCustomer(cmd);

        //3.Expect
        Assert.assertFalse(response.isSuccess());
        Assert.assertEquals(response.getErrCode(), BasicErrorCode.BIZ_ERROR.getErrCode());
    }
}
