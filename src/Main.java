import Data.DataBase;
import Gadgetarium.Models.Characters;
import Gadgetarium.Models.Enums.KeyCharacter;
import Gadgetarium.Models.Interfaces.Service;
import Gadgetarium.Models.Product;
import RealizeMethods.ServiceImpl;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        //javarush.com
        List<Product>products=new ArrayList<>();
        List<Characters>characters=new ArrayList<>();
        DataBase dataBase=new DataBase(characters,products);
        Service service=new ServiceImpl(dataBase);


        Scanner scanner=new Scanner(System.in);
        System.out.println("****Welcome****");
        getInfo();
        while (true){
            int x= scanner.nextInt();
            switch (x){
                case 1:System.out.println(service.saveProduct());
                getInfo();
                break;
                case 2: service.updateProduct(2L);
                getInfo();
                break;
                case 3:
                    System.out.println(service.getByIdProduct(3L));
                getInfo();
                break;
                case 4:service.searchByProductName("Samsung A72");
                getInfo();
                break;
                case 10:
                    System.out.println(service.deleteAllCharacters());
                getInfo();
                break;
                case 8:
                    System.out.println(service.getAllProduct());
                getInfo();
                break;
                case 6:service.sortByCharacter();
                getInfo();
                break;
                case 7:service.deleteByProduct(service.getByIdProduct(3L));
                getInfo();
                break;
                case 9:service.deleteCharacterByKeyName(KeyCharacter.RAM);
                getInfo();
                break;
            }
        }












    }
    public static void getInfo(){
        System.out.println("Press 1 to saveProduct: ");
        System.out.println("Press 2 to updateProduct: ");
        System.out.println("Press 3 to getByIdProduct: ");
        System.out.println("Press 4 to searchByProductName: ");
        System.out.println("Press 5 to filterByCharacter: ");
        System.out.println("Press 6 to sortByCharacter: ");
        System.out.println("Press 7 deleteByProduct: ");
        System.out.println("Press 8 to getAllProduct: ");
        System.out.println("Press 9 to deleteCharacterByKeyName: ");
        System.out.println("Press 10 to deleteAllCharacters: ");
    }
}