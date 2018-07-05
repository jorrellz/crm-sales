package org.xujin.crm.sales.validator.extension;

import org.xujin.crm.sales.common.BizCode;
import org.xujin.halo.exception.BizException;
import org.xujin.halo.extension.Extension;
import org.xujin.halo.logger.Logger;
import org.xujin.halo.logger.LoggerFactory;
import org.xujin.halo.validator.ValidatorCompoiste;
import org.xujin.crm.sales.dto.CustomerAddCmd;
import org.xujin.crm.sales.dto.clientobject.CustomerType;
import org.xujin.crm.sales.validator.CustomerAddValidator;
import org.xujin.crm.sales.validator.extensionpoint.CustomerAddValidatorExtPt;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * CustomerAddCGSValidator
 * 
 * @author xujin 2017-11-04
 */
@Extension(bizCode = BizCode.CGS)
public class CustomerAddCGSValidator extends ValidatorCompoiste implements CustomerAddValidatorExtPt {

	private Logger logger = LoggerFactory.getLogger(CustomerAddCGSValidator.class);
	
    @Autowired
    private CustomerAddValidator customerAddValidator;

    @Override
    protected void addOtherValidators() {
        add(customerAddValidator);
    }

    @Override
    protected void doValidate(Object candidate) {
    	logger.debug("This is CGS validation");
        CustomerAddCmd addCustomerCmd = (CustomerAddCmd) candidate;
        //For CGS BIZ CustomerTYpe could not be VIP
        if(CustomerType.VIP == addCustomerCmd.getCustomer().getCustomerType())
        {
            throw new BizException("VIP Customer can not be added by CGS");
        }

    }

}
