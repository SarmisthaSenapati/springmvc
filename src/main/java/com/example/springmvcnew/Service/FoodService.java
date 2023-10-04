package com.example.springmvcnew.Service;

import com.example.springmvcnew.Food;
import org.springframework.stereotype.Service;

@Service
public class FoodService {
    public Food[]getFood(){
        Food[] foods= {new Food("pizza", 500.00),
                new Food("Dragon Fruit", 400.00),
                new Food("Chhatua", 132.00)
        };
        return foods;

    }
}
