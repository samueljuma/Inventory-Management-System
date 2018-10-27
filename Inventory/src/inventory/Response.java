package inventory;

import java.util.Scanner;

/**
 * @author SamJay
 */
public class Response {



    public Response() {
    }

    public void repeatuserChoice() {
        UserOptions options = new UserOptions();
        options.printChoices();
        respondToUserChoice();
    }

    public void respondToUserChoice() {
        Scanner in = new Scanner(System.in);
        try {
            int choice = in.nextInt();
//        if (choice == 7) {
//            return;
//        }
            switch (choice) {
                case 1: {
                    register();
                    break;
                }
                case 2: {
                    buyProduct();
                    break;
                }
                case 3: {
                    removeProduct();
                    break;
                }
                case 4: {
                    viewProducts();
                    break;
                }
                case 5: {
                    checkOut();
                    break;
                }
                case 6: {
                    getHelp();
                    break;
                }
                case 7: {
                    break;
                }
                default: {
                    System.out.print("invalid choice. Try again: ");
                    respondToUserChoice();
                    break;
                }
            }
        } catch (Exception e) {
            int count = 0;
            System.out.print("input should be a number. Try again : ");
            while (count < 3) {
                respondToUserChoice();

                count++;
            }
            if (count > 3) {
                System.out.println("failed");
            }

        }
    }

    //register product
    public void repeatChoice() {
    }

    public void register() {
        int count = 0;
    Product[] products = new Product[2];
    ProductList list = new ProductList();
        while (count < products.length) {
            products[count] = new Product();
            count++;
//            afterChoice();
        }
        list.createListOfProductsRegistered(products);
        System.out.println("\t\t\t*******************************\n"
                            + "\t\t\tPRODUCTS REGISTERED FOR SALE\n"
                         + "\t\t\t*******************************");
        for (int i = 0; i < products.length; i++) {
            System.out.println("__________\n"
                             + "Product "+(i+1)+":\n"
                            + "----------");
            System.out.print(list.listOfProducts[i].toString());
        }

    }

    public void afterChoice() {
        Scanner in = new Scanner(System.in);
        System.out.print("enter C to continue registering, \n Q to exit, \n M to view Main Menu."
                + "\nenter Choice: ");
        char choice = in.nextLine().charAt(0);
        OUTER:
        while (choice == 'Q' || choice == 'M' || choice == 'C') {
            switch (choice) {

                case 'C':
                    register();
                    break OUTER;
                case 'Q':
                    break OUTER;
                case 'M':
                    repeatuserChoice();
                    break OUTER;
                default:

                    while (choice != 'Q' && choice != 'C' && choice != 'M') {
                        System.out.print("\tinvalid choice.try Again: ");
                        choice = in.nextLine().charAt(0);
                        if (choice == 'Q') {
                            return;
                        }
                        if (choice == 'C') {
                            register();
                        }
                        if (choice == 'M') {
                            repeatuserChoice();
                        }
                    }
                    break;
            }
        }

    }

    //buy product
    public static void buyProduct() {
        System.out.println("buy product");
    }

    //remove product
    public static void removeProduct() {
        System.out.println("remove products");
    }

    //view products
    public static void viewProducts() {

    }

    //check out
    public static void checkOut() {
        System.out.println("checkout");
    }

    //get help
    public static void getHelp() {
        System.out.println("Help");
    }

//    public static void main(String[] args) {
//        Response res = new Response();
//        res.register();
//
//    }

}
