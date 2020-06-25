package testbac;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Quiz2 implements ActionListener {

    String[] questions = {"Cine este protagonistul basmului?",
            "Câți fii are Craiul?",
            };

    String[][] options = {{"mezinul Craiului", "Spânul", "Craiul", "Împăratul Verde"},
            {"un singur fiu", "trei fii", "doi fii", "Craiul nu are copii"},
            };

    char[] answers = {'A', 'B'};

    String[] feedback = {"Harap Alb, fiul Craiului și mezinul familiei este personajul principal, a cărui evoluție este urmărită în basm.",
            "Craiul are trei fii. Harap-Alb este cel mai mic dintre aceștia.",
            };
    char guess;
    char answer;
    char index;
    int correct_guesses = 0;
    int total_question = questions.length;
    int result;
    int seconds = 15;

    private final Object GridBagLayout = new GridBagLayout();
    private final Object BorderLayout = new BorderLayout();

    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JTextField textField = new JTextField();
    JTextArea textarea = new JTextArea();
    JTextArea esaayArea = new JTextArea();
    JTextArea textFeedback = new JTextArea();
    JButton buttonA = new JButton();
    JButton buttonB = new JButton();
    JButton buttonC = new JButton();
    JButton buttonD = new JButton();
    JButton essayButton = new JButton();
    JLabel essay_label = new JLabel();
    JLabel answer_labelA = new JLabel();
    JLabel answer_labelB = new JLabel();
    JLabel answer_labelC = new JLabel();
    JLabel answer_labelD = new JLabel();
    JLabel time_label = new JLabel();
    JLabel seconds_left = new JLabel();
    JTextField number_right = new JTextField();
    JTextField percentage = new JTextField();

    Timer timer = new Timer(2000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            seconds--;
            seconds_left.setText(String.valueOf(seconds));
            if (seconds <= 0) {
                displayAnswer();
            }
        }
    });

    public Quiz2() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200, 750);
        frame.getContentPane().setBackground(new Color(224, 224, 224));
        frame.setLayout(null);
        frame.setResizable(true);

        panel.setLayout( new BorderLayout());


        textField.setBounds(0, 0, 1200, 50);
        textField.setBackground(new Color(255, 255, 255));
        textField.setForeground(new Color(0, 0, 0));
        textField.setFont(new Font("Ink free", Font.BOLD, 30));
        textField.setBorder(BorderFactory.createBevelBorder(1));
        textField.setHorizontalAlignment(JTextField.CENTER);
        textField.setEditable(false);


        textarea.setBounds(0, 100, 1200, 100);
        textarea.setLineWrap(true);
        textarea.setWrapStyleWord(true);
        textarea.setBackground(new Color(255, 255, 255));
        textarea.setForeground(new Color(0, 0, 0));
        textarea.setFont(new Font("MV Boli", Font.BOLD, 20));
        textarea.setAlignmentX(Component.CENTER_ALIGNMENT);
        textarea.setBorder(BorderFactory.createBevelBorder(1));
        textarea.setEditable(false);

        esaayArea.setBounds(0, 0, 1200, 7500);
        esaayArea.setLineWrap(true);
        esaayArea.setWrapStyleWord(true);
        esaayArea.setBackground(new Color(255, 255, 255));
        esaayArea.setForeground(new Color(0, 0, 0));
        esaayArea.setFont(new Font("MV Boli", Font.BOLD, 10));
        esaayArea.setAlignmentX(Component.CENTER_ALIGNMENT);
        esaayArea.setBorder(BorderFactory.createBevelBorder(1));
        esaayArea.setEditable(false);
        esaayArea.setText("blablablablabla");

        textFeedback.setBounds(0, 650, 1200, 100);
        textFeedback.setLineWrap(true);
        textFeedback.setWrapStyleWord(true);
        textFeedback.setBackground(new Color(255, 255, 255));
        textFeedback.setForeground(new Color(0, 0, 0));
        textFeedback.setFont(new Font("MV Boli", Font.BOLD, 20));
        textFeedback.setAlignmentX(Component.CENTER_ALIGNMENT);
        textFeedback.setBorder(BorderFactory.createBevelBorder(1));
        textFeedback.setEditable(false);

        buttonA.setBounds(20, 250, 100, 100);
        buttonA.setFont(new Font("MV Boli", Font.BOLD, 20));
        buttonA.setFocusable(false);
        buttonA.addActionListener(this);
        buttonA.setText("A");

        buttonB.setBounds(20, 350, 100, 100);
        buttonB.setFont(new Font("MV Boli", Font.BOLD, 20));
        buttonB.setFocusable(false);
        buttonB.addActionListener(this);
        buttonB.setText("B");

        buttonC.setBounds(20, 450, 100, 100);
        buttonC.setFont(new Font("MV Boli", Font.BOLD, 20));
        buttonC.setFocusable(false);
        buttonC.addActionListener(this);
        buttonC.setText("C");

        buttonD.setBounds(20, 550, 100, 100);
        buttonD.setFont(new Font("MV Boli", Font.BOLD, 20));
        buttonD.setFocusable(false);
        buttonD.addActionListener(this);
        buttonD.setText("D");

        answer_labelA.setBounds(145, 250, 500, 100);
        answer_labelA.setBackground(new Color(224, 224, 224));
        answer_labelA.setForeground(new Color(0, 0, 0));
        answer_labelA.setFont(new Font("MV Boli", Font.PLAIN, 20));

        answer_labelB.setBounds(145, 350, 500, 100);
        answer_labelB.setBackground(new Color(224, 224, 224));
        answer_labelB.setForeground(new Color(0, 0, 0));
        answer_labelB.setFont(new Font("MV Boli", Font.PLAIN, 20));

        answer_labelC.setBounds(145, 450, 500, 100);
        answer_labelC.setBackground(new Color(224, 224, 224));
        answer_labelC.setForeground(new Color(0, 0, 0));
        answer_labelC.setFont(new Font("MV Boli", Font.PLAIN, 20));

        answer_labelD.setBounds(145, 550, 500, 100);
        answer_labelD.setBackground(new Color(224, 224, 224));
        answer_labelD.setForeground(new Color(0, 0, 0));
        answer_labelD.setFont(new Font("MV Boli", Font.PLAIN, 20));

        seconds_left.setBounds(1000, 550, 150, 80);
        seconds_left.setBackground(new Color(224, 224, 224));
        seconds_left.setForeground(new Color(255, 0, 0));
        seconds_left.setFont(new Font("Ink Free", Font.BOLD, 50));
        seconds_left.setBorder(BorderFactory.createBevelBorder(1));
        seconds_left.setOpaque(true);
        seconds_left.setHorizontalAlignment(JTextField.CENTER);
        seconds_left.setText(String.valueOf(seconds));

        time_label.setBounds(1000, 500, 150, 25);
        time_label.setBackground(new Color(224, 224, 224));
        time_label.setForeground(new Color(255, 0, 0));
        time_label.setFont(new Font("MV Boli", Font.PLAIN, 20));
        time_label.setHorizontalAlignment(JTextField.CENTER);
        time_label.setText("Timp ramas");

        essayButton.setBounds(550, 550, 100, 100);
        essayButton.setFont(new Font("MV Boli", Font.BOLD, 20));
        essayButton.setFocusable(false);
        essayButton.addActionListener(this);
        essayButton.setText("Eseu");
        essayButton.setEnabled(false);

        essay_label.setBounds(650, 650, 200, 100);
        essay_label.setBackground(new Color(50, 50, 50));
        essay_label.setForeground(new Color(25, 255, 0));
        essay_label.setFont(new Font("MV Boli", Font.PLAIN, 20));
        essay_label.setText("arata-mi eseul");

        number_right.setBounds(225, 225, 200, 100);
        number_right.setBackground(new Color(25, 25, 25));
        number_right.setForeground(new Color(25, 255, 0));
        number_right.setFont(new Font("Ink Free", Font.BOLD, 50));
        number_right.setBorder(BorderFactory.createBevelBorder(1));
        number_right.setHorizontalAlignment(JTextField.CENTER);
        number_right.setEditable(false);

        percentage.setBounds(225, 325, 200, 100);
        percentage.setBackground(new Color(25, 25, 25));
        percentage.setForeground(new Color(25, 255, 0));
        percentage.setFont(new Font("Ink Free", Font.BOLD, 50));
        percentage.setBorder(BorderFactory.createBevelBorder(1));
        percentage.setHorizontalAlignment(JTextField.CENTER);
        percentage.setEditable(false);

        frame.add(time_label);
        frame.add(seconds_left);
        frame.add(answer_labelA);
        frame.add(answer_labelB);
        frame.add(answer_labelC);
        frame.add(answer_labelD);
        frame.add(buttonA);
        frame.add(buttonB);
        frame.add(buttonC);
        frame.add(buttonD);
        frame.add(textField);
        frame.add(textFeedback);
        frame.add(textField);
        frame.add(textarea);
        frame.setVisible(true);

        nextQuestion();
    }

    public void nextQuestion() {
        if (index >= total_question) {
            results();
        } else {
            textField.setText("Intrebarea numarul " + (index + 1));
            textarea.setText(questions[index]);
            answer_labelA.setText(options[index][0]);
            answer_labelB.setText(options[index][1]);
            answer_labelC.setText(options[index][2]);
            answer_labelD.setText(options[index][3]);
            timer.start();
        }
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        buttonA.setEnabled(false);
        buttonB.setEnabled(false);
        buttonC.setEnabled(false);
        buttonD.setEnabled(false);
        essayButton.setEnabled(true);
        if (actionEvent.getSource() == buttonA) {
            answer = 'A';
            if (answer == answers[index]) {
                correct_guesses++;
            }
        }

        if (actionEvent.getSource() == buttonB) {
            answer = 'B';
            if (answer == answers[index]) {
                correct_guesses++;
            }
        }

        if (actionEvent.getSource() == buttonC) {
            answer = 'C';
            if (answer == answers[index]) {
                correct_guesses++;
            }
        }
        if (actionEvent.getSource() == buttonD) {
            answer = 'D';
            if (answer == answers[index]) {
                correct_guesses++;
            }
        }

        displayAnswer();

        if (actionEvent.getSource() == essayButton) {
            showEssay();
        }
    }

    public void displayAnswer() {
        int t=0;
        timer.stop();
        if (answer!=answers[index]){
            textFeedback.setText(feedback[index]);
            t=6500;

        }else{
            textFeedback.setText("Răspuns corect!");
            t=2000;
        }

        buttonA.setEnabled(false);
        buttonB.setEnabled(false);
        buttonC.setEnabled(false);
        buttonD.setEnabled(false);

        if (answers[index] != 'A') {
            answer_labelA.setForeground(new Color(255, 0, 0));
        }
        if (answers[index] != 'B') {
            answer_labelB.setForeground(new Color(255, 0, 0));
        }
        if (answers[index] != 'C') {
            answer_labelC.setForeground(new Color(255, 0, 0));
        }
        if (answers[index] != 'D') {
            answer_labelD.setForeground(new Color(255, 0, 0));
        }

        Timer pause = new Timer(t, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                answer_labelA.setForeground(new Color(0, 0, 0));
                answer_labelB.setForeground(new Color(0, 0, 0));
                answer_labelC.setForeground(new Color(0, 0, 0));
                answer_labelD.setForeground(new Color(0, 0, 0));
                textFeedback.setText("");

                answer = ' ';
                seconds = 15;
                seconds_left.setText(String.valueOf(seconds));
                buttonA.setEnabled(true);
                buttonB.setEnabled(true);
                buttonC.setEnabled(true);
                buttonD.setEnabled(true);
                essayButton.setEnabled(true);
                index++;
                nextQuestion();
            }
        }
        );
        pause.setRepeats(false);
        pause.start();
    }

    public void results() {
        buttonA.setEnabled(false);
        buttonB.setEnabled(false);
        buttonC.setEnabled(false);
        buttonD.setEnabled(false);
        result = (int) ((correct_guesses / (double) total_question) * 100);
        textField.setText("Punctaj: ");
        textarea.setText("Acestea sunt rezultatele dumneavoastra");
        answer_labelA.setText("");
        answer_labelB.setText("");
        answer_labelC.setText("");
        answer_labelD.setText("");

        number_right.setText("(" + correct_guesses + "/" + total_question + ")");
        percentage.setText(result + "%");
        frame.add(number_right);
        frame.add(percentage);
        frame.add(essayButton);

    }

    public void showEssay(){

        frame.add(esaayArea);
    }
}
