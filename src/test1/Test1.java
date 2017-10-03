package test1;

public class Test1 {

    public static void main(String[] args) {

        Object [][] country ={       
            {"no\t","Nama","Alamat"},    
            {"1\t","Sani","Jakarta"}, 
            {"2\t","Ahmad","Maroko"}, 
            {"3\t","Kili","Kediri"},   
            {"4\t","Gh","Tuban"}        
        };
        System.out.println(country.length);
        System.out.println(country[0].length);
        Object[][] ganti = ChangeArray.changeLength2D(country, 9, 3);
        
        System.out.println(" Length "+ganti.length);
        System.out.println("Length2 "+ganti[0].length);
        
        for(Object[] ganti2 : ganti){
            for(int i = 0; i<ganti[0].length; i++){
                System.out.println(ganti2[i]);
            }
        }
        
    }
    
}
