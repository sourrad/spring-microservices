package ma.sourrad.ms.productservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/product")
public class ProductController {
    @GetMapping("/info")
    public String getInfo() {
        return "Fetching productservice information";
    }
}
