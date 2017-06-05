package aquarium;
class Aquarium {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        calculate induk = new calculate();
        hitungluas anak1 = new hitungluas();
        hitungvolume anak2 = new hitungvolume();
        hitungkelkaca anak3 = new hitungkelkaca();
        hargaaquarium anak4 = new hargaaquarium();
        System.out.println("========================");
        System.out.println("SPESIFIKASI Aquarium    ");
        System.out.println("========================");
        int panjang = 100;
        int lebar = 150;
        int tinggi = 80;
                
        induk.setpanjang(panjang);
        induk.settinggi(tinggi);
        induk.setlebar(lebar);

        System.out.println("LEBAR : "+induk.getlebar());
        System.out.println("TINGGI :"+induk.gettinggi());
        System.out.println("PANJANG :"+induk.getpanjang()+"\n\n");
        System.out.println("LUAS Aquarium");
        induk.boom();
        induk = anak1;
        induk.boom();        
        System.out.println("Volume Aquarium");
        induk = anak2;
        induk.boom();
        System.out.println("Keliling Aquarium");
        induk = anak3;
        induk.boom();
        System.out.println("Harga Aquarium");
        induk = anak4;
        induk.boom();   
        
    }
    
}

class calculate {
private static int panjang;
private static int lebar;
private static int tinggi;
    public static void setpanjang(int x){
    panjang = x;
    }
    public static void setlebar(int x){
    lebar =x;

    }
    public static void settinggi(int x){
    tinggi = x;

    }
    public static int getpanjang(){
    return panjang;
    }
    public static int getlebar(){
    return lebar;
    }
    public static int gettinggi(){
    return tinggi;
    }
    
    public void boom(){
        
    }
}
 class hitungluas extends calculate{
    public void boom(){
        int hitungluas = getpanjang() * getlebar();
        System.out.println(hitungluas);
    }
}

class hitungvolume extends calculate{
    public void boom(){
       int hitungvolume = getpanjang() * getlebar() * gettinggi();
        System.out.println(hitungvolume);
    }
}

class hitungkelkaca extends calculate{
  
    public void boom (){
        int hitungkel = 2 * getpanjang() + getlebar() * 2;
        System.out.println(hitungkel);
    }
    public int getnilai(){
        int hitungkel = 2 * getpanjang() + getlebar() * 2;
        return hitungkel; 
    }
    
}

class hargaaquarium extends hitungkelkaca{
   
    public void boom(){
        int percm = 10000;
        int harga =   getnilai() * percm;
        System.out.println(harga);
    }
    
}
