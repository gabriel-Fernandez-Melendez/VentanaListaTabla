package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import modelo.Materias;
import modelo.Estudiante;
import java.util.ArrayList;

import javax.swing.JList;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

public class Ventana {

	private JFrame frame;
	private JTable table;
	ArrayList<Estudiante>estudiantes = new ArrayList<Estudiante>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana window = new Ventana();
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
	public Ventana() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		
		
		
		
		
		
		
		
//panel de botones con botones		
		JPanel panel_botones = new JPanel();
		frame.getContentPane().add(panel_botones, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("New button");
		panel_botones.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		panel_botones.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		panel_botones.add(btnNewButton_2);
		String[] columnas= {"Id","Nombre","Apellido","Nota"	};
		
		//lista de objetos dentro de la tabla
		 Object[][]datos= {
				{"1","Pedro","ertb",Materias.Biologia.getNombrecurso()},
				{"2","antonio","erh",Materias.Fisica.getNombrecurso()},
				{"3","juan","wrgt",Materias.Biologia.getNombrecurso()},
				{"4","perco","rtgw",Materias.Fisica.getNombrecurso()},
				{"5","contran","retbet",Materias.LenguaEspañola.getNombrecurso()},
				{"6","cdv","erthe",Materias.Fisica.getNombrecurso()},
				{"7","dte","erthe",Materias.LenguaEspañola.getNombrecurso()},
				{"8","Pedrertheto","erthet",Materias.Fisica.getNombrecurso()},
		};
		 estudiantes.add(new Estudiante("1","wrtgwr","ertb","sdv",Materias.Biologia));
		 estudiantes.add(new Estudiante("1","wrgwrg","ertb","sdv",Materias.Biologia));
		 estudiantes.add(new Estudiante("1","Pedro","ertb","sdv",Materias.Fisica));
		 estudiantes.add(new Estudiante("1","wrgtwr","ertb","sdv",Materias.Fisica));
		 estudiantes.add(new Estudiante("1","Pedro","ertb","sdv",Materias.LenguaEspañola));
		 estudiantes.add(new Estudiante("1","wtbw","ertb","sdv",Materias.LenguaEspañola));
		 estudiantes.add(new Estudiante("1","wrgwg","ertb","sdv",Materias.Matematica));
		 estudiantes.add(new Estudiante("1","Pedro","ertb","sdv",Materias.Matematica));
		 DefaultTableModel modelo = new DefaultTableModel(datos,columnas);
		table = new JTable(modelo);
		frame.getContentPane().add(table, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.WEST);
		String[]clases= {
				Materias.Biologia.getNombrecurso(),
				Materias.Fisica.getNombrecurso(),
				Materias.LenguaEspañola.getNombrecurso(),
				Materias.Matematica.getNombrecurso(),
		};
		JList<String>list = new JList<>(clases);
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				String dato =list.getSelectedValue();
				//metodo creado ppara cambiar lo que se muestre si se da click a una materia
				cambiarComtenido(dato);
			}
		});
		panel.add(list);
		
		
		
		
	}
        private void cambiarComtenido(String materia) {
        	DefaultTableModel modificar_row = (DefaultTableModel) table.getModel();
        	modificar_row.setRowCount(0);
        	for(Estudiante es:estudiantes) {
        		if(es.getMateria().getNombrecurso() == materia) {
        			modificar_row.addRow(new Object[] {
        					es.getId(),
        					es.getNombre(),
        					es.getApellidos(),
        					es.getNota(),
        					es.getMateria().getNombrecurso()
        			});
        		}
        	}
		}
}
