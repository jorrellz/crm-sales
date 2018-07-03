package org.xujin.crm.sales.api;

import org.xujin.crm.sales.dto.CustomerCheckConflictCmd;
import org.xujin.halo.dto.MultiResponse;
import org.xujin.halo.dto.Response;
import org.xujin.crm.sales.dto.CustomerAddCmd;
import org.xujin.crm.sales.dto.CustomerFindByCriteriaQry;
import org.xujin.crm.sales.dto.clientobject.CustomerCO;

public interface CustomerServiceI {

    public Response addCustomer(CustomerAddCmd customerAddCmd);
    
    public MultiResponse<CustomerCO> checkConflict(CustomerCheckConflictCmd customerCheckConflictCmd);
    
    public MultiResponse<CustomerCO> findByCriteria(CustomerFindByCriteriaQry CustomerFindByCriteriaQry);
}
