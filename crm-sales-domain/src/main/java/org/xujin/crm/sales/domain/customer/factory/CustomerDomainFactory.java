package org.xujin.crm.sales.domain.customer.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import org.xujin.halo.domain.DomainFactoryI;
import org.xujin.crm.sales.domain.customer.entity.CustomerE;
import org.xujin.crm.sales.domain.customer.repository.ContactRepository;

@Component
public class CustomerDomainFactory implements DomainFactoryI<CustomerE>{

	@Autowired
	private ContactRepository contactRepository;

	@Override
	public CustomerE create(){
		return new CustomerE();
	}

}
