package com.misiontic.product_ms.controllers;

import com.misiontic.product_ms.repositories.ProductRepository;
import com.misiontic.product_ms.exceptions.ProductNotFoundException;
import com.misiontic.product_ms.models.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;

        //Seed Products
        Product newProduct1 = new Product("001", "001" ,"Gordo MoiBurger", "La especialidad de la casa", 23000, "https://images.pexels.com/photos/1199957/pexels-photo-1199957.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500");
        Product newProduct2 = new Product("002", "001" ,"Cangreburger", "Vivi en un pinia debajo del mar", 40000, "https://images.pexels.com/photos/2702674/pexels-photo-2702674.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500");
        Product newProduct3 = new Product("003", "001","La tapa vena", "Gran cantidad de grasa", 12000, "https://images.pexels.com/photos/2983099/pexels-photo-2983099.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500");
        Product newProduct4 = new Product("004", "002","Whazaa Negro", "Plato extragrande", 23000, "https://images.pexels.com/photos/6347/coffee-cup-working-happy.jpg?auto=compress&cs=tinysrgb&dpr=1&w=500");
        Product newProduct5 = new Product("005", "002","Periquito pesado", "Cafe con leche y hierba buena", 8000, "https://images.pexels.com/photos/312418/pexels-photo-312418.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500");
        Product newProduct6 = new Product("006", "002","Juan Caldez", "Cafe tinto", 2500, "https://images.pexels.com/photos/1235706/pexels-photo-1235706.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500");
        Product newProduct7 = new Product("007", "003","El pollo felipe", "Ocho de 10", 19000, "https://images.pexels.com/photos/323682/pexels-photo-323682.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500");
        Product newProduct8 = new Product("008", "003","Pollomon", "Rico saboro delicioso", 33000, "https://images.pexels.com/photos/60616/fried-chicken-chicken-fried-crunchy-60616.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500");
        Product newProduct9 = new Product("009", "003","Alitas de Jonny Cage", "Ya cayo", 65500, "https://images.pexels.com/photos/6941026/pexels-photo-6941026.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500");
        Product newProduct10 = new Product("010", "004","Naruto-kun", "Sasukekun con salsa de sakura", 35800, "https://images.pexels.com/photos/4725630/pexels-photo-4725630.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500");
        Product newProduct11 = new Product("011", "004","Pescado blanco", "Pesco oscuro", 17960, "https://images.pexels.com/photos/6388704/pexels-photo-6388704.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500");
        Product newProduct12 = new Product("012","004" ,"Animex", "Sensacion multiple sabor", 39875, "https://images.pexels.com/photos/6310247/pexels-photo-6310247.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500");
        Product newProduct13 = new Product("013", "004","El pez kuezo", "Rico pez con cuello teso", 34000, "https://images.pexels.com/photos/6531103/pexels-photo-6531103.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500");

        this.productRepository.save(newProduct1);
        this.productRepository.save(newProduct2);
        this.productRepository.save(newProduct3);
        this.productRepository.save(newProduct4);
        this.productRepository.save(newProduct5);
        this.productRepository.save(newProduct6);
        this.productRepository.save(newProduct7);
        this.productRepository.save(newProduct8);
        this.productRepository.save(newProduct9);
        this.productRepository.save(newProduct10);
        this.productRepository.save(newProduct11);
        this.productRepository.save(newProduct12);
        this.productRepository.save(newProduct13);

    }

    @GetMapping("/products/{storeId}")
    List<Product> getProductsByStoreId(@PathVariable String storeId){
        return productRepository.findProductsByStoreId(storeId);

    }

    @GetMapping("/products")
    List<Product> getProducts(){
        return productRepository.findAll();
    }
}
