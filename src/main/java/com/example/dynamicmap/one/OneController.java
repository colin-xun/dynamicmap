package com.example.dynamicmap.one;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName OneController
 * @Description TODO
 * @Author colin_xun@163.com
 * @Date 2019/3/21 16:42
 **/
@RestController
public class OneController {

    @Autowired
    private MappingService mappingService;

    private static boolean flg = true;

    @GetMapping("/one/change")
    public String change() throws Exception {
        if (flg) {
            mappingService.addMapping();
            flg = false;
            return "add success";
        } else {
            mappingService.removeMapping();
            flg = true;
            return "remove success";
        }
    }
}
