import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;




public class StudenEnrollmentGUI {
    private StringBuilder enrollmentDetails;

    //frame beginning
    JFrame frame = new JFrame("Courses");

    JLabel label = new JLabel("Courses available:");
    JButton cybBtn = new JButton("Cyber Security");
    JButton cmpBtn = new JButton("Computer Science");
    JButton lawBtn = new JButton("Law");
    JButton medBtn = new JButton("Medicine");
    JButton arcBtn = new JButton("Architecture");


    //frame1 beginning
    JFrame frame1 = new JFrame("Registration");
    JLabel label1 = new JLabel("Registration");
    JLabel name = new JLabel("Name:");
    JLabel password = new JLabel("Pin:");
    JLabel email= new JLabel("Email:");
    JTextField nameField = new JTextField();
    JTextField emailField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JButton registerBtn = new JButton("register");

    //frame2 beginning
    JFrame frame2 = new JFrame("CYB");
    JLabel schoolFeesLabel = new JLabel("School Fees: 880,000");
    JLabel durationLabel = new JLabel("Course Duration: 4 years");
    JLabel jambScoreLabel = new JLabel("JAMB Score Required: 190");
    JTextField namField = new JTextField("enter your full name");
    JTextField jambField = new JTextField("enter your jamb score");
    JTextField ageField = new JTextField("enter your age");
    JButton applyBtn = new JButton("Apply");
    JTextField paymentField = new JTextField("enter amount");
    JButton payBtn = new JButton("Pay");
    JLabel macNumberLabel = new JLabel();



