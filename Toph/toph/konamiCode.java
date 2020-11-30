/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toph;

//import com.sun.xml.internal.ws.util.StringUtils;
import java.util.*;

/**
 *
 * @author Pollock
 */
public class konamiCode {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String kCode = "UUDDLRLRBA";
        String s = sc.nextLine();
        int c = (s.split("UUDDLRLRBA",-1).length - 1);
        System.out.println(c);
//UUUUDDLRLRBADDLUUDDLRLRBARLRUUDDLRLRBABA

    }
}
