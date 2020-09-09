
/*
EXERCÍCIO 12 
Muitas canções populares são baseadas em padrões repetitivos. 
Logo é possível construir algoritmos que montem suas letras a partir desses padrões que se repetem.
Escreva um programa em Java que gere e mostre no terminal shell
(console) a letra da popular canção norte-americana de Natal “The Twelve Days
of Christmas” transcrita abaixo. Utilize estruturas de controle e não
simplesmente um System.out.print ou println em toda a música.
'''
On the first day of Christmas, my love gave to me a partridge in a pear tree.
On the second day of Christmas, my love gave to me two turtle doves,
     and a partridge in a pear tree.
On the third day of Christmas, my love gave to me three french hens,
     two turtle doves,
     and a partridge in a pear tree.
On the fourth day of Christmas, my love gave to me four calling birds,
     three french hens,
     two turtle doves,
     and a partridge in a pear tree.
On the fifth day of Christmas, my love gave to me five gold rings,
     four calling birds,
     three french hens,
     two turtle doves,
     and a partridge in a pear tree.
On the sixth day of Christmas, my love gave to me six geese a-laying,
     five gold rings,
     four calling birds,
     three french hens,
     two turtle doves,
     and a partridge in a pear tree.
On the seventh day of Christmas, my love gave to me seven swans a-swimming,
     six geese a-laying,
     five gold rings,
     four calling birds,
     three french hens,
     two turtle doves,
     and a partridge in a pear tree.
On the eighth day of Christmas, my love gave to me eight maids a-milking,
     seven swans a-swimming,
     six geese a-laying,
     five gold rings,
     four calling birds,
     three french hens,
     two turtle doves,
     and a partridge in a pear tree.
On the ninth day of Christmas, my love gave to me nine ladies waiting,
     eight maids a-milking,
     seven swans a-swimming,
     six geese a-laying,
     five gold rings,
     four calling birds,
     three french hens,
     two turtle doves,
     and a partridge in a pear tree.
On the tenth day of Christmas, my love gave to me ten
lords a-leaping,
     nine ladies waiting,
     eight maids a-milking,
     seven swans a-swimming,
     six geese a-laying,
     five gold rings,
     four calling birds,
     three french hens,
     two turtle doves,
     and a partridge in a pear tree.
On the eleventh day of Christmas, my love gave to me eleven pipers piping,
     ten lords a-leaping,
     nine ladies waiting,
     eight maids a-milking,
     seven swans a-swimming,
     six geese a-laying,
     five gold rings,
     four calling birds,
     three french hens,
     two turtle doves,
     and a partridge in a pear tree.
On the twelfth day of Christmas, my love gave to me twelve drummers drumming,
     eleven pipers piping,
     ten lords a-leaping,
     nine ladies waiting,
     eight maids a-milking,
     seven swans a-swimming,
     six geese a-laying,
     five gold rings,
     four calling birds,
     three french hens,
     two turtle doves,
     and a partridge in a pear tree.
*/ 

class Exercicio12{
     public static void main(String[] args) {
          String[] ordem = {"first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"};
      
          String[] frase = {"a partridge in a pear tree,", "two turtle doves,", "three french hens,", "four calling birds", "five gold rings,", "six geese a-laying,", "seven swans a-swimming,", "eight maids a-milking,", "nine ladies waiting,", "ten lords a-leaping,", "eleven pipers piping,", "twelve drummers drumming,"};
          
          String montaFrase = "";
        
          for (int i=0; i<12; i++){  
            montaFrase = frase[i] +"\n" + montaFrase;
      
            System.out.println("On the "+ ordem[i]+ " day of Christmas, my love gave to me " + montaFrase);
          }
        }
}
