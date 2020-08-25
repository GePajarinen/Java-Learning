import java.util.*;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("Type: ");

    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    ArrayList lista = new ArrayList();
    
    for (int i=0; i<num; i++){
      lista.add(sc.nextInt());
    }
    
    System.out.println(lista.toString());

    int query = sc.nextInt();
    sc.nextLine();
    System.out.println("query " + query);
    
    for (int i=0; i< query; i++){
      String s = sc.nextLine();
      System.out.println("s " +  s);

      switch(s){
        case "Insert":
          int id = sc.nextInt();
          System.out.println("id " +  id);
          int n = sc.nextInt();
          System.out.println("n " +  n);
          lista.add(id, n);
        case "Delete":
          int x = sc.nextInt();
          System.out.println("x " +  x);
          lista.remove(x);
      }
      sc.close();

      System.out.println("de dentro "+lista.toString());
    }
    System.out.println("de fora " + lista.toString());


  }
}
/*
5
12 0 1 78 12
1
Insert
5 23
Delete
0

*/