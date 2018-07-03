package org.xujin.crm.sales.assembler;

import org.xujin.crm.sales.dto.clientobject.CustomerCO;
import org.xujin.halo.assembler.AssemblerI;

import java.util.HashMap;
import java.util.Map;

public class CustomerAssembler implements AssemblerI{

	public Map<String, String> assembleQueryParam(CustomerCO customerCO) {
		
		return new HashMap<>();
	}
}
