package cn.zzstc.dastabase.service.impl;

import cn.zzstc.dastabase.dao.DeviceDao;
import cn.zzstc.dastabase.entity.Device;
import cn.zzstc.dastabase.service.DeviceService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;


/**
 * <p>
 * 
 * </p>
 *
 * @author youyp
 * @since 2018-09-21
 */
@Service
public class DeviceServiceImpl extends ServiceImpl<DeviceDao, Device> implements DeviceService {

     /*@Override
     public PageUtils queryPage(Map<String, Object> params) {
         Page<Device>  page = this.selectPage(
              new Query<Device>(params).getPage(),
              new EntityWrapper<Device>()
             );
         return new PageUtils(page);
     }*/

}
