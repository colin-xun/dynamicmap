package com.example.dynamicmap.two;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TwoController
 * @Description TODO
 * @Author colin_xun@163.com
 * @Date 2019/3/21 17:18
 **/
@RestController
public class TwoController {

    @Autowired
    private AutoService autoService;

    private static boolean flg = true;

    @GetMapping("/two/change")
    public String change() throws Exception {
        if (flg) {
            autoService.addMapping();
            flg = false;
            return "add success";
        } else {
            autoService.removeMapping();
            flg = true;
            return "remove success";
        }
    }

}
