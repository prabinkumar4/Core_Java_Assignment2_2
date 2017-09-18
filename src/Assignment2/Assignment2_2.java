package Assignment2;
public class Assignment2_2 {

public static void main(String[] args) {
    {
        
        int height =3;                  //variable declaration height as integer
        int noOfCharactersInARow = 1;   //variable declaration noOfCharactersInARow as integer 
        int space = height+1;           //variable declaration space as integer
        char alphabet = 'a';            //variable declaration alphabet as char
        System.out.println("Pattern is :");
        for (int upperTriangle = 0; upperTriangle < height; upperTriangle++) {  // outer for loop for height of the upward pyramid
            for (int printSpace = space; printSpace > 0; printSpace--)          //inner for loop for space print for upward pyramid
            
            {
                System.out.print(" ");                                           // it will print space
            }
            space--;                                                             //decrease the number of space value by 1

            for (int printAlphabet = 0; printAlphabet < noOfCharactersInARow; printAlphabet++) {   // for loop number of characters in the upward pyramid
                System.out.print(alphabet);
                if (printAlphabet < noOfCharactersInARow / 2) {
                    alphabet++;
                } else {
                    alphabet--;
                }
            }
            noOfCharactersInARow = noOfCharactersInARow + 2;
            alphabet = 'a';

            System.out.println();
        }

        space = height;
        alphabet = 'a';
     for (int lowerTriangle = 0; lowerTriangle < height; lowerTriangle++) {   // outer for loop for height of the downward pyramid
            for (int printSpace = space; printSpace > 0; printSpace--)        //inner for loop for space print for upward pyramid
            {
                System.out.print(" ");                                         // it will print space   
            }
            space++;                                                            //decrease the number of space value by 1  
            for (int printAlphabet = 0; printAlphabet < (noOfCharactersInARow -space); printAlphabet++)  // for loop number of characters in the dowmward pyramid
            {
                System.out.print(alphabet);
                if (printAlphabet < noOfCharactersInARow/4) {
                    alphabet++;
                } else {
                    alphabet--;
                }
            }
            noOfCharactersInARow = noOfCharactersInARow-1;
            alphabet = 'a';
            System.out.println();
        }

        }

}
}


	


