import java.awt.Frame;
import java.awt.Color;
import java.awt.Button;
import java.awt.TextField;
import java.awt.Label;
import java.awt.Font;
import java.awt.event.*;
class  MyFrame extends Frame implements ActionListener
{
	
	
	private Button b;
	private Button b1;
	private Button b2;

	private TextField t;

	private Label l;

	public MyFrame(String titolo){

		super(titolo);

		this.setLayout(null);




		this.setVisible(true);
		this.setSize(500,400);
		this.setLocation(500,180);
		this.setBackground(Color.red);

		b=new Button("CHIUDI");
		b.setSize(70,30);
		b.setLocation(130,230);
		b.addActionListener(this);

		b1=new Button("INVIO");
		b1.setSize(70,30);
		b1.setLocation(230,230);
		b1.addActionListener(this);

		b2=new Button("AZZERA");
		b2.setSize(70,30);
		b2.setLocation(320,230);
		b2.addActionListener(this);


		t=new TextField();
		t.setSize(80,30);
		t.setLocation(200,180);

		l=new Label("INSERISCI PIN");
		l.setFont(new Font("Arial",Font.BOLD,22));
		l.setSize(150,60);
		l.setLocation(180,120);



		add(b);
		add(b1);
		add(b2);
		add(t);
		add(l);

	}

	public void actionPerformed(ActionEvent e){
		

				if (e.getSource()==b)
				{

					System.exit(0);
				}



				

	
	
	
		}
}
