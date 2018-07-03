package org.xujin.crm.sales.domain.customer.rule.extensionpoint;

import org.xujin.halo.extension.ExtensionPointI;
import org.xujin.halo.rule.RuleI;
import org.xujin.crm.sales.domain.customer.entity.CustomerE;

/**
 * CustomerRuleExtPt
 *
 * @author xujin
 * @date 2018-01-07 12:03 PM
 */
public interface CustomerRuleExtPt extends RuleI, ExtensionPointI{

	//Different business check for different biz
	public boolean addCustomerCheck(CustomerE customerE);

	//Different upgrade policy for different biz
	default public void customerUpgradePolicy(CustomerE customerE){
		//Nothing special
	}
}