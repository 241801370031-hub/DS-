class StaticIntialization {
    public static void main(String[] args) {
        int[] numbers = {8, 6, 9, 5};
        String[] names = {"Sham", "Lucky", "Don"};
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
      
        int[] darr= new int[10]; 

        darr[0]=1;
        darr[9]=8;
for (int i = 0; i < darr.length; i++) {
        System.out.println(darr[i]);
}
    }
}
