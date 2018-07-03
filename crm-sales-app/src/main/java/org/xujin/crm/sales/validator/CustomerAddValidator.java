package org.xujin.crm.sales.validator;

import org.xujin.halo.logger.Logger;
import org.xujin.halo.logger.LoggerFactory;
import org.xujin.crm.sales.dto.CustomerAddCmd;
import org.xujin.crm.sales.validator.extensionpoint.CustomerAddValidatorExtPt;
import org.springframework.stereotype.Component;

@Component
public class CustomerAddValidator implements CustomerAddValidatorExtPt {

	private Logger logger = LoggerFactory.getLogger(CustomerAddValidator.class);
	
	@Override
	public void validate(Object candidate) {
		logger.debug("Do common validation");
		CustomerAddCmd addCmd = (CustomerAddCmd)candidate;
	}
}
