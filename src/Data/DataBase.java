package Data;

import Gadgetarium.Models.Characters;
import Gadgetarium.Models.Product;

import java.util.List;

public class DataBase {
    private List<Characters>characters;
    private List<Product>products;

    public DataBase(List<Characters> characters, List<Product> products) {
        this.characters = characters;
        this.products = products;
    }

    public DataBase() {
    }

    public List<Characters> getCharacters() {
        return characters;
    }

    public void setCharacters(List<Characters> characters) {
        this.characters = characters;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
