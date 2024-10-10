package main;

import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;

import modelo.Estudiante;
import modelo.Materias;

import java.awt.FlowLayout;
import javax.swing.JList;
import java.awt.GridLayout;
import java.awt.CardLayout;
import java.awt.BorderLayout;
import javax.swing.JTable;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.event.ListSelectionEvent;

public class ventana {

	private JFrame frame;
	private JTable table;
	private JPanel panel;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Object[][]datos= {
				{"1","Pedro","ertb",Materias.Biologia},
				{"2","antonio","erh",Materias.Fisica},
				{"3","juan","wrgt",Materias.Biologia},
				{"4","perco","rtgw",Materias.Fisica},
				{"5","contran","retbet",Materias.LenguaEspañola},
				{"6","cdv","erthe",Materias.Fisica},
				{"7","dte","erthe",Materias.LenguaEspañola},
				{"8","Pedrertheto","erthet",Materias.Fisica},
		};
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana window = new ventana();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ventana() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 559, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		frame.setResizable(false);
		DefaultListModel model = new DefaultListModel<>();
		JList<Materias> list = new JList<>(model);
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				
				Materias m =(Materias)list.getSelectedValue();
				if(m==Materias.Biologia ) {
					
				}
			}
		});
		for(Materias m : Materias.values()) {
			model.addElement(m);
			
		}
		
		frame.getContentPane().add(list, BorderLayout.WEST);
		
		//la tabla
		
		//encabezados
		String[] columnas= {"Id","Nombre","Apellido","Nota"	};
		//lista de objetos dentro de la tabla
		 Object[][]datos= {
				{"1","Pedro","ertb",Materias.Biologia},
				{"2","antonio","erh",Materias.Fisica},
				{"3","juan","wrgt",Materias.Biologia},
				{"4","perco","rtgw",Materias.Fisica},
				{"5","contran","retbet",Materias.LenguaEspañola},
				{"6","cdv","erthe",Materias.Fisica},
				{"7","dte","erthe",Materias.LenguaEspañola},
				{"8","Pedrertheto","erthet",Materias.Fisica},
		};
		//hacemos el modelo donde van los datos
		DefaultTableModel modelo = new DefaultTableModel(datos,columnas);
		
		//a la tabla al final debemos pasarle al argumento del modelo
		table = new JTable(modelo);
		//y le damos en scroll a la propia tabla
		frame.getContentPane().add(table, BorderLayout.EAST);
		//JScrollPane scroll= new JScrollPane(table);
		
		panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.SOUTH);
		
		btnNewButton = new JButton("New button");
		panel.add(btnNewButton);
		
		btnNewButton_1 = new JButton("New button");
		panel.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("New button");
		panel.add(btnNewButton_2);
	}

}
