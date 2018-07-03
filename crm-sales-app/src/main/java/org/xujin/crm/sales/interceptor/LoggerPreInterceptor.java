package org.xujin.crm.sales.interceptor;

import org.xujin.halo.command.CommandInterceptorI;
import org.xujin.halo.command.PreInterceptor;
import org.xujin.halo.dto.Command;
import org.xujin.halo.logger.Logger;
import org.xujin.halo.logger.LoggerFactory;

@PreInterceptor
public class LoggerPreInterceptor implements CommandInterceptorI{
    
    Logger logger = LoggerFactory.getLogger(LoggerPreInterceptor.class);
    
    @Override
    public void preIntercept(Command command) {
        logger.debug("Begin to process "+ command);
    }

}
