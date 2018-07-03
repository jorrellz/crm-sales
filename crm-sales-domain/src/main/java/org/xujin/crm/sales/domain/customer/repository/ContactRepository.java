package org.xujin.crm.sales.domain.customer.repository;

import org.xujin.halo.context.TenantContext;
import org.xujin.halo.repository.RepositoryI;
import org.xujin.crm.sales.domain.customer.entity.ContactE;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public class ContactRepository implements RepositoryI {

	public Set<ContactE> queryContactByGlobalId(String globalId, String type){
		TenantContext.getTenantId();
		TenantContext.getBizCode();
		return null;
	}

}
