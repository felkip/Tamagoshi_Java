import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name1 = " ", name2 = " ";
        int info2 = 0, info3 = 0, info4 = 0, info5 = 0, info6 = 0, info7 =0;

        System.out.println("Digite um nome para o seu tamagoshi :");
        name1 = input.next();
        System.out.println("Digite a idade : ");
        info2 = input.nextInt();
        System.out.println("Digite o quão faminto ele está : ");
        info3 = input.nextInt();
        System.out.println("E agora a saúde :");
        info4 = input.nextInt();

        System.out.println("Hora de criar mais um tamagoshi !!");

        System.out.println("Digite um nome para o seu tamagoshi :");
        name2 = input.next();
        System.out.println("Digite a idade : ");
        info5 = input.nextInt();
        System.out.println("Digite o quão faminto ele está : ");
        info6 = input.nextInt();
        System.out.println("E agora a saúde :");
        info7 = input.nextInt();

        Tamagoshi t1 = new Tamagoshi(name1,info2,info3,info4);

        Tamagoshi t2 = new Tamagoshi(name2,info5,info6,info7);
        t1.Imprimir();
        t2.Imprimir();

    }
}

