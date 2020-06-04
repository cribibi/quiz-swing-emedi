package emedi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Quiz1 implements ActionListener {

    String[] questions = {"Cine este protagonistul basmului?",
            "Cati fii are Craiul?",
            "Care este avertismentul Craiului la plecarea mezinului?",
            "In ce consta proba Craiului pentru fiii sai?",
    "Cine îi dă protagonistului numele de Harap-Alb?",
            "Regina albinelor îl ajută pe Harap-Alb să...",
            "Din grădina ursului, protagonistul trebuie să aducă…",
            "Ce obiecte își însușește Spânul de la mezin?",
            "Pentru a încheia jurământul, ce gest trebuie să facă Harap-Alb?",
            "Cine îl sfătuieşte pe Harap- Alb să ceară hainele, armele şi calul de când era mire tatăl său, înainte de a porni în călătorie?"
    };

    String[][] options = {{"mezinul Craiului", "Spanul", "Craiul", "Imparatul Verde"},
            {"un singur fiu", "trei fii", "doi fii", "Craiul nu are copii"},
            {"sa se fereasca de Span", "sa nu calatoreasca dupa apus", "sa se fereasca de imparatul Rosu", "sa se odihneasca regulat"},
            {"sa se costumeze in urs si sa ii sperie", "o proba de viteza", "ii pune sa aleaga calul potrivit", "sa aleaga armele potrivite"},
            {"tatal sau", "Spanul", "Verde-Imparat", "fiica imparatului Ros"},
            {"sa separe nisipul", "sa o recunoasca pe fiica impartului Ros", "sa aduca apa vie si moarta", "sa se lupte cu balaurul"},
            {"pielea cerbului cu nestemate", "apa moarta", "salata", "apa vie"},
            {"hainele si calul", "cartea(scrisoarea) si armele", "bijuteriile", "banii"},
            {"sa dea mana cu Spanul", "sa semneze un act", "sa sarute palosul", "sa isi schimbe hainele"},
            {"Craiul", "Sfanta Duminica", "Fratele mai mare", "Calul"}};

    char[] answers = {'A', 'B', 'A', 'A', 'B', 'B', 'C', 'B', 'C','B' };
    String [] feedback ={"Harap Alb, fiul Craiului și mezinul familiei este personajul principal, a cărui evoluție este urmărită în basm.",
    "Craiul are trei fii. Harap-Alb este cel mai mic dintre aceștia.",
    "La plecarea fiului cel mic în călătorie, Craiul îl sfătuieș te să nu între în contact cu Omul\n" +
            "Span, și să se ferească de Împăratul Roșu, pentru a nu avea probleme din care nu va mai\n" +
            "putea ieși.",
    "Pentru a testa curajul și iscusința fiilor sai, Craiul se costumează în pielea de urs și îi sperie\n" +
            "pe cei 3 fii. Singurul care izbuteș te este Mezinul, cel care va continua și călătoria",
    "Scena coborârii în fântână are ș i semnificaț iile profunde ale unui botez, fiind momentul în\n" +
            "care protagonistul primeș te un nume de la Spân, completând, astfel, noul statut.",
    "În schimbul ajutorului oferit de protagonist albinelor, acestea îi promit lui Harap-Alb ajutor\n" +
            "la nevoie. Astfel, Regina Albinelor îl ajuta să o deosebească pe fiica împăratului de cea\n" +
            "vitregă, deși cele două aveau înfățișări asemănătoare.",
    "Una dintre probele la care Spânul îl supune pe Harap-Alb este aceea de a aduce salată din\n" +
            "grădina ursului.",
    "După ce Spânul preia statutul mezinului, acesta își  însușește cartea (scrisoarea Craiului care\n" +
            "dovedește identitatea portagonistului), banii și armele .",
    "Încheierea jurământului mezinului este marcat de sărutarea paloșului. Acest gest este unul\n" +
            "reprezentativ perioadei medievale, aminteș te de noblețea cavalerească, și reprezintă\n" +
            "garanția că nu îl va încălca.",
    "Sfânta Duminică este cea care îi oferă ajutor mezinului, astfel încât să nu urmeze eșecurile\n" +
            "fraților săi. Ea apare metamorfozată într-o bătrână cerșetoare, pentru a pune la încercare\n" +
            "mila și bunătatea protagonistului. După ce acesta îi demonstrează aceste calități, bătrâna îl\n" +
            "ajută."};
    char guess;
    char answer;
    char index;
    int correct_guesses = 0;
    int total_question = questions.length;
    int result;
    int seconds = 15;
    JFrame frame = new JFrame();
    JTextField textField = new JTextField();
    JTextArea textarea = new JTextArea();
    JTextArea textFeedback = new JTextArea();
    JButton buttonA = new JButton();
    JButton buttonB = new JButton();
    JButton buttonC = new JButton();
    JButton buttonD = new JButton();
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
            if (seconds<=0){
                displayAnswer();
            }
        }
    });


    public Quiz1() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200, 750);
        frame.getContentPane().setBackground(new Color(50, 50, 50));
        frame.setLayout(null);
        frame.setResizable(false);

        textField.setBounds(0, 0, 1200, 50);
        textField.setBackground(new Color(25, 25, 25));
        textField.setForeground(new Color(25, 255, 0));
        textField.setFont(new Font("Ink free", Font.BOLD, 30));
        textField.setBorder(BorderFactory.createBevelBorder(1));
        textField.setHorizontalAlignment(JTextField.CENTER);
        textField.setEditable(false);

        textarea.setBounds(0, 100, 1200, 100);
        textarea.setLineWrap(true);
        textarea.setWrapStyleWord(true);
        textarea.setBackground(new Color(25, 25, 25));
        textarea.setForeground(new Color(25, 255, 0));
        textarea.setFont(new Font("MV Boli", Font.BOLD, 20));
        textarea.setAlignmentX(Component.CENTER_ALIGNMENT);
        textarea.setBorder(BorderFactory.createBevelBorder(1));
        textarea.setEditable(false);

        textFeedback.setBounds(0, 650, 1200, 100);
        textFeedback.setLineWrap(true);
        textFeedback.setWrapStyleWord(true);
        textFeedback.setBackground(new Color(25, 25, 25));
        textFeedback.setForeground(new Color(25, 255, 0));
        textFeedback.setFont(new Font("MV Boli", Font.BOLD, 30));
        textFeedback.setAlignmentX(Component.CENTER_ALIGNMENT);
        textFeedback.setBorder(BorderFactory.createBevelBorder(1));
        textFeedback.setEditable(false);

        buttonA.setBounds(0, 250, 100, 100);
        buttonA.setFont(new Font("MV Boli", Font.BOLD, 20));
        buttonA.setFocusable(false);
        buttonA.addActionListener(this);
        buttonA.setText("A");

        buttonB.setBounds(0, 350, 100, 100);
        buttonB.setFont(new Font("MV Boli", Font.BOLD, 20));
        buttonB.setFocusable(false);
        buttonB.addActionListener(this);
        buttonB.setText("B");

        buttonC.setBounds(0, 450, 100, 100);
        buttonC.setFont(new Font("MV Boli", Font.BOLD, 20));
        buttonC.setFocusable(false);
        buttonC.addActionListener(this);
        buttonC.setText("C");

        buttonD.setBounds(0, 550, 100, 100);
        buttonD.setFont(new Font("MV Boli", Font.BOLD, 20));
        buttonD.setFocusable(false);
        buttonD.addActionListener(this);
        buttonD.setText("D");

        answer_labelA.setBounds(125, 250, 500, 100);
        answer_labelA.setBackground(new Color(50, 50, 50));
        answer_labelA.setForeground(new Color(25, 255, 0));
        answer_labelA.setFont(new Font("MV Boli", Font.PLAIN, 20));

        answer_labelB.setBounds(125, 350, 500, 100);
        answer_labelB.setBackground(new Color(50, 50, 50));
        answer_labelB.setForeground(new Color(25, 255, 0));
        answer_labelB.setFont(new Font("MV Boli", Font.PLAIN, 20));

        answer_labelC.setBounds(125, 450, 500, 100);
        answer_labelC.setBackground(new Color(50, 50, 50));
        answer_labelC.setForeground(new Color(25, 255, 0));
        answer_labelC.setFont(new Font("MV Boli", Font.PLAIN, 20));

        answer_labelD.setBounds(125, 550, 500, 100);
        answer_labelD.setBackground(new Color(50, 50, 50));
        answer_labelD.setForeground(new Color(25, 255, 0));
        answer_labelD.setFont(new Font("MV Boli", Font.PLAIN, 20));

        seconds_left.setBounds(1000, 550, 100, 100);
        seconds_left.setBackground(new Color(25, 25, 25));
        seconds_left.setForeground(new Color(255, 0, 0));
        seconds_left.setFont(new Font("Ink Free", Font.BOLD, 60));
        seconds_left.setBorder(BorderFactory.createBevelBorder(1));
        seconds_left.setOpaque(true);
        seconds_left.setHorizontalAlignment(JTextField.CENTER);
        seconds_left.setText(String.valueOf(seconds));

        time_label.setBounds(1000, 500, 100, 25);
        time_label.setBackground(new Color(50, 50, 50));
        time_label.setForeground(new Color(255, 0, 0));
        time_label.setFont(new Font("MV Boli", Font.PLAIN, 20));
        time_label.setHorizontalAlignment(JTextField.CENTER);
        time_label.setText("timer");

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
    }

    public void displayAnswer() {
        timer.stop();
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
        textFeedback.setText(feedback[index]);


        Timer pause = new Timer(2000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                answer_labelA.setForeground(new Color(25, 255, 0));
                answer_labelB.setForeground(new Color(25, 255, 0));
                answer_labelC.setForeground(new Color(25, 255, 0));
                answer_labelD.setForeground(new Color(25, 255, 0));
                textFeedback.setText("");


                answer= ' ';
                seconds=15;
                seconds_left.setText(String.valueOf(seconds));
                buttonA.setEnabled(true);
                buttonB.setEnabled(true);
                buttonC.setEnabled(true);
                buttonD.setEnabled(true);
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
        result = (int)((correct_guesses/(double)total_question)*100);
        textField.setText("Rezultate: ");
        textarea.setText("");
        answer_labelA.setText("");
        answer_labelB.setText("");
        answer_labelC.setText("");
        answer_labelD.setText("");

        number_right.setText("("+correct_guesses+"/"+total_question+")");
        percentage.setText(result+"%");
        frame.add(number_right);
        frame.add(percentage);


    }
}
