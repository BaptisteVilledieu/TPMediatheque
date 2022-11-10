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
public interface ItemVisitor {
    public String visit(Book i);
    public String visit(CD i);
}
