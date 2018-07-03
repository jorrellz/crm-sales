package org.xujin.crm.sales.command.extension;

import org.xujin.crm.sales.command.extensionpoint.CustomerCheckConflictSearchConditionExtPt;
import org.xujin.crm.sales.common.BizCode;
import org.xujin.halo.extension.Extension;

@Extension(bizCode = BizCode.CGS)
public class CustomerSearchConditionCGSExt implements CustomerCheckConflictSearchConditionExtPt {

    @Override
    public String getSearchCondition(String condition) {
        return "CGS Search Condition";
    }

}