    public void registerUI(){//first frame


        label1.setHorizontalAlignment(SwingConstants.CENTER);
        label1.setVerticalAlignment(SwingConstants.CENTER);
        label1.setBounds(40, 50, 450, 50);
        label1.setForeground(Color.WHITE);
        label1.setFont(label.getFont().deriveFont(Font.BOLD, 35));

        name.setBounds(5, 145, 100, 30);
        name.setForeground(new Color(250, 250, 250));
        name.setSize(50,40);// set size of button
        name.setFont(name.getFont().deriveFont(Font.BOLD,15));

        email.setBounds(5, 195, 100, 30);
        email.setForeground(new Color(250, 250, 250));
        email.setSize(50,40);// set size of button
        email.setFont(name.getFont().deriveFont(Font.BOLD,15));


        password.setBounds(5, 245, 100, 30);
        password.setForeground(new Color(250, 250, 250));
        password.setSize(50,40);// set size of button
        password.setFont(name.getFont().deriveFont(Font.BOLD,15));

        nameField.setBounds(75, 150, 350, 30); // Set position and size of the name field
        emailField.setBounds(75, 200, 350, 30); // Set position and size of the password field
        passwordField.setBounds(75, 250, 350, 30); // Set position and size of the name field


        registerBtn.setBounds(180, 300, 100, 30);
        registerBtn.setBackground(new Color(100, 200, 250));
        registerBtn.setForeground(Color.black);
        registerBtn.setSize(150,50);// set size of button
        registerBtn.setFont(registerBtn.getFont().deriveFont(Font.BOLD, 15));


        frame1.getContentPane().setLayout(null); // Set layout to null for absolute positioning
        frame1.getContentPane().setBackground(new Color(0, 0, 139));
        frame1.getContentPane().add(email);
        frame1.getContentPane().add(password);
        frame1.getContentPane().add(name);
        frame1.getContentPane().add(passwordField);
        frame1.getContentPane().add(nameField);
        frame1.getContentPane().add(emailField);
        frame1.getContentPane().add(label1);
        frame1.add(registerBtn);

        frame1.setMinimumSize(new Dimension(500, 700));//precized size of frame
        frame1.setLocationRelativeTo(null);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setVisible(true);


        registerBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nameInput = nameField.getText();
                String emailInput = emailField.getText();
                String passwordInput = new String(passwordField.getPassword());

                if (nameInput.isEmpty() || emailInput.isEmpty() || passwordInput.isEmpty()) {
                    JOptionPane.showMessageDialog(frame1, "Please fill in all fields.");
                } else {
try {


                    String message = "Your registration number has been sent to your email: " + emailInput;
                    JOptionPane.showMessageDialog(frame1, message);
                    mainUI();
}catch (Exception exception){
    JOptionPane.showMessageDialog(frame1, "Error occurred during registration.");
}
                }

            }


    });
    }




    public void mainUI() {//second frame
        frame.getContentPane().setLayout(null); // Set layout to null for absolute positioning

        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);
        label.setBounds(40, 50, 450, 30);
        label.setForeground(Color.WHITE);
        label.setFont(label.getFont().deriveFont(Font.BOLD, 35));


        cybBtn.setBounds(180, 120, 100, 30);
        cybBtn.setBackground(new Color(100, 200, 250));
        cybBtn.setForeground(Color.black);
        cybBtn.setSize(170,50);// set size of button
        cybBtn.setFont(cybBtn.getFont().deriveFont(Font.BOLD, 15));


        cybBtn.addActionListener(new ActionListener() {
                                     @Override
                                     public void actionPerformed(ActionEvent e) {

                                       courseUI1();
                                     }

                                 });

        cmpBtn.setBounds(180, 180, 100, 30);
        cmpBtn.setBackground(new Color(100, 200, 250));
        cmpBtn.setForeground(Color.black);
        cmpBtn.setSize(170,50);// set size of button
        cmpBtn.setFont(cmpBtn.getFont().deriveFont(Font.BOLD, 15));



        lawBtn.setBounds(180, 240, 100, 30);
        lawBtn.setBackground(new Color(100, 200, 250));
        lawBtn.setForeground(Color.black);
        lawBtn.setSize(170,50);// set size of button


        medBtn.setBounds(180, 300, 100, 30);
        medBtn.setBackground(new Color(100, 200, 250));
        medBtn.setForeground(Color.black);
        medBtn.setSize(170,50);// set size of button
        medBtn.setFont(medBtn.getFont().deriveFont(Font.BOLD, 15));



        arcBtn.setBounds(180, 360, 100, 30);
        arcBtn.setBackground(new Color(100, 200, 250));
        arcBtn.setForeground(Color.black);
        arcBtn.setSize(170,50);// set size of button
        arcBtn.setFont(arcBtn.getFont().deriveFont(Font.BOLD, 15));



        frame.getContentPane().setBackground(new Color(0, 0, 139));
        frame.getContentPane().add(label);
        frame.getContentPane().add(cybBtn);
        frame.getContentPane().add(cmpBtn);
        frame.getContentPane().add(lawBtn);
        frame.getContentPane().add(medBtn);
        frame.getContentPane().add(arcBtn);

        frame.setMinimumSize(new Dimension(500, 700));// precized size of frame
        frame.setLocationRelativeTo(null);// positioning to center
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }


    public void courseUI1(){//cyber sec btn , third frame
        enrollmentDetails = new StringBuilder();

        schoolFeesLabel.setHorizontalAlignment(SwingConstants.CENTER);
        schoolFeesLabel.setVerticalAlignment(SwingConstants.CENTER);
        schoolFeesLabel.setBounds( 1, 30, 400, 30);
        schoolFeesLabel.setForeground(new Color(250, 250, 250));
        schoolFeesLabel.setFont(schoolFeesLabel.getFont().deriveFont(Font.BOLD,15));

        durationLabel.setHorizontalAlignment(SwingConstants.CENTER);
        durationLabel.setVerticalAlignment(SwingConstants.CENTER);
        durationLabel.setBounds ( 5, 55, 400, 30);
        durationLabel.setForeground(new Color(250, 250, 250));
        durationLabel.setFont(durationLabel.getFont().deriveFont(Font.BOLD,15));


        jambScoreLabel.setHorizontalAlignment(SwingConstants.CENTER);
        jambScoreLabel.setVerticalAlignment(SwingConstants.CENTER);
        jambScoreLabel.setBounds (1, 80, 450, 30);
        jambScoreLabel.setForeground(new Color(250, 250, 250));
        jambScoreLabel.setFont(jambScoreLabel.getFont().deriveFont(Font.BOLD,15));

        // Create the label
        macNumberLabel.setBounds(120, 420, 360, 30);
        macNumberLabel.setFont(macNumberLabel.getFont().deriveFont(Font.BOLD, 15));
        macNumberLabel.setForeground(Color.WHITE);
        macNumberLabel.setHorizontalAlignment(SwingConstants.CENTER);
        macNumberLabel.setVerticalAlignment(SwingConstants.CENTER);


        namField.setBounds(50, 150, 400, 30);
        // Add event listeners for input validation
        namField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (!Character.isLetter(e.getKeyChar()) && e.getKeyChar() != KeyEvent.VK_SPACE) {
                    e.consume(); // Ignore non-letter characters and spaces
                }
            }
            @Override
            public void keyPressed(KeyEvent e) {}

            @Override
            public void keyReleased(KeyEvent e) {}
        });
        ageField.setBounds(50, 190, 400, 30);
        ageField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (!Character.isDigit(e.getKeyChar())) {
                    e.consume(); // Ignore non-digit characters
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {}

            @Override
            public void keyReleased(KeyEvent e) {}
        });

        jambField.setBounds(50, 230, 400, 30);
        jambField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (!Character.isDigit(e.getKeyChar())) {
                    e.consume(); // Ignore non-digit characters
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {}

            @Override
            public void keyReleased(KeyEvent e) {}
        });

        // Payment field
        paymentField.setBounds(50, 310, 200, 30);
        paymentField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (!Character.isDigit(e.getKeyChar())) {
                    e.consume(); // Ignore non-digit characters
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {}

            @Override
            public void keyReleased(KeyEvent e) {}
        });

        //apply btn
        applyBtn.setBounds(180, 380, 100, 30);
        applyBtn.setBackground(new Color(100, 200, 250));
        applyBtn.setForeground(Color.black);
        applyBtn.setSize(100, 30);
        applyBtn.setFont(applyBtn.getFont().deriveFont(Font.BOLD, 15));

        applyBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nameInput = namField.getText();
                    String courseApplied = cybBtn.getText();
                    LocalDate currentDate = LocalDate.now();
                    LocalTime currentTime = LocalTime.now();



                    int paymentInput =Integer.parseInt(paymentField.getText());
                    int ageInput = Integer.parseInt(ageField.getText());
                    int jambScoreInput = Integer.parseInt(jambField.getText());

                    if (ageInput < 17) {
                        JOptionPane.showMessageDialog(frame2, "Too young to apply.");
                    } else if (jambScoreInput < 190) {
                        JOptionPane.showMessageDialog(frame2, "Not eligible to apply.");
                    } else {
                        // Process the application
                        JOptionPane.showMessageDialog(frame2, "Congratulations, your application has been processed " +" "+ nameInput);

                        String macNumber = generateMacNumber();
                        macNumberLabel.setText("Your Mac number is: " + macNumber);


                        try (FileWriter fileWriter = new FileWriter("application.txt")) {
                            fileWriter.write(enrollmentDetails.toString());
                        } catch (IOException exception) {
                            JOptionPane.showMessageDialog(null, "Error writing the file!");
                        }
                        // Write the application details to a file
                        FileWriter fileWriter = new FileWriter("application.txt",true);
                        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);


                        bufferedWriter.write("\nDate: " + currentDate );
                        bufferedWriter.write("\nTime: " + currentTime );
                        bufferedWriter.write("\nName: " + nameInput);
                        bufferedWriter.write("\nAge: " + ageInput);
                        bufferedWriter.write("\nJAMB Score: " + jambScoreInput);
                        bufferedWriter.write("\n Course applied for:" + courseApplied);
                        bufferedWriter.write("\nfees paid: " + paymentInput);
                        bufferedWriter.write("\n Mac Number: " + macNumber); // Write the MAC number to the file
                        bufferedWriter.write("\n "); // Write the MAC number to the file


                        bufferedWriter.close();

                        // Read the application details from the file
                        FileReader fileReader = new FileReader("application.txt");
                        BufferedReader bufferedReader = new BufferedReader(fileReader);


                        String line;
                        while ((line = bufferedReader.readLine()) != null) {
                            System.out.println(line);
                        }

                        bufferedReader.close();
                    }
                } catch (NumberFormatException exception) {
                    JOptionPane.showMessageDialog(null, "Invalid input!");
                } catch (IOException exception) {
                    JOptionPane.showMessageDialog(null, "Error writing or reading the file!");
                }
            }
        });



        // Pay button
        payBtn.setBounds(260, 310, 80, 30);
        payBtn.setBackground(new Color(100, 200, 250));
        payBtn.setForeground(Color.black);
        payBtn.setSize(80, 30);
        payBtn.setFont(payBtn.getFont().deriveFont(Font.BOLD, 12));

        payBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            //   int jambInput=Integer.parseInt(jambField.getText());
                int paymentInput = Integer.parseInt(paymentField.getText());
                int requiredFees = 880000;
                double minimumPayment = 0.7 * requiredFees;
                if (paymentInput>requiredFees){
                    JOptionPane.showMessageDialog(frame2,"this is greater than the required school fees");
                }
                else if (paymentInput >= minimumPayment) {
                    JOptionPane.showMessageDialog(frame2, "you have paid successfully.");

                } else {
                    JOptionPane.showMessageDialog(frame2, "Payment must be at least 70% of the required school fees.");
                }




                }

        });




        frame2.add(schoolFeesLabel);
        frame2.add(durationLabel);
        frame2.add(jambScoreLabel);
        frame2.add(namField);
        frame2.add(ageField);
        frame2.add(jambField);
        frame2.add(applyBtn);
        frame2.add(paymentField);
        frame2.add(payBtn);
        frame2.add(macNumberLabel);



        frame2.setMinimumSize(new Dimension(500, 700));
        frame2.getContentPane().setBackground(new Color(0, 0, 139));
        frame2.setMinimumSize(new Dimension(500, 700));// precized size of frame

        frame2.getContentPane().setLayout(null); // Set layout to null for absolute positioning

        frame2.setLocationRelativeTo(null);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setVisible(true);

    }
//    public void displayEnrollments() {
//        System.out.println("Enrollment Information:");
//        System.out.println(enrollmentDetails.toString());
//    }
    private String generateMacNumber() {
        // Implement your logic to generate a unique MAC number
        // For example, you can use a  random number
        int random = (int) (Math.random() * 900000) + 100000;
        return "Mac Num-" +  random;
    }


}

