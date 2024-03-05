import java.util.Scanner;
public class atminterface {
     public static void main(String[] args) {
        int balance = 100000,withdraw, deposit;
        Scanner sc= new Scanner(System.in);
        while(true)
        {
            System.out.println("Automated Teller Machine");
            System.out.println("Choose 1 For Withdraws");
            System.out.println("Choose 2 For Deposite");
            System.out.println("Choose 3 For Check Balance");
            System.out.println("Choose 4 for EXIT");
            System.out.println("Choose the operation you want to perform");
            int choice =sc.nextInt();
            switch(choice)
            {
                case 1:
                System.out.println("Enter money to be withdrawn:");
                withdraw = sc.nextInt();
                if(balance>= withdraw)
                {
                    balance = balance-withdraw;
                    System.out.println("please collect your money");
                }
                else
                {
                    System.out.println("Insufficient Balance");
                }
                System.out.println("");
                break;
                case 2:
                System.out.println("Enter money to be deposited:");
                deposit = sc.nextInt();
                balance = balance + deposit;
                System.out.println("Your Money has been successfully");
                break;
                case 3:
                System.out.println("Balance:"+ balance);
                System.out.println("");
                break;
                case 4:
                System.out.println(0);
            }
        }

            }
        }
     

