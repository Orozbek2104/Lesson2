//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MuClass muClass = new MuClass();

        muClass.name = "Orozbek";
        muClass.lastName = "Islambek uulu";
        muClass.age = 21;
        muClass.Katyshuu = "java-14";
        muClass.favoriteDish = "Besh barmak";
        System.out.println("name: " + muClass.name +"\n" + "lastName: " + muClass.lastName + "\n" + "age: " + muClass.age + "\n" + "katushuu: "+muClass.Katyshuu  + "\n" + "favoritedish: " + muClass.favoriteDish);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        muClass.method();






    }
}