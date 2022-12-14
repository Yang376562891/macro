package com.macro.ob.controller;
import com.macro.ob.pojo.FactoryInventory;
import com.macro.ob.pojo.Page;
import com.macro.ob.service.FactoryInventoryService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.Map;
@RestController
@RequestMapping("/FactoryInventorySelectController")
public class FactoryInventorySelectController {
    @Resource
    private FactoryInventoryService factoryInventoryService;
    /**
     *查询工厂库存
     */
    @RequestMapping("/FactoryInventorySelect")
    public Map<String,Object> FactoryInventorySelect(FactoryInventory factoryInventory,Page page){
        return factoryInventoryService.FactoryInventorySelect(factoryInventory,page);
    }
}
