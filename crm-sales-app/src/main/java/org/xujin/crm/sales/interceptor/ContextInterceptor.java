package org.xujin.crm.sales.interceptor;

import org.xujin.halo.command.CommandInterceptorI;
import org.xujin.halo.command.PreInterceptor;
import org.xujin.halo.dto.Command;

@PreInterceptor
public class ContextInterceptor implements CommandInterceptorI{

    @Override
    public void preIntercept(Command command) {
        //Set Tenant Context here
        //TenantContext.set("1", "CGS");
    }

}
