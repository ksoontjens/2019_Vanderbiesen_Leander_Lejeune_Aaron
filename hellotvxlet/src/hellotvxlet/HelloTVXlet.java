package hellotvxlet;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.tv.xlet.*;
import org.havi.ui.HScene;
import org.havi.ui.HSceneFactory;
import org.havi.ui.HStaticText;
import org.havi.ui.HVisible;
import java.awt.Color;
import javax.tv.xlet.Xlet;
import javax.tv.xlet.XletContext;
import javax.tv.xlet.XletStateChangeException;
import org.havi.ui.HScene;
import org.havi.ui.HSceneFactory;
import org.havi.ui.HStaticText;
import org.havi.ui.HTextButton;
import org.havi.ui.HVisible;
import org.havi.ui.event.*;


public class HelloTVXlet implements Xlet, HActionListener {
   public HScene scene;
   public HTextButton button1;
   public HTextButton button2;
   public HTextButton button3;
   public HTextButton button4;
   public int lives=3;
   public HStaticText hst;
   Vraag vragen[]=new Vraag[11];
   int huidigevraag=0;
    public HelloTVXlet() {
        
    }
public void volgendeVraag()
{
    huidigevraag++;
<<<<<<< HEAD
    System.out.println(huidigevraag);
    hst.setTextContent(vragen[huidigevraag].vrg, HVisible.NORMAL_STATE);
    button1.setTextContent(vragen[huidigevraag].an1, HVisible.NORMAL_STATE);
    button2.setTextContent(vragen[huidigevraag].an2, HVisible.NORMAL_STATE);
    button3.setTextContent(vragen[huidigevraag].an3, HVisible.NORMAL_STATE);
    button4.setTextContent(vragen[huidigevraag].an4, HVisible.NORMAL_STATE);
    
=======
      
>>>>>>> 6b7401d094969ff7b6749ab2973b42d9fba409be
}
    public void initXlet(XletContext context) {
      
      scene= HSceneFactory.getInstance().getDefaultHScene();
      hst=new HStaticText("Hello welcome to the Impossible Quiz",250,50,400,200);
      hst.setBackgroundMode(HVisible.BACKGROUND_FILL);
      hst.setBackground(Color.BLUE);
      scene.add(hst);
       
      scene.setVisible(true);
      fillQuestions();
      startgame();
      scene.validate();
      button1.requestFocus();
      
    }

    public void startXlet() {
    
    }

    public void pauseXlet() {
     
    }

