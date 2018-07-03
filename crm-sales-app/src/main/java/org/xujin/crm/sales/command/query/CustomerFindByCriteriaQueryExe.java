package org.xujin.crm.sales.command.query;

import org.xujin.halo.command.Command;
import org.xujin.halo.command.QueryExecutorI;
import org.xujin.halo.dto.MultiResponse;
import org.xujin.crm.sales.domain.customer.convertor.CustomerConvertor;
import org.xujin.crm.sales.domain.customer.entity.CustomerE;
import org.xujin.crm.sales.domain.customer.repository.CustomerRepository;
import org.xujin.crm.sales.dto.CustomerFindByCriteriaQry;
import org.xujin.crm.sales.dto.clientobject.CustomerCO;
import org.xujin.crm.sales.tunnel.dataobject.CustomerDO;
import org.xujin.crm.sales.tunnel.datatunnel.CustomerTunnelI;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Command
public class CustomerFindByCriteriaQueryExe implements QueryExecutorI<MultiResponse<CustomerCO>, CustomerFindByCriteriaQry> {

    @Autowired
    CustomerTunnelI customerDBTunnel;

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CustomerConvertor customerConvertor;

    @Override
    public MultiResponse<CustomerCO> execute(CustomerFindByCriteriaQry cmd) {
        List<CustomerE> customerEList = customerRepository.findByCriteria("");
        List<CustomerCO> customerCos = new ArrayList<>();
        for(CustomerE entity:customerEList ) {
            customerCos.add(customerConvertor.entityToClient(entity));
        }
        return MultiResponse.of(customerCos, customerCos.size());
    }


    public CustomerDO get(String id) {
        CustomerDO customerDO = customerDBTunnel.get("123");
        customerDO.setCompanyType("IMPORTANT");
        customerDO.setCompanyName("jkys");
        return customerDO;
    }
}
