package com.macro.ob.service;

import com.macro.ob.pojo.FactoryInventory;
import com.macro.ob.pojo.Page;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
* @author 周学林
* @description 针对表【factory_inventory(工厂库存表)】的数据库操作Service
* @createDate 2022-09-02 16:47:30
*/
@Service
public interface FactoryInventoryService {
    Map<String,Object> FactoryInventorySelect(FactoryInventory fa, Page page);
}
