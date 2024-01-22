import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaCalculator {
  private JPanel JavaCalculator;
  private JTextField textDisplay;
  private JButton buttonEq;
  private JButton buttonMinus;
  private JButton buttonAdd;
  private JButton buttonMul;
  private JButton buttonClear;
  private JButton buttonDiv;
  private JButton buttonSeven;
  private JButton buttonFour;
  private JButton buttonOne;
  private JButton buttonZero;
  private JButton buttonEight;
  private JButton buttonFive;
  private JButton buttonTwo;
  private JButton buttonNine;
  private JButton buttonSix;
  private JButton buttonThree;
  private JButton buttonDot;
  private JButton ButtonAC;
  private JLabel labelStore;

  private double number0,number1, ans;
  private int calculation = 0;
  public void arithmaticOp(){
    switch(calculation){
      case 1: { // Plus
        number1 = Double.parseDouble(textDisplay.getText());
        ans = number0 + number1;
        textDisplay.setText(Double.toString(ans));
        break;
      }
      case 2:{
        number1 = Double.parseDouble(textDisplay.getText());
        ans =  number0 - number1;
        textDisplay.setText(Double.toString(ans));
        break;
      }
      case 3:{
        number1 = Double.parseDouble(textDisplay.getText());
        ans =  number0 * number1;
        textDisplay.setText(Double.toString(ans));
        break;
      }
      case 4:{
        number1 = Double.parseDouble(textDisplay.getText());
        if (number1 != 0) {
          ans = number0 / number1;
          textDisplay.setText(Double.toString(ans));
        } else {
          textDisplay.setText("Error"); // Handling division by zero
        }
        break;
      }
      case 0:{
        number0 = Double.parseDouble(textDisplay.getText());
        ans = number0;
        textDisplay.setText("");
        break;
      }
    }
    number0 = ans;
    calculation = 0;
  }
  public JavaCalculator() {

    buttonOne.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String txt = textDisplay.getText() + buttonOne.getText();
        textDisplay.setText(txt);
      }
    });

    buttonTwo.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String txt = textDisplay.getText() + buttonTwo.getText();
        textDisplay.setText(txt);
      }
    });

    buttonThree.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String txt = textDisplay.getText() + buttonThree.getText();
        textDisplay.setText(txt);
      }
    });

    buttonFour.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String txt = textDisplay.getText() + buttonFour.getText();
        textDisplay.setText(txt);
      }
    });

    buttonFive.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String txt = textDisplay.getText() + buttonFive.getText();
        textDisplay.setText(txt);
      }
    });

    buttonSix.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String txt = textDisplay.getText() + buttonSix.getText();
        textDisplay.setText(txt);
      }
    });

    buttonSeven.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String txt = textDisplay.getText() + buttonSeven.getText();
        textDisplay.setText(txt);
      }
    });

    buttonEight.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String txt = textDisplay.getText() + buttonEight.getText();
        textDisplay.setText(txt);
      }
    });

    buttonNine.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String txt = textDisplay.getText() + buttonNine.getText();
        textDisplay.setText(txt);
      }
    });

    buttonZero.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String txt = textDisplay.getText() + buttonZero.getText();
        textDisplay.setText(txt);
      }
    });

    buttonClear.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        textDisplay.setText("");
        calculation = 0;
        ans = 0;
        number0 = 0;
      }
    });

    buttonDiv.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        if(!textDisplay.getText().isEmpty()){
          number0 = Double.parseDouble(textDisplay.getText());
          labelStore.setText(textDisplay.getText() + "/");
          textDisplay.setText("");
        }else{
          number0 = ans;
          labelStore.setText(labelStore.getText() + "/");
        }
        calculation = 4;
      }
    });

    buttonMul.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        if(!textDisplay.getText().isEmpty()){
          number0 = Double.parseDouble(textDisplay.getText());
          labelStore.setText(textDisplay.getText() + "*");
          textDisplay.setText("");
        }else{
          number0 = ans;
          labelStore.setText(labelStore.getText() + "*");
        }
        calculation = 3;
      }
    });
    buttonAdd.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        if(!textDisplay.getText().isEmpty()){
          number0 = Double.parseDouble(textDisplay.getText());
          labelStore.setText(textDisplay.getText() + "+");
          textDisplay.setText("");
        }else{
          number0 = ans;
          labelStore.setText(labelStore.getText() + "+");
        }
        calculation = 1;
      }
    });
    buttonMinus.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        if(!textDisplay.getText().isEmpty()){
          number0 = Double.parseDouble(textDisplay.getText());
          labelStore.setText(textDisplay.getText() + "-");
          textDisplay.setText("");
        }else{
          number0 = ans;
          labelStore.setText(labelStore.getText() + "-");
        }
        calculation = 2;
      }
    });
    ButtonAC.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        int ln = textDisplay.getText().length();
        if(ln > 0){
          textDisplay.setText(textDisplay.getText().substring(0, ln-1));
        }
        else{
          textDisplay.setText("");
        }

      }
    });

    buttonDot.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String s = textDisplay.getText();
        if(s.isEmpty()){
          textDisplay.setText("0.");
        }
        else if(!s.contains(".")){
          textDisplay.setText(s + ".");
        }
      }
    });

    buttonEq.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        arithmaticOp();
        labelStore.setText(Double.toString(ans));
        textDisplay.setText("");
      }
    });

  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("JavaCalculator");
    frame.setContentPane(new JavaCalculator().JavaCalculator);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
  }
}
