public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1,Fighter f2,int minWeight,int maxWeight){
        this.f1=f1;
        this.f2=f2;
        this.minWeight=minWeight;
        this.maxWeight=maxWeight;
    }

    void run(){
        if(isCheck()){
            while(f1.health>0 && f2.health>0){

                f2.health= f1.hit(f2);
                if(isWin()){
                    break;
                }
                System.out.println(f2.name + "'IN KALAN CANI : " +f2.health);
                f1.health=f2.hit(f1);
                System.out.println(f1.name + "'IN KALAN CANI : "+f1.health);
                if(isWin()){
                    break;
                }

            }


        }
    }

    boolean isWin(){
        if(f1.health<=0){
            System.out.println(this.f2.name+" KAZANDI");
            return true;
        }
        if(f2.health<=0){
            System.out.println(this.f1.name+" KAZANDI");
            return true;
        }
        return  false;
    }

    boolean isCheck(){
        return (this.minWeight<=f1.weight && f1.weight<=this.maxWeight) && (this.minWeight<= f2.weight && f2.weight<=this.maxWeight);
    }
}
