package Gadgetarium.Models.Interfaces;

import Gadgetarium.Models.Enums.KeyCharacter;
import Gadgetarium.Models.Product;

import java.util.List;

public interface Service {
    List<Product>  saveProduct();
    void updateProduct(Long id);
   Product getByIdProduct(Long id);
    void searchByProductName(String name);
    void filterByCharacter();
    void sortByCharacter();
    void deleteByProduct(Product product);
    List<Product> getAllProduct();
   void deleteCharacterByKeyName(KeyCharacter k);
    List<Product>deleteAllCharacters();
}
