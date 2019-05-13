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
   Vraag vragen[]=new Vraag[10];
   int huidigevraag=0;
    public HelloTVXlet() {
        
    }
public void volgendeVraag()
{
    huidigevraag++;
    hst.setTextContent(vragen[huidigevraag].vrg, HVisible.NORMAL_STATE);
}
    public void initXlet(XletContext context) {
        
        
       scene= HSceneFactory.getInstance().getDefaultHScene();
      
      HStaticText hst=new HStaticText("Hello welcome to the Impossible Quiz",250,50,400,200);
      hst.setBackgroundMode(HVisible.BACKGROUND_FILL);
      hst.setBackground(Color.BLUE);
      
      scene.add(hst);
      scene.setVisible(true);
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
       vragen[0]=new Vraag("How many holes in a POLO?","one","two","three", "four");
        vragen[1]= new Vraag("Test","1","2","3","4");
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
         startgame();
         
      }
      else{
          System.out.println("false");
          lives--;
      }
      if(huidigevraag==1 && arg0.getActionCommand().equals("knop2")){
          System.out.println("NICEONE");
      }
    }
    public void fillQuestions(){
        
    }
}
