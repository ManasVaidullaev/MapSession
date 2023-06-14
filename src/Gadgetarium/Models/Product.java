package Gadgetarium.Models;

import Gadgetarium.Models.Enums.Category;
import Gadgetarium.Models.Enums.KeyCharacter;

import java.util.List;
import java.util.Map;

public class Product {
    private Long id;
    private Category category;
    private String name;
    private  List<Map<KeyCharacter,String>> character;
    private int price;

    public Product(Long id, Category category, String name, List<Map<KeyCharacter, String>> character, int price) {
        this.id = id;
        this.category = category;
        this.name = name;
        this.character = character;
        this.price = price;
    }

    public Product(Long id, Category category, String name, int price) {
        this.id = id;
        this.category = category;
        this.name = name;
        this.price = price;
    }

    public Product() {
    }

    public Product(Category category, String name, List<Map<KeyCharacter, String>> character, int price) {
        this.category = category;
        this.name = name;
        this.character = character;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Map<KeyCharacter, String>> getCharacter() {
        return character;
    }

    public void setCharacter(List<Map<KeyCharacter, String>> character) {
        this.character = character;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "\n\nProduct{" +
                "id=" + id +
                ", category=" + category +
                ", name='" + name + '\'' +
                ", character=" + character +
                ", price=" + price +
                '}';
    }
}
