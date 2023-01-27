public class Pisin {
    public static void main(String[] args) {
        String temp = args[0];
        for (int i=1;i<args.length;i++){
            if(temp.length()<args[i].length()){
                temp = args[i];
            }
        }
        System.out.println(temp);
    }
}