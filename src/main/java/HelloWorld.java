public class HelloWorld {
    public static void main(String[] argv){
        for(int i = 0; i < 10; i++){
            if(i>5){
                new Person("shuwang");
            }else{
                new Person();
            }
        }
    }
}


class Person{
    Person(){
        System.out.println("person");
    }
    Person(String name){
        System.out.println(name);
    }
}

