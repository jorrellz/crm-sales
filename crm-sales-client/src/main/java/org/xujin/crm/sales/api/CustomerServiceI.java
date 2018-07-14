package org.xujin.crm.sales.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.xujin.crm.sales.dto.CustomerCheckConflictCmd;
import org.xujin.halo.dto.MultiResponse;
import org.xujin.halo.dto.Response;
import org.xujin.crm.sales.dto.CustomerAddCmd;
import org.xujin.crm.sales.dto.CustomerFindByCriteriaQry;
import org.xujin.crm.sales.dto.clientobject.CustomerCO;

@FeignClient("crm-sales-provider")
public interface CustomerServiceI {

    @GetMapping("/add")
    public Response addCustomer(CustomerAddCmd customerAddCmd);

    @GetMapping("/checkConflict")
    public MultiResponse<CustomerCO> checkConflict(CustomerCheckConflictCmd customerCheckConflictCmd);

    @GetMapping("/list")
    public MultiResponse<CustomerCO> findByCriteria(CustomerFindByCriteriaQry CustomerFindByCriteriaQry);


}