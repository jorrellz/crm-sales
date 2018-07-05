package org.xujin.crm.sales.command.extension;

import org.xujin.crm.sales.command.extensionpoint.CustomerCheckConflictSearchConditionExtPt;
import org.xujin.crm.sales.common.BizCode;
import org.xujin.halo.extension.Extension;

@Extension
public class CustomerSearchConditionExt implements CustomerCheckConflictSearchConditionExtPt {

    @Override
    public String getSearchCondition(String condition) {
        return "default Search Condition";
    }

}
