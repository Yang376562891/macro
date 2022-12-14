package com.macro.ob.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.macro.ob.pojo.FactoryInventory;
import com.macro.ob.pojo.Page;
import org.apache.ibatis.annotations.Mapper;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;


/**
* @author 周学林
* @description 针对表【factory_inventory(工厂库存表)】的数据库操作Mapper
* @createDate 2022-09-02 16:47:30
* @Entity com.macro.ob.pojo.FactoryInventory
*/
/**
 *工厂库存列表查询
 */
@Mapper
public interface FactoryInventoryMapper extends BaseMapper<FactoryInventory> {
      List<FactoryInventory> FactoryInventorySelect(FactoryInventory factoryInventory);

}