    public void destroyXlet(boolean unconditional) {
     
    }
    public void startgame(){
    
   
      hst=new HStaticText(vragen[huidigevraag].vrg,20,300,680,100); // tekst,x,y,w,h
      hst.setBackgroundMode(HVisible.BACKGROUND_FILL);
      hst.setBackground(Color.BLUE);
      scene.add(hst);
     
      button1=new HTextButton(vragen[huidigevraag].an1,20,420,320,50); // tekst,x,y,w,h
      button1.setBackgroundMode(HVisible.BACKGROUND_FILL);
      button1.setBackground(Color.GREEN);
      scene.add(button1);
      
      button2=new HTextButton(vragen[huidigevraag].an2, 390,420,320,50); // tekst,x,y,w,h
      button2.setBackgroundMode(HVisible.BACKGROUND_FILL);
      button2.setBackground(Color.GREEN);
      scene.add(button2);
      
      button3=new HTextButton(vragen[huidigevraag].an3, 20,500,320,50); // tekst,x,y,w,h
      button3.setBackgroundMode(HVisible.BACKGROUND_FILL);
      button3.setBackground(Color.GREEN);
      scene.add(button3);
      
      button4=new HTextButton(vragen[huidigevraag].an4, 390,500,320,50); // tekst,x,y,w,h
      button4.setBackgroundMode(HVisible.BACKGROUND_FILL);
      button4.setBackground(Color.GREEN);
      scene.add(button4);
      
      assignButton();
    
    }
    public void assignButton()
    {
     button4.setActionCommand("knop4");
     button4.addHActionListener(this);
     button3.setActionCommand("knop3");
     button3.addHActionListener(this);
     button2.setActionCommand("knop2");
     button2.addHActionListener(this);
     button1.setActionCommand("knop1");
     button1.addHActionListener(this);
     
     button1.setFocusTraversal(null,null, button4, button2); 
     button2.setFocusTraversal(null,null, button1,button3);
     button3.setFocusTraversal(null, null, button2, button4);
     button4.setFocusTraversal(null, null, button3, button1);
    }
    public void actionPerformed(ActionEvent arg0) {
        
      if (huidigevraag==0 && arg0.getActionCommand().equals("knop4"))
      {
         volgendeVraag();
        // startgame();
         System.out.println("NICEONE");
      }
      else{
          System.out.println("false");
          lives--;
      }
      if(huidigevraag==1 && arg0.getActionCommand().equals("knop2")){
          volgendeVraag();
          //startgame();
          System.out.println("NICEONE");
      }
      else{
          lives--;
      }
     if(huidigevraag==2 && arg0.getActionCommand().equals("knop4")){
          volgendeVraag();
          //startgame();
          System.out.println("NICEONE");
      }
      else{
          lives--;
      }
       if(huidigevraag==3 && (arg0.getActionCommand().equals("knop1") || arg0.getActionCommand().equals("knop2") || arg0.getActionCommand().equals("knop3") || arg0.getActionCommand().equals("knop4"))){
          volgendeVraag();
        //  startgame();
          System.out.println("NICEONE");
      }
      else{
          lives--;
      }
       if(huidigevraag==4 && arg0.getActionCommand().equals("knop1")){
          volgendeVraag();
        //  startgame();
          System.out.println("NICEONE");
      }
      else{
          lives--;
      }
       if(huidigevraag==5 && arg0.getActionCommand().equals("knop1")){
          volgendeVraag();
        //  startgame();
          System.out.println("NICEONE");
      }
      else{
          lives--;
      }
       if(huidigevraag==6 && arg0.getActionCommand().equals("knop3")){
          volgendeVraag();
        //  startgame();
          System.out.println("NICEONE");
      }
      else{
          lives--;
      }
       if(huidigevraag==7 && arg0.getActionCommand().equals("knop1")){
          volgendeVraag();
         // startgame();
          System.out.println("NICEONE");
      }
      else{
          lives--;
      }
       if(huidigevraag==8 && arg0.getActionCommand().equals("knop1")){
          volgendeVraag();
         // startgame();
          System.out.println("NICEONE");
      }
      else{
          lives--;
      }
       if(huidigevraag==9 && arg0.getActionCommand().equals("knop4")){
          volgendeVraag();
        //  startgame();
          System.out.println("NICEONE");
      }
      else{
          lives--;
      }
       if(huidigevraag==10 && arg0.getActionCommand().equals("knop4")){
          volgendeVraag();
         // startgame();
          System.out.println("NICEONE");
      }
      else{
          lives--;
      }
    }
    public void fillQuestions(){
      vragen[0] = new Vraag("How many holes in a POLO?","one","two","three", "four");
      vragen[1] = new Vraag("What do you call a wingless fly?","a flap","a walk","a plum","Jason");
      vragen[2] = new Vraag("Mary Rose sat on a pin", "O really?", "burst her piles", "aaaaaaaa", "mary Rose"); 
      vragen[3] = new Vraag("Can you get this question wrong?", "nope", "no", "no way", "of course not");
      vragen[4] = new Vraag("Can a match box?", "no but a tin can", "no", "yes", "yes, one can beat mike tyson");
      vragen[5] = new Vraag("sdrawkcab noitseuq siht rewsna", "K.O", "what?", "I dont understand", "tennis elbow");
      vragen[6] = new Vraag("sqrt(Onion)", "28", "carrots", "shallots", "Pi");
      vragen[7] = new Vraag("Number of the next question", "8", "9", "10", "11");
      vragen[8] = new Vraag("What was the answer of question 8", "this one", "that one", "that one", "that one");
      vragen[9] = new Vraag("Are you this quiz?", "of course I am!", "No i dont", "THIS IS SPARTAAA", "5 chickenwings and a coke please");
      vragen[10] =  new Vraag("Shangai?", "is indeed the largest city in China", "never been", "why is there a question mark?", "no, about 20cm off the ground");
    }
    
    public void falseAnswer(){
        
    }
}
