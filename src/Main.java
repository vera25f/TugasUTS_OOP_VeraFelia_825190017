import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char chooose;
        char choose;
        System.out.print("WELCOME TO BIKINI BOTTOM\n");
        System.out.print("========================\n");
        do {
            System.out.print("choose the place you want to visit\n");
            System.out.print("1. Krusty Crab\n");
            System.out.print("2. Beach\n");
            System.out.print("3. Barg'N-Mart\n");
            System.out.print("4. Chum Bucket\n");
            System.out.print("choose (1/2/3/4) : ");
            chooose = input.next().charAt(0);

        } while (chooose != '1' && chooose != '2' && chooose != '3' && chooose != '4');

        Kasir CS = new Kasir();
        if (chooose == '1') {
            System.out.print("WELCOME TO KRUSTY CRAB\n");
            System.out.print("Squidward : yo welcome, what do you want ?\n");
            System.out.print("Squidward : so here we have\n");
            do {
                System.out.print("1. Krabby Patty (IDR 15000)\n");
                System.out.print("2. Pizza (IDR 35000)\n");
                System.out.print("3. Krabby Meal (IDR 25000)\n");
                System.out.print("4. Salty Sea Dog (IDR 18000)\n");
                System.out.print("5. Krabby Patty (IDR 15000)\n");
                System.out.print("6. Kelp Shake (IDR 10000)\n");
                System.out.print("quickly choose between 1 to 6\n");
                choose = input.next().charAt(0);

                if (choose != '1' && choose != '2' && choose != '3' && choose != '4' && choose != '5' && choose != '6')
                {
                    System.out.print("Squidward : Please don't waste my clarinet time \n");
                } else {
                    if (choose =='1') {
                        CS.setHarga(15000);
                    } else if (choose =='2') {
                        CS.setHarga(35000);
                    } else if (choose =='3') {
                        CS.setHarga(25000);
                    } else if (choose =='4') {
                        CS.setHarga(18000);
                    } else if (choose =='5') {
                        CS.setHarga(15000);
                    } else if (choose =='6') {
                        CS.setHarga(10000);
                    }
                    System.out.print("Squidward : how many items do you want to buy? \n");
                    CS.setBanyak(input.nextInt());
                    System.out.print("Squidward : Do you want to add toppings? \n");
                    System.out.print("1. YES\n");
                    System.out.print("or\n");
                    System.out.print("2. NO ?\n");
                    CS.setYesorno(input.next().charAt(0));
                    if (CS.getYesorno()== '1') {
                        System.out.print("1. More cream\n");
                        System.out.print("2. More cheese\n");
                        System.out.print("3. More cream and cheese\n");
                        System.out.print("choose (1/2/3) : ");
                        CS.setPiltoping(input.next().charAt(0));
                        if (CS.getPiltoping() == '1') {
                            CS.setToppings(3000);
                        }
                        else if (CS.getPiltoping() == '2') {
                            CS.setToppings(5000);
                        }
                       else if (CS.getPiltoping() == '3') {
                            CS.setToppings(7500);
                        }
                        CS.setTotal(CS.getHarga() * CS.getBanyak() + CS.getToppings());

                    } else {
                        CS.setTotal(CS.getHarga() * CS.getBanyak());
                    }
                    System.out.print("Squidward : Alrigth, Spongebob here we go.. cook it\n");
                    System.out.print("Spongebob : Ay Ay Captain, I'm ready\n");
                    System.out.print("Spongebob : Your order is ready, Sir\n");
                    System.out.print("Squidward : Total payment : IDR " + CS.getTotal());
                }
            } while (choose != '1' && choose != '2' && choose != '3' && choose != '4' && choose != '5' && choose != '6');


        } else if (chooose == '2') {
            System.out.print("WELCOME TO THE BEACH\n");
            System.out.print("Larry the lobster : Yo whut supp ma customer,what do you want?\n");
            System.out.print("Larry the lobster : Here we have\n");
            do {
                System.out.print("1. Coconut water\n");
                System.out.print("2. Playing football or volleyball\n");
                System.out.print("3. Swimming coach for 1hour\n");
                System.out.print("4. Rent a sunbathing stand \n");
                System.out.print("5. Juice or kombucha \n");
                System.out.print("choose (1/2/3/4/5) : ");
                choose = input.next().charAt(0);
                if (choose != '1' && choose != '2' && choose != '3' && choose != '4' && choose != '5') {
                    System.out.print("Larry the lobster : I'm sorry, that option is not on the menu\n");
                } else {
                    if (choose =='1') {
                        CS.setHarga(5000);
                    } else if (choose =='2') {
                        CS.setHarga(15000);
                    } else if (choose =='3') {
                        CS.setHarga(55000);
                    } else if (choose =='4') {
                        CS.setHarga(35000);
                    } else if (choose =='5') {
                        CS.setHarga(10000);
                    }
                    System.out.print("Larry the lobster : Nice choice ma customer,how many items do you want to buy? \n");
                    CS.setBanyak(input.nextInt());

                    CS.setTotal(CS.getHarga() * CS.getBanyak());
                    System.out.print("Larry the lobster : Total payment : IDR " + CS.getTotal());
                    System.out.print("Larry the lobster : Enjoy your time ma customer");
                }
            } while (choose != '1' && choose != '2' && choose != '3' && choose != '4' && choose != '5');


        } else if (chooose == '3') {
            System.out.print("WELCOME TO Barg'N-Mart\n");
            System.out.print("Cashier the fish : What do you want?\n");
            do {
                System.out.print("1. Water\n");
                System.out.print("2. Jellyfish jam\n");
                System.out.print("3. Potato chips\n");
                System.out.print("4. Chocolate\n");
                System.out.print("5. Snail holder\n");
                System.out.print("6. Snail shell\n");
                System.out.print("choose (1/2/3/4/5) : ");
                choose = input.next().charAt(0);
                if (choose != '1' && choose != '2' && choose != '3' && choose != '4' && choose != '5' && choose != '6') {
                    System.out.print("Cashier the fish : Choose again please\n");
                } else {
                    if (choose =='1') {
                        CS.setHarga(5000);
                    } else if (choose =='2') {
                        CS.setHarga(5000);
                    } else if (choose =='3') {
                        CS.setHarga(4000);
                    } else if (choose =='4') {
                        CS.setHarga(3000);
                    } else if (choose =='5') {
                        CS.setHarga(65000);
                    } else if (choose =='6') {
                        CS.setHarga(150000);
                    }
                    System.out.print("Cashier the fish : How many items do you want to buy? \n");
                    CS.setBanyak(input.nextInt());

                    CS.setTotal(CS.getHarga() * CS.getBanyak());
                    System.out.print("Cashier the fish : Total payment IDR " + CS.getTotal());
                }
            } while (choose != '1' && choose != '2' && choose != '3' && choose != '4' && choose != '5'&& choose != '6');


        } else if (chooose == '4') {

            System.out.print("WELCOME TO Chum Bucket\n");
            System.out.print("Plankton : For the sake of neptune, you are the first customer here in a long time\n");
            System.out.print("Plankton : What do you want my percious customer?\n");
            do {
                System.out.print("1. Chum Burger\n");
                System.out.print("2. Chum Fries\n");
                System.out.print("3. Chum Shake\n");
                System.out.print("4. Chum Stick\n");
                System.out.print("5. Chumbalaya\n");
                System.out.print("6. Chum Chili\n");
                System.out.print("7. Chum Pie\n");
                System.out.print("7. Chummy Joes\n");
                System.out.print("choose (1/2/3/4/5/6/7) : ");
                choose = input.next().charAt(0);
                if (choose != '1' && choose != '2' && choose != '3' && choose != '4' && choose != '5'&& choose != '6'&& choose != '7') {
                    System.out.print("Plankton : Uhhh, my percioues customer, we don't have that menu yet\n");
                    System.out.print("Plankton : Please choose again\n");
                } else {
                    if (choose =='1') {
                        CS.setHarga(5000);
                    } else if (choose =='2') {
                        CS.setHarga(6000);
                    } else if (choose =='3') {
                        CS.setHarga(7000);
                    } else if (choose =='4') {
                        CS.setHarga(8000);
                    } else if (choose =='5') {
                        CS.setHarga(9000);
                    } else if (choose =='6') {
                        CS.setHarga(10000);
                    } else if (choose =='7') {
                        CS.setHarga(11000);
                    }
                    System.out.print("Plankton : Dear my precious customer, how many items do you want to buy? \n");
                    System.out.print("Plankton : Please buy as much as you can \n");
                    CS.setBanyak(input.nextInt());

                    CS.setTotal(CS.getHarga() * CS.getBanyak());
                    CS.setDiscount(0.5* CS.getTotal());
                    System.out.print("Karen : Total payment IDR " +CS.getTotal());
                    System.out.print("Karen : But you get some discount" +CS.getDiscount());
                    System.out.print("Karen : So you can pay IDR "+CS.getDiscount());
                    System.out.print("Plankton : NICE MY PRECIOUS CUSTOMER,Now its to steal the secret formula of krabby patty, HUAHAHAHA... \n");
                }
            } while (choose != '1' && choose != '2' && choose != '3' && choose != '4' && choose != '5'&& choose != '6'&& choose != '7');

        }
    }

    }
