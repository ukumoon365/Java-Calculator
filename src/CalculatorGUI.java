import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

// GUI 클래스
public class CalculatorGUI extends JFrame implements ActionListener{
    // 버튼
    JButton clear;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0;
    JButton bDivision, bMultiply, bMinus, bPlus, bEqual;
    JButton bEmpty1, bEmpty2, bEmpty3, bEmpty4, bEmpty5;
    // 배치 관리자
    FlowLayout layout;

    // 한 줄 입력창
    JTextField textfield;

    // GUI 생성자
    public CalculatorGUI() {
        // 멤버 변수 초기화
        layout = new FlowLayout();
        clear = new JButton("    C    ");
        textfield = new JTextField(10);
        bPlus = new JButton("+");
        bMinus = new JButton("-");
        bMultiply = new JButton("*");
        bDivision = new JButton("÷");
        bEqual = new JButton("=");
        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        bEmpty1 = new JButton("•");
        bEmpty2 = new JButton("•");
        bEmpty3 = new JButton("•");
        bEmpty4 = new JButton("•");
        bEmpty5 = new JButton("•");
        // 감시자 설정
        clear.addActionListener(this);
        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        bPlus.addActionListener(this);
        bMinus.addActionListener(this);
        bMultiply.addActionListener(this);
        bDivision.addActionListener(this);
        bEqual.addActionListener(this);

        // GUI 화면에 추가
        this.add(textfield);
        this.add(clear);
        this.add(bEmpty1);
        this.add(bEmpty2);
        this.add(bEmpty3);
        this.add(bDivision);
        this.add(b7);
        this.add(b8);
        this.add(b9);
        this.add(bMultiply);
        this.add(b4);
        this.add(b5);
        this.add(b6);
        this.add(bMinus);
        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(bPlus);
        this.add(bEmpty4);
        this.add(b0);
        this.add(bEmpty5);
        this.add(bEqual);

        // GUI 설정
        this.setLayout(layout);
        this.setSize(235, 450);
        this.setLocation(1450, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    @Override // 버튼 클릭시 상호작용
    public void actionPerformed(ActionEvent e) {
        String buttonText = e.getActionCommand();

        if (buttonText.equals("    C    ")){
            textfield.setText("");
        } else{
            textfield.setText((textfield.getText() + buttonText));
        }
    }
}
