package cn.zzstc.dastabase.controller;



import cn.zzstc.dastabase.entity.Device;
import cn.zzstc.dastabase.service.DeviceService;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 * 
 * </p>
 *
 * @author youyp
 * @since 2018-09-21
 */
@RestController
@Slf4j
public class DeviceController {

    @Autowired
    DeviceService deviceService;


    @PostMapping("/v1/device/auth")
    public Device deviceAuth(Integer Type, String SCode, String  DeviceID, String ReaderNo, Integer ActIndex) throws Exception {
        Device device = deviceService.selectOne(new EntityWrapper<Device>()
                .eq("mac_address", DeviceID));

        return device;
    }

    @PostMapping("/v1/device/qrc")
    public JSONObject qrcData(HttpServletRequest request) {

        return null;
    }

/*
    @GetMapping("/v1/device")
    public PageUtils pages(@RequestParam Map<String,Object> params){
        PageUtils page = deviceService.queryPage(params);
        return page;
    }

    @GetMapping("/v1/device/{id}")
    public Device getById(@PathVariable Integer id) {
        Device device = deviceService.selectById(id);
        return device;
    }

    @PostMapping("/v1/device")
    public Result save(@RequestBody Device device) {
        boolean flag = deviceService.insert(device);
        return Result.save(flag);
    }

    @PutMapping("/v1/device")
    public Result update(@RequestBody Device  device) {
        boolean flag = deviceService.updateById(device);
        return Result.update(flag);
    }

    @DeleteMapping("/v1/device/{id}")
    public Result delete(@PathVariable(name = "id") Integer id) {
        boolean flag = deviceService.deleteById(id);
        return Result.delete(flag);
    }*/
}


