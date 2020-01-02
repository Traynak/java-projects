package tictactoepanel;
//*************************************************************
//TicTacToe.java Author: Trevor Raynak
//
//Panel for the game of Tic Tac Toe
//**************************************************************

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class TicTacToePanel extends JPanel  
{
private JPanel ttt, text, primary;                           		//*************************************************
private JButton buttonOne, buttonTwo, buttonThree, buttonFour, 		
buttonFive, buttonSix, buttonSeven, buttonEight, buttonNine;            
private JLabel variableLabel;                                          	 //JLabel declares the variables in the program
private int  count, buttonValue;                                    	
private boolean win, pressButtonOne, pressButtonTwo, pressButtonThree,  
//Boolean defines who wins the game
pressButtonFour, pressButtonFive, pressButtonSix, pressButtonSeven,									// boolean values to see if a button has been pressed
pressButtonEight, pressButtonNine; 					 

public TicTacToePanel()                                   //This section creates the nine buttons for the game panel
    {                                                  
	buttonOne = new JButton ("");
	buttonOne.addActionListener (new ButtonListener()); //button one through nine 
  
	buttonTwo = new JButton ("");
	buttonTwo.addActionListener (new ButtonListener()); 
  
	buttonThree = new JButton ("");
	buttonThree.addActionListener (new ButtonListener()); 
  
	buttonFour = new JButton ("");
	buttonFour.addActionListener (new ButtonListener());
  
	buttonFive = new JButton ("");
	buttonFive.addActionListener (new ButtonListener());
  
	buttonSix = new JButton ("");
	buttonSix.addActionListener (new ButtonListener());
  
	buttonSeven = new JButton ("");
	buttonSeven.addActionListener (new ButtonListener());
  
	buttonEight = new JButton ("");
	buttonEight.addActionListener (new ButtonListener());
  
	buttonNine = new JButton ("");
	buttonNine.addActionListener (new ButtonListener());
   
	ttt = new JPanel();
	ttt.setPreferredSize (new Dimension (450, 250)); //size of the panel
	ttt.setBackground (Color.blue);                    //background color in panel
	ttt.setLayout (new GridLayout (3, 3));         //layout of panel which is 3x3 (9 squares)
	ttt.add(buttonOne);                           	   //The next 9 lines add a button listener to the panel
	ttt.add(buttonTwo);                              
	ttt.add(buttonThree);                            
	ttt.add(buttonFour);                             
	ttt.add(buttonFive);                             
	ttt.add(buttonSix);                              
	ttt.add(buttonSeven);                            
	ttt.add(buttonEight);                            
	ttt.add(buttonNine);                             
  
	variableLabel = new JLabel ("PLEASE SELECT YOUR MOVE (PLAYER 1: X)");    
	text = new JPanel();
	text.setPreferredSize (new Dimension (400, 30)); //size of text box in panel
  	text.setBackground(Color.orange);                //color of text box in panel
  	text.add(variableLabel); 
  
  	primary = new JPanel();
  	primary.setLayout(new BoxLayout(primary, BoxLayout.Y_AXIS)); //layout of the game applet for the program
  	primary.add(ttt);
  	primary.add(text);
  	add(primary);      //game panel and text box are combined
    }

private class ButtonListener implements ActionListener  
   {
public void actionPerformed (ActionEvent event)
        {  
  count++; //counts how many times a button is pressed
  
 if (event.getSource() == buttonOne ) buttonValue = 1;                //this section gives each button a value
        else if (event.getSource() == buttonTwo) buttonValue = 2; 	
 	else if (event.getSource() == buttonThree) buttonValue = 3; 
 	else if (event.getSource() == buttonFour) buttonValue = 4; 	
 	else if (event.getSource() == buttonFive) buttonValue = 5; 	
 	else if (event.getSource() == buttonSix) buttonValue = 6; 	
 	else if (event.getSource() == buttonSeven) buttonValue = 7; 
 	else if (event.getSource() == buttonEight) buttonValue = 8; 
 	else if (event.getSource() == buttonNine) buttonValue = 9; 	
          
 switch (buttonValue)//switch determines what player's turn it is with each case
     {
case 1:                    
   if (count%2 == 0)    
//determines the number of times a button has been pressed using the button listner
        {               //odd numbers are for Player 1(X) and even numbers are for Player 2(O)
        if(pressButtonOne == false) 
            {buttonOne.setText ("O");
            variableLabel.setText("PLEASE SELECT YOUR MOVE (PLAYER 1: X)"); 
//label for Player 1 showing change of turn
            pressButtonOne = true;// boolean statement limits you to only press a button one time
            }
         else
            {variableLabel.setText("SQUARE IS OCCUPIED.PLEASE TRY ANOTHER.");
//states a button is already used
            count--;//allows user to select an unused button 
            }
       }
          else
            {
          if (pressButtonOne == false)  
                {buttonOne.setText ("X");
                variableLabel.setText ("PLEASE SELECT YOUR MOVE (PLAYER 2: 0)");
                pressButtonOne = true;
                } 
           else
                {variableLabel.setText("SQUARE IS OCCUPIED.PLEASE TRY ANOTHER.");
                count--;     
                }   
           }
   break;
   
case 2:
    if (count%2 == 0)
      {                   
        if(pressButtonTwo == false)
            {buttonTwo.setText ("O");
            variableLabel.setText("PLEASE SELECT YOUR MOVE (PLAYER 1: X)");
            pressButtonTwo = true;
            }
         else
            {variableLabel.setText("SQUARE IS OCCUPIED.PLEASE TRY ANOTHER.");
            count--;
            }
       }
          else
       {
          if (pressButtonTwo == false)  
                {buttonTwo.setText ("X");
                variableLabel.setText ("PLEASE SELECT YOUR MOVE (PLAYER 1: O)");
                pressButtonTwo = true;
                } 
           else
                {variableLabel.setText("SQUARE IS OCCUPIED.PLEASE TRY ANOTHER.");
                count--;     
                }
        }
   break;
   
case 3:
    if (count%2 == 0)
      {                   
        if(pressButtonThree == false)
            {buttonThree.setText ("O");
            variableLabel.setText("PLEASE SELECT YOUR MOVE (PLAYER 1: X)");
            pressButtonThree = true;
            }
         else
            {variableLabel.setText("SQUARE IS OCCUPIED.PLEASE TRY ANOTHER.");
            count--;
            }
       }
          else
       {
          if (pressButtonThree == false)  
                {buttonThree.setText ("X");
                variableLabel.setText ("PLEASE SELECT YOUR MOVE (PLAYER 2: O)");
                pressButtonThree = true;
                } 
           else
                {variableLabel.setText("SQUARE IS OCCUPIED.PLEASE TRY ANOTHER.");
                count--;     
                }
        }
   break;
   
 case 4:
   if (count%2 == 0)
      {                   
        if(pressButtonFour == false)
            {buttonFour.setText ("O");
            variableLabel.setText("PLEASE SELECT YOUR MOVE (PLAYER 1: X)");
            pressButtonFour = true;
            }
         else
            {variableLabel.setText("SQUARE IS OCCUPIED.PLEASE TRY ANOTHER.");
            count--;
            }
       }
          else
       {
          if (pressButtonFour == false)  
                {buttonFour.setText ("X");
                variableLabel.setText ("PLEASE SELECT YOUR MOVE (PLAYER 2: O)");
                pressButtonFour = true;
                } 
           else
                {variableLabel.setText("SQUARE IS OCCUPIED.PLEASE TRY ANOTHER.");
                count--;     
                }
        }
    break;
 
 case 5:
   if (count%2 == 0)
      {                   
        if(pressButtonFive == false)
            {buttonFive.setText ("O");
            variableLabel.setText("PLEASE SELECT YOUR MOVE (PLAYER 1: X)");
            pressButtonFive = true;
            }
         else
            {variableLabel.setText("SQUARE IS OCCUPIED.PLEASE TRY ANOTHER.");
            count--;
            }
       }
          else
       {
          if (pressButtonFive == false)  
                {buttonFive.setText ("X");
                variableLabel.setText ("PLEASE SELECT YOUR MOVE (PLAYER 2: O)");
                pressButtonFive = true;
                } 
           else
                {variableLabel.setText("SQUARE IS OCCUPIED.PLEASE TRY ANOTHER.");
                count--;     
                }
        }  
   break;

 case 6:
   if (count%2 == 0)
      {                   
        if(pressButtonSix == false)
            {buttonSix.setText ("O");
            variableLabel.setText("PLEASE SELECT YOUR MOVE (PLAYER 1: X)");
            pressButtonSix = true;
            }
         else
            {variableLabel.setText("SQUARE IS OCCUPIED.PLEASE TRY ANOTHER.");
            count--;
            }
       }
          else
       {
           if (pressButtonSix == false)  
               {buttonSix.setText ("X");
                variableLabel.setText ("PLEASE SELECT YOUR MOVE (PLAYER 2: O)");
                pressButtonSix = true;
                } 
           else
                {variableLabel.setText("SQUARE IS OCCUPIED.PLEASE TRY ANOTHER.");
                count--;     
                }
        }    
   break;

 case 7:
   if (count%2 == 0)
      {                  
        if(pressButtonSeven == false)
            {buttonSeven.setText ("O");
            variableLabel.setText("PLEASE SELECT YOUR MOVE (PLAYER 1: X)");
            pressButtonSeven = true;
            }
         else
            {variableLabel.setText("SQUARE IS OCCUPIED.PLEASE TRY ANOTHER.");
            count--;
            }
       }
          else
       {
          if (pressButtonSeven == false)  
            {buttonSeven.setText ("X");
            variableLabel.setText ("PLEASE SELECT YOUR MOVE (PLAYER 2: O)");
            pressButtonSeven = true;
            } 
           else
            {variableLabel.setText("SQUARE IS OCCUPIED.PLEASE TRY ANOTHER.");
            count--;     
            }
        } 
    break;

 case 8:
   if (count%2 == 0) 
      {                   
        if(pressButtonEight == false)
            {buttonEight.setText ("O");
            variableLabel.setText("PLEASE SELECT YOUR MOVE (PLAYER 1: X)");
            pressButtonEight = true;
            }
         else
            {variableLabel.setText("SQUARE IS OCCUPIED.PLEASE TRY ANOTHER.");
            count--;
            }
       }
          else
       {
          if (pressButtonEight == false)  
                {buttonEight.setText ("X");
                variableLabel.setText ("PLEASE SELECT YOUR MOVE (PLAYER 2: O)");
                pressButtonEight = true;
                } 
           else
                {variableLabel.setText("SQUARE IS OCCUPIED.PLEASE TRY ANOTHER.");
                count--;     
                }
       }
   break;     

 case 9:
   if (count%2 == 0)
      {                   
        if(pressButtonNine == false)
          {buttonNine.setText ("O");
          variableLabel.setText("PLEASE SELECT YOUR MOVE (PLAYER 1: X)");
          pressButtonNine = true;
          }
         else
          {variableLabel.setText("SQUARE IS OCCUPIED.PLEASE TRY ANOTHER.");
          count--;
          }
       }
          else
       {
          if (pressButtonNine == false)  
            {buttonNine.setText ("X");
            variableLabel.setText ("PLEASE SELECT YOUR MOVE (PLAYER 2: O)");
            pressButtonNine = true;
            } 
           else
            {variableLabel.setText("SQUARE IS OCCUPIED.PLEASE TRY ANOTHER.");
            count--;     
            }
        }  
     break;
    } 
 
 //this section enables a player to win horizontally
 if (buttonOne.getText() == buttonTwo.getText() && buttonTwo.getText() == buttonThree.getText() && buttonOne.getText() != "")
    {win = true;
    }
   else if (buttonFour.getText() == buttonFive.getText() && buttonFive.getText() == buttonSix.getText() && buttonFour.getText() != "")
    {win = true;
    }
   else if (buttonSeven.getText() == buttonEight.getText() && buttonEight.getText() == buttonNine.getText() && buttonSeven.getText() != "")
    {win = true;
    }
 
  //this section enables a player to win vertically 
   else if (buttonOne.getText() == buttonFour.getText() && buttonFour.getText() == buttonSeven.getText() && buttonOne.getText() != "")
    {win = true;
    }
   else if (buttonTwo.getText() == buttonFive.getText() && buttonFive.getText() == buttonEight.getText() && buttonTwo.getText() != "")
    {win = true;
    }
    else if (buttonThree.getText() == buttonSix.getText() && buttonSix.getText() == buttonNine.getText() && buttonThree.getText() != "")
    {win = true;
    }
    
  //this section enables a player to winn diagonally
    else if (buttonOne.getText() == buttonFive.getText() && buttonFive.getText() == buttonNine.getText() && buttonOne.getText() != "")
    {win = true;
    }
    else if (buttonThree.getText() == buttonFive.getText() && buttonFive.getText() == buttonSeven.getText() && buttonThree.getText() != "")
    {win = true;
    }
    else
    {win = false;
    }
 
  if (win == true && count%2!=0)         			
    {variableLabel.setText("PLAYER 1(X) IS THE WINNER");	//determines the winner using the count and remainder
    }                                      			                                    			
    else if (win == true && count %2 ==0)  			  
    {variableLabel.setText("PLAYER 2(O) is the Winner");  	
    }                                      			 
    else if (count == 9)                                		// Determines that the game is a draw if count
    {win= false;                                    		// is equal to 9 and none of the above statements are satisified
     variableLabel.setText("PLAYER 1 AND 2 TIED; THE GAME IS A DRAW"); 
    }                                                   		
        }  
    }        
}
