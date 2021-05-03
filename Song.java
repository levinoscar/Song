/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package song;

/**
 *
 * @author levin.o646
 */
public class Song {
    
    public static void main(String[] args) {
        verse1();
        verse2();
        verse3();
        verse4();
        verse5();
        verse6();
    }
    
    private static void cat() {
        System.out.println("Cat goes fiddle-i-fee.");
        System.out.println("");
    }
    
    private static void hen() {
        System.out.println("Hen goes chimmy-chuck, chimmy-chuck,");
    }
    
    private static void duck() {
        System.out.println("Duck goes quack, quack,");
    }
    
    private static void goose() {
        System.out.println("Goose goes hissy, hissy,");
    }
    
    private static void sheep() {
        System.out.println("Sheep goes baa, baa,");
    }
    
    private static void cow() {
        System.out.println("Cow goes moo, moo,");
    }
    
    private static void verse1() {
        System.out.println("Bought me a cat and the cat pleased me,");
        System.out.println("I fed my cat under yonder tree.");
        cat();
    }
    
    private static void verse2() {
        System.out.println("Bought me a hen and the hen pleased me,");
        System.out.println("I fed my hen under yonder tree.");
        hen();
        cat();
    }
    
    private static void verse3() {
        System.out.println("Bought me a duck and duck pleased me,");
        System.out.println("I fed my duck under yonder tree.");
        duck();
        hen();
        cat();
    }
    
    private static void verse4() {
        System.out.println("Bought me a goose and the goose pleased me,");
        System.out.println("I fed my goose under yonder tree.");
        goose();
        duck();
        hen();
        cat();
    }
    
    private static void verse5() {
        System.out.println("Bought me a sheep and the sheep pleased me,");
        System.out.println("I fed my sheep under yonder tree.");
        sheep();
        goose();
        duck();
        hen();
        cat();
    }
    
    private static void verse6() {
        System.out.println("Bought me a cow and the cow pleased me,");
        System.out.println("I fed my cow under yonder tree.");
        cow();
        sheep();
        goose();
        duck();
        hen();
        cat();
    }
}
