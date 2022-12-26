package com.example.nicholai518.nasdaqpricedisplay;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PriceController {

    @RequestMapping("/displayPrice")
    public String displayPrice(){
        return "Nasdaq Price: $61.28";
    }
}
