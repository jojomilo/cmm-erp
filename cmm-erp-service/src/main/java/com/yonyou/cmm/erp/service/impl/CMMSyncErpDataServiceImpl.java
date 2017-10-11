package com.yonyou.cmm.erp.service.impl;

import com.yonyou.cmm.erp.api.ICMMSyncErpDataService;
import net.sf.json.JSONArray;
import org.springframework.stereotype.Service;

/**
 * Created by suny on 28/03/2017.
 */
@Service(value = "cmmsyncdataservice")
public class CMMSyncErpDataServiceImpl implements ICMMSyncErpDataService {
    @Override
    public JSONArray syncDataFromErp() {
        return null;
    }
}
