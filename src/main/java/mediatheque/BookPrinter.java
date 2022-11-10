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
    public String visit(CD i){
        return null;
    }
    
    @Override
    public String visit(Book i){
        return null;
    }
}