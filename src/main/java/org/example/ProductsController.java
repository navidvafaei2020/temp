package org.example;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductsController {

    @GetMapping
    public String getProduct(){
        return "Http get handled!!!";
    }

    @PostMapping
    public String createNewProduct(){
        return "Http post handled";
    }

    @PutMapping
    public String editProduct(){
        return "Http Put handled";
    }

    @DeleteMapping
    public String deleteMapping(){
        return "Http Delete hanfled";
    }

}
