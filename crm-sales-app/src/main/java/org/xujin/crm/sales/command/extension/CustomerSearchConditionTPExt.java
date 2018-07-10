package org.xujin.crm.sales.command.extension;

import org.xujin.crm.sales.common.BizCode;
import org.xujin.halo.annotation.extension.Extension;
import org.xujin.crm.sales.command.extensionpoint.CustomerCheckConflictSearchConditionExtPt;

@Extension(bizCode = BizCode.TP)
public class CustomerSearchConditionTPExt implements CustomerCheckConflictSearchConditionExtPt {

    @Override
    public String getSearchCondition(String condition) {
        return "Trust Pass Search Condition";
    }

}
