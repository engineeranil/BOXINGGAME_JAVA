public class Fighter {
    String name;
    int health;
    int damage;
    int weight;
    double dodge;
    Fighter(String name,int health,int damage,int weight,double dodge){
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.weight = weight;
        this.dodge= dodge;
    }
    int hit(Fighter foe){
        System.out.println(this.name + " => " + foe.name + " 'e "+  " " + this.damage + " Hasar Vurdu.");
        if(foe.health-this.damage<0){
            return 0;
        }
        if(isDodge()){
            System.out.println(this.name+ " Hasari Engelledi.");
            return foe.health;
        }
        return  foe.health-this.damage;
    }
    boolean isDodge(){
        double randomNumber = Math.random()*100;
        return randomNumber<dodge;
    }
}
