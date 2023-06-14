package RealizeMethods;

import Data.DataBase;
import Gadgetarium.Models.Characters;
import Gadgetarium.Models.Enums.Category;
import Gadgetarium.Models.Enums.KeyCharacter;
import Gadgetarium.Models.Interfaces.Service;
import Gadgetarium.Models.Product;

import java.util.*;

public class ServiceImpl implements Service {
    private DataBase dataBase;

    public ServiceImpl(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    public DataBase getDataBase() {
        return dataBase;
    }

    public void setDataBase(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public  List<Product> saveProduct() {
      Map<KeyCharacter,List<String>>map=new HashMap<>();
      List<String>strings=new ArrayList<>(List.of("2","4","6","8"));
      map.put(KeyCharacter.RAM,strings);
      dataBase.getCharacters().add(new Characters(10L,map));

        List<Map<KeyCharacter,String>> character=new ArrayList<>();
        Map<KeyCharacter,String>map1=new HashMap<>();
        map1.put(KeyCharacter.RAM,"8GB");
        character.add(map1);

        Map<KeyCharacter,String>map2=new HashMap<>();
        map1.put(KeyCharacter.CPU,"2200МГц");
        character.add(map2);

        Map<KeyCharacter,String>map3=new HashMap<>();
        map1.put(KeyCharacter.SIZE_OF_DISPLAY,"4.8");
        character.add(map3);

       // System.out.println("**********************************************");

        List<Map<KeyCharacter,String>> character1=new ArrayList<>();
        Map<KeyCharacter,String>map4=new HashMap<>();
        map4.put(KeyCharacter.RAM,"16GB");
        character1.add(map4);

        Map<KeyCharacter,String>map5=new HashMap<>();
        map5.put(KeyCharacter.CPU,"3700МГц");
        character1.add(map5);

        Map<KeyCharacter,String>map6=new HashMap<>();
        map6.put(KeyCharacter.SIZE_OF_DISPLAY,"15.6");
        character1.add(map6);

       // System.out.println("**********************************************");

        List<Map<KeyCharacter,String>> character2=new ArrayList<>();
        Map<KeyCharacter,String>map7=new HashMap<>();
        map7.put(KeyCharacter.RAM,"1.5GB");
        character2.add(map7);

        Map<KeyCharacter,String>map8=new HashMap<>();
        map8.put(KeyCharacter.CPU,"850МГц");
        character2.add(map8);

        Map<KeyCharacter,String>map9=new HashMap<>();
        map9.put(KeyCharacter.SIZE_OF_DISPLAY,"1.4");
        character2.add(map9);

            dataBase.getProducts().add(new Product(1L,Category.PHONE,"Samsung A72",character,35000));
            dataBase.getProducts().add(new Product(2L,Category.LAPTOP,"Galaxy Book Pro 3 360",character1,15800));
            dataBase.getProducts().add(new Product(3L,Category.SMARTWATCH,"Galaxy Watch 5 Pro",character2,27790));
            return dataBase.getProducts();

    }

    @Override
    public void updateProduct(Long id) {
        List<Map<KeyCharacter,String>> character3=new ArrayList<>();
        Map<KeyCharacter,String>map4=new HashMap<>();
        map4.put(KeyCharacter.RAM,"24GB");
        character3.add(map4);

        Map<KeyCharacter,String>map5=new HashMap<>();
        map5.put(KeyCharacter.CPU,"4200МГц");
        character3.add(map5);

        Map<KeyCharacter,String>map6=new HashMap<>();
        map6.put(KeyCharacter.SIZE_OF_DISPLAY,"20.5");
        character3.add(map6);


        for (int i = 0; i < dataBase.getProducts().size(); i++) {
            if (id.equals(dataBase.getProducts().get(i).getId())){
                dataBase.getProducts().get(i).setCategory(Category.LAPTOP);
                dataBase.getProducts().get(i).setName("Lenovo Legion 5");
                dataBase.getProducts().get(i).setCharacter(character3);
                dataBase.getProducts().get(i).setPrice(109850);
            }

            System.out.println(dataBase.getProducts().get(i));
        }

    }

    @Override
    public Product getByIdProduct(Long id) {
        for (int i = 0; i < dataBase.getProducts().size(); i++) {
            if (id.equals(dataBase.getProducts().get(i).getId())){
                return dataBase.getProducts().get(i);
            }
        }return null;
    }

    @Override
    public void searchByProductName(String name) {
        for (int i = 0; i < dataBase.getProducts().size(); i++) {
            if (name.equalsIgnoreCase(dataBase.getProducts().get(i).getName())){
                System.out.println(dataBase.getProducts().get(i));
            }}

    }

    @Override
    public void filterByCharacter() {

    }

    @Override
    public void sortByCharacter() {
        ArrayList<String>valueList=new ArrayList<>();
        for (int i = 0; i < dataBase.getProducts().size(); i++) {
          valueList.addAll(dataBase.getProducts().get(i).getCharacter().get(i).values());
        }
        Collections.sort(valueList);
        System.out.println(valueList);


    }

    @Override
    public void deleteByProduct(Product product) {

            if (dataBase.getProducts().contains(product)){
                dataBase.getProducts().remove(product);
            }
        System.out.println(dataBase.getProducts());


    }

    @Override
    public List<Product> getAllProduct() {
        return dataBase.getProducts();

    }

    @Override
    public void deleteCharacterByKeyName(KeyCharacter k) {
        for (int i = 0; i < dataBase.getProducts().size(); i++) {
            if (dataBase.getProducts().get(i).getCharacter().get(i).keySet().equals(k)){
                dataBase.getProducts().get(i).getCharacter().get(i).remove(k);
            }

        }
        System.out.println(dataBase.getProducts());

    }

    @Override
    public List<Product> deleteAllCharacters() {
        for (int i = 0; i < dataBase.getProducts().get(i).getCharacter().size(); i++) {
            dataBase.getProducts().get(i).getCharacter().remove(i);

        }
        return dataBase.getProducts();


    }
}
