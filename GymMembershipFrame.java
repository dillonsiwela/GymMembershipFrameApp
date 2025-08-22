/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Dell
 */
public class GymMembershipFrame extends JFrame{
    
    //JPanel
    private JPanel headingPnl;
    private JPanel clientPnl;
    private JPanel namePnl;
    private JPanel surnamePnl;
    private JPanel idNoPnl;
    private JPanel genderPnl;
    private JPanel contactPnl;
    private JPanel personalTrainerOptPnl;
    private JPanel memberShipPnl;      
    private JPanel commentsPnl;
     private JPanel btnsPln;
    private JPanel headingClientCombinedPnl;
    private JPanel membershipCommentsCommbinedPnl;
    private JPanel mainPnl;
        
    //JLabel
    private JLabel headingLbl;
    private JLabel nameLbl;        
    private JLabel surnameLbl;
    private JLabel idNoLbl;       
    private JLabel genderLbl;       
    private JLabel personalTrainerLbl;       
    private JLabel contactTypeLbl;
    
    //JTextField
    
    private JTextField nameTxt;
    private JTextField  surnameTxt;      
    private JTextField  idNoTxt;
    
    //JComboBox
    
    private JComboBox genderCbx;
    
    //JRadioButton
    private JRadioButton  monthToMonthRdb;
    private JRadioButton sixMonthRdb;
    private JRadioButton annualRdb;
    
    //JCheckBox
    private JCheckBox personalTrainerChbx;
    
    //buttonGroup
    private ButtonGroup btnGroup;
    
    //jTextarea
    private JTextArea  commentArea;
    
    //JscrooPane
    private JScrollPane scroolableTextArea;
    
   //Jbutten
    private JButton applayBtn;
    
    public GymMembershipFrame(){
        
        setTitle("gym membership");
        setSize(500, 500);
        
        //creating panels
        headingPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        
        clientPnl = new JPanel(new GridLayout(4, 1, 1, 1));
        clientPnl.setBorder(new TitledBorder(new LineBorder(Color.BLACK),"client details"));
        
        namePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        surnamePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        genderPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        idNoPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        personalTrainerOptPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        contactPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        memberShipPnl = new JPanel(new GridLayout(2, 1, 1, 1));
        memberShipPnl.setBorder(new TitledBorder(new LineBorder(Color.BLACK,1),"Contract options"));
        
        commentsPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        btnsPln = new JPanel(new FlowLayout(FlowLayout.LEFT));
        headingClientCombinedPnl =new JPanel(new BorderLayout());
        membershipCommentsCommbinedPnl = new JPanel(new BorderLayout());
        mainPnl = new JPanel(new BorderLayout());
        
        //creating lebels
        headingLbl = new JLabel("Membership form");
        headingLbl.setFont(new Font(Font.SANS_SERIF,Font.ITALIC + Font.BOLD,20));
        headingLbl.setForeground(Color.BLUE);
        headingLbl.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
        
        nameLbl = new JLabel("Name:    ");
        surnameLbl = new JLabel("surname:      ");
        idNoLbl = new JLabel("ID no:     ");
        genderLbl =new JLabel("Gender:     ");
        personalTrainerLbl= new JLabel("Select the check box if u want a personal trainer: ");
        contactTypeLbl = new JLabel("type of contract");
        
        //create textFields
        
        nameTxt = new JTextField(10);
        surnameTxt = new JTextField(10);
        idNoTxt =new JTextField(10);
        
        //creating j combo box;
        
        genderCbx = new JComboBox();
        genderCbx.addItem("male");
        genderCbx.addItem("Female");
        
       //creating radio butten
       
       monthToMonthRdb =new JRadioButton("month-to-month");
       sixMonthRdb = new JRadioButton("Six month");
       annualRdb = new JRadioButton("annual");
       
       //creating check box
       personalTrainerChbx =new JCheckBox();
       
       // creating button group 
     btnGroup = new ButtonGroup();
     btnGroup.add(annualRdb);
     btnGroup.add(monthToMonthRdb);
     btnGroup.add(sixMonthRdb);
     
     //creating text area
     commentArea = new JTextArea(20,40);
     commentArea.setBorder(new TitledBorder(new LineBorder(Color.black,1),"comments"));
     
     //crteating scroolable
     
     scroolableTextArea =new JScrollPane(commentArea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
     
     //creating butten
     applayBtn = new JButton("APPLY");
     
     //adding componets to the panel
     
     headingPnl.add(headingLbl);
     
     namePnl.add(nameLbl);
     namePnl.add(nameTxt);
     
     surnamePnl.add(surnameLbl);
     surnamePnl.add(surnameTxt);
     
     idNoPnl.add(idNoLbl);
     idNoPnl.add(idNoTxt);
     
     genderPnl.add(genderLbl);
     genderPnl.add(genderCbx);
     
     clientPnl.add(namePnl);
     clientPnl.add(surnamePnl);
     clientPnl.add(idNoPnl);
     clientPnl.add(genderPnl);
     
     headingClientCombinedPnl.add(headingPnl,BorderLayout.NORTH);
     headingClientCombinedPnl.add(clientPnl,BorderLayout.CENTER);
     
     contactPnl.add(contactTypeLbl);
     contactPnl.add(monthToMonthRdb);
     contactPnl.add(sixMonthRdb);
     contactPnl.add(annualRdb);
     contactPnl.add(personalTrainerLbl);
     contactPnl.add(personalTrainerChbx);
     
     
     memberShipPnl.add(contactPnl);
     memberShipPnl.add(personalTrainerOptPnl);
     
     commentsPnl.add(scroolableTextArea);
     
     membershipCommentsCommbinedPnl.add(memberShipPnl,BorderLayout.NORTH);
     membershipCommentsCommbinedPnl.add(commentsPnl,BorderLayout.CENTER);
     
     btnsPln.add(applayBtn);
     
     mainPnl.add(headingClientCombinedPnl,BorderLayout.NORTH);
     mainPnl.add(membershipCommentsCommbinedPnl,BorderLayout.CENTER);
     mainPnl.add(btnsPln,BorderLayout.SOUTH);
     
     add(mainPnl);
     
     pack();
     setVisible(true);
     
    }
    
    
  
}
