/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tic_tac_toe;

import javax.swing.text.PlainDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;

/**
 *
 * @author Asus
 */
public class CharLimitation extends PlainDocument{

    private int limit;

    public CharLimitation(int limitation)
    {
        this.limit = limitation;
    }
    public void insertString(int offset, String str, AttributeSet set) throws BadLocationException
    {
        if(str == null)
        {
            return;
        } else if((getLength() + str.length()) <= limit)
        {
            str = str.toUpperCase();
            super.insertString(offset, str, set);
        } 
    }
    
}