/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediatheque;

/**
 *
 * @author bapti
 */
public class BookPrinter implements ItemVisitor{
    @Override
    public void visit(CD i){
    }
    
    @Override
    public void visit(Book i){
        System.out.println(i.toString());
    }
}