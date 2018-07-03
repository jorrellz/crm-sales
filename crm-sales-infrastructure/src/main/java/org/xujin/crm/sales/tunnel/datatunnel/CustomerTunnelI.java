package org.xujin.crm.sales.tunnel.datatunnel;

import org.xujin.halo.repository.DataTunnel;
import org.xujin.crm.sales.tunnel.dataobject.CustomerDO;

import java.util.List;

public interface CustomerTunnelI extends DataTunnel<CustomerDO>{

    public List<CustomerDO> findByCriteria(String... params);

}
