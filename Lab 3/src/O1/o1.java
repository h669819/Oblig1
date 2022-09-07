package O1;

import javax.swing.JOptionPane;

public class o1 {
	
	
	
	public static void main(String[] args) {
		
		String B = JOptionPane.showInputDialog("skriv inn din bruttoinntekt");
		
		int Br = Integer.parseInt(B);
		
		//prosentene til trinnskatten
		
		double p1 = 0.0093;
		
		double p2 = 0.0241;
		
		double p3 = 0.1152;
		
		double p4 = 0.1452;
		
		int t1 = 164100;
		
		int t2 = 230950;
		
		int t3 = 580650;
		
		int t4 = 934050;
		
		double ts1 = (t2-t1)*p1;
		
		double ts2 = (t3-t2)*p2;
		
		double ts3 = (t4-t3)*p3;
		
		
		if (Br > t4) {
			System.out.println("Din trinnskatt er " + (ts1 + ts2 + ts3 + (Br - t4)*p4));
		}else if (Br > t3) {
			System.out.println("Din trinnskatt er " + (ts1 + ts2 + (Br - t3)*p3));	
		}else if (Br > t2) {
			System.out.println("Din trinnskatt er " + (ts1 + (Br - t2)*p2));
		}else if (Br > t1) {
			System.out.println("Din trinnskatt er " + ((Br - t1)*p1)  );
		}else {
			System.out.println("Din trinnskatt er 0");
		}
	
			
	}	
			
	}

