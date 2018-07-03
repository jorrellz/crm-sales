package org.xujin.crm.sales.interceptor;

import org.xujin.halo.command.CommandInterceptorI;
import org.xujin.halo.command.PostInterceptor;
import org.xujin.halo.dto.Command;
import org.xujin.halo.dto.Response;
import org.xujin.halo.logger.Logger;
import org.xujin.halo.logger.LoggerFactory;

@PostInterceptor
public class LoggerPostInterceptor implements CommandInterceptorI{
    
    Logger logger = LoggerFactory.getLogger(LoggerPostInterceptor.class);
    
    @Override
    public void postIntercept(Command command, Response response) {
        logger.debug("Finished processing "+ command.getClass()+" Response:"+response);
    }

}