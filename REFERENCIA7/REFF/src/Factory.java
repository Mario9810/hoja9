
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cooli
 */
public class Factory {
    public BSTree<String,String> getTree(int opcion){
        
        switch (opcion) {
            case 1:
                System.out.println("USTED ESCOGIO: SPLAY TREE\n");
                return new SplayBST<String,String>();
            case 2:
                System.out.println("USTED ESCOGIO: RED BLACK TREE\n");
                return new RedBlackTree<String,String>();
            
        }
        
        return null;
    }
    
}
