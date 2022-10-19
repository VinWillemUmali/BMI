import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class BMI extends JFrame
{
JLabel height= new JLabel();
JLabel weight= new JLabel();
JLabel bmi= new JLabel();
JLabel ft= new JLabel();
JLabel lbs= new JLabel();
JLabel inchs= new JLabel();

JButton compute= new JButton();
JButton clear= new JButton();
JButton exit= new JButton();

JTextField heightF= new JTextField();
JTextField weightF= new JTextField();
JTextField bmiF= new JTextField();
JTextField inchF= new JTextField();

public BMI(){
setTitle("BMI Calculator");

getContentPane().setLayout(new GridBagLayout());

GridBagConstraints gC= new GridBagConstraints();

height.setText("Height: ");
gC.gridx=0;
gC.gridy=0;
getContentPane().add(height,gC);

weight.setText("Weight: ");
gC.gridx=0;
gC.gridy=1;
getContentPane().add(weight, gC);

bmi.setText("BMI: ");
gC.gridx=0;
gC.gridy=2;
getContentPane().add(bmi, gC);

heightF.setText(" ");
heightF.setColumns(5);
gC.gridx=1;
gC.gridy=0;
getContentPane().add(heightF, gC);

weightF.setText(" ");
weightF.setColumns(5);
gC.gridx=1;
gC.gridy=1;
getContentPane().add(weightF, gC);

bmiF.setText(" ");
bmiF.setColumns(10);
gC.gridx=1;
gC.gridy=2;
getContentPane().add(bmiF, gC);

ft.setText("feet");
gC.gridx=2;
gC.gridy=0;
getContentPane().add(ft, gC);

lbs.setText("pounds");
gC.gridx=2;
gC.gridy=1;
getContentPane().add(lbs, gC);

inchF.setText(" ");
inchF.setColumns(5);
gC.gridx=3;
gC.gridy=0;
getContentPane().add(inchF, gC);

inchs.setText("inches");
gC.gridx=4;
gC.gridy=0;
getContentPane().add(inchs, gC);

compute.setText("Compute BMI");
gC.gridx=0;
gC.gridy=3;
getContentPane().add(compute, gC);

compute.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
computeActionPerformed(e);
}
});

clear.setText("Clear");
gC.gridx=2;
gC.gridy=3;
getContentPane().add(clear, gC);

clear.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
clearActionPerformed(e);
}
});

exit.setText("Exit");
gC.gridx=4;
gC.gridy=3;
getContentPane().add(exit, gC);

exit.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
exitActionPerformed(e);
}
});

pack();
}
private void clearActionPerformed(ActionEvent e){
JFrame f;
f = new JFrame();

heightF.setText("");
weightF.setText("");
bmiF.setText("");
inchF.setText("");

}
private void computeActionPerformed(ActionEvent e){
JFrame f;
f = new JFrame();

double Hft=Double.parseDouble(heightF.getText());
double Hinch=Double.parseDouble(inchF.getText());
double w=Double.parseDouble(weightF.getText());

double h=(Hft*12)+Hinch;

double bmiAns=(w/(h*h))*703;
String ans=Double.toString(bmiAns);
bmiF.setText(ans);
}
private void exitActionPerformed(ActionEvent e){
JFrame f;
f = new JFrame();

JOptionPane.showMessageDialog(f, "Exit Calculator");

}
public static void main(String[] args){
new BMI().show();
}
}