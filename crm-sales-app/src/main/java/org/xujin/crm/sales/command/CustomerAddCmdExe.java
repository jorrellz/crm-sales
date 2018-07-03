package org.xujin.crm.sales.command;

import org.xujin.halo.command.Command;
import org.xujin.halo.command.CommandExecutorI;
import org.xujin.halo.dto.Response;
import org.xujin.halo.extension.ExtensionExecutor;
import org.xujin.halo.validator.ValidatorExecutor;
import org.xujin.crm.sales.domain.customer.convertor.extensionpoint.CustomerConvertorExtPt;
import org.xujin.crm.sales.domain.customer.entity.CustomerE;
import org.xujin.crm.sales.dto.CustomerAddCmd;
import org.xujin.crm.sales.validator.extensionpoint.CustomerAddValidatorExtPt;
import org.springframework.beans.factory.annotation.Autowired;

@Command
public class CustomerAddCmdExe implements CommandExecutorI<Response, CustomerAddCmd>{

    @Autowired
    private ValidatorExecutor  validatorExecutor;

    @Autowired
    private ExtensionExecutor extensionExecutor;

    @Override
    public Response execute(CustomerAddCmd cmd) {
        //1, validation
    	validatorExecutor.validate(CustomerAddValidatorExtPt.class, cmd);
    	
        //2, invoke domain service or directly operate domain to do business logic process
        CustomerE customerEntity = extensionExecutor.execute(CustomerConvertorExtPt.class, extension -> extension.clientToEntity(cmd.getCustomer()));
        customerEntity.addNewCustomer();

        //3, notify by sending message out
        return Response.buildSuccess();
    }

}
