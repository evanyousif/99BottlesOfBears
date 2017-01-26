package beersong;

public class BeerSong {
    public static void main(String[] args) {
        Ninety_Nine_Bottles_of_Beer();
    }
    
    public static void Ninety_Nine_Bottles_of_Beer(){
        for(int i=99;i>1;i--){
            System.out.println(i+" bottles of beer on the wall, "+i+" bottles of beer");
            System.out.print("take one down, pass it around, ");
            
        }
    }
    
}

