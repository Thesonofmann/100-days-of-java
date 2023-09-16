package createdPack;


public class Packaged {
    
    static class Group{
        int x;
        int y;

    }
    public static void main(String[] args){
        Group group = new Group();
        group.x = 17;
        for (int i =1; i <=9; i++){
            for (int y = 1; y<=7; y++ ){
                group.y +=1;
                System.out.print(group.y + " ");
            }
            System.out.println();
        }
    }
}
