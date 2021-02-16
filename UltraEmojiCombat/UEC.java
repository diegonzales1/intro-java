package uec;
public class UEC {
    public static void main(String[] args) {
        
        System.out.println("----------- Ultra Emoji Combat 2021 -------------".toUpperCase());
        Lutador lut[]  = new Lutador[6];
                
        lut[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f,11,3,1);
        lut[1] = new Lutador("Putscript", "Brasil", 29, 1.68f,57.8f,14,2,3);
        lut[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
        lut[3] = new Lutador("Dead Code", "Austrália", 28, 1.93f, 81.6f, 13, 0, 2);
        lut[4] = new Lutador("UFOCobol", "Brasil", 37, 1.70f, 119.3f, 5, 4 ,3);
        lut[5] = new Lutador("Berdaart", "EUA", 30, 1.81f, 105.7f, 12, 2 ,4);
       
        /* 
        for(int i=0; i < 6; i++){
            lut[i].status();
        }  
        */
        
        Luta l = new Luta();
        
        l.marcarLuta(lut[1], lut[1]);
        l.lutar();
        lut[1].apresentar();
       
       
    } 
}
