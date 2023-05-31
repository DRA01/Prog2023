public class Clase7FuncionMathRandom {
    public static void main(String[] args){
        int[] vectorRandom = new int[50];
        //double rand = Math.random();
        for(int i = 0; i < vectorRandom.length ; i ++){
            vectorRandom[i] = (int)(Math.random()*10 + 1);
    }
        for(int i = 0; 1 < vectorRandom.length; i ++){
            System.out.println(vectorRandom[i]);
        }
        
    }
}