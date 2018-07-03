package org.xujin.crm.sales.dto;

import org.xujin.crm.sales.dto.clientobject.CustomerCO;
import org.xujin.halo.dto.Command;
import lombok.Data;

@Data
public class CustomerAddCmd extends Command{

    private CustomerCO customer;
    
}
