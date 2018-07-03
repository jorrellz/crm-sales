package org.xujin.crm.sales.domain.customer.rule.extension;

import org.xujin.crm.sales.common.BizCode;
import org.xujin.crm.sales.domain.customer.entity.CustomerE;
import org.xujin.crm.sales.domain.customer.rule.extensionpoint.CustomerRuleExtPt;
import org.xujin.crm.sales.domain.customer.valueobject.SourceType;
import org.xujin.halo.exception.BizException;
import org.xujin.halo.extension.Extension;

/**
 * CustomerDDRuleExt
 *
 * @author xujin
 * @date 2018-01-07 12:10 PM
 */
@Extension(bizCode = BizCode.DD)
public class CustomerDDRuleExt implements CustomerRuleExtPt {

    @Override
    public boolean addCustomerCheck(CustomerE customerEntity) {
        if(SourceType.AD == customerEntity.getSourceType()){
            throw new BizException("Sorry, Customer from advertisement can not be added in this period");
        }
        return true;
    }
}
