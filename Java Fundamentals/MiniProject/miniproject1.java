class employee{
	int empno[]= {1001,1002,1003,1004,1005,1006,1007};
	String empname[]= {"As","sus","rah","cha","ran","sum","tan"};
	String date[]= {"01/04/2009","23/08/2012","12/11/2008","20/01/2013","16/07/2005","01/01/2000","12/06/2006"};
	String dcode[]= {"e","c","k","r","m","e","c"};
	String dept[]= {"R&D","PM","Acct","Front Desk","Engg","Manufacturing","PM"};
	int basic[]= {20000,30000,10000,12000,50000,23000,29000};
	int hra[]= {8000,12000,8000,6000,20000,9000,12000};
	int it[]= {3000,9000,1000,2000,20000,4400,10000};
	int DA[]= new int[7];
	String des[]=new String[7];
}

class da{
	String dcode[]= {"e","c","k","r","m"};
	String des[]= {"Engineer","Consultant","Clerk","receptionist","manager"};
	int DA[]= {20000,32000,12000,15000,40000};
}
public class miniproject1 {

	public static void main(String[] args) {
		employee em =new employee();
		da d=new da();
		int n=7;
		int sal[]=new int[n];
		
		/*
		for(int i=0;i<n;i++) {
			for(int j=0;j<d.dcode.length;j++) {
				if(em.dcode[i].equals(d.dcode[j])) {
					em.DA[i]=d.DA[j];
					em.des[i]=d.des[j];
					
				}
			}
		}
		*/
		
		 for (int i = 0; i < n; i++) {
	            switch (em.dcode[i]) {
	                case "e":
	                    em.des[i] = "Engineer";
	                    em.DA[i] = 20000;
	                    break;
	                case "c":
	                    em.des[i] = "Consultant";
	                    em.DA[i] = 32000;
	                    break;
	                case "k":
	                    em.des[i] = "Clerk";
	                    em.DA[i] = 12000;
	                    break;
	                case "r":
	                    em.des[i] = "Receptionist";
	                    em.DA[i] = 15000;
	                    break;
	                case "m":
	                    em.des[i] = "Manager";
	                    em.DA[i] = 40000;
	                    break;
	                default:
	                    em.des[i] = "NA";
	                    em.DA[i] = 0;
	            }
	        }
		 
		for(int i=0;i<n;i++) {
			sal[i]=(em.basic[i]+em.hra[i]+em.DA[i]-em.it[i]);
		}
		int flag=1;
		
		int num=Integer.parseInt(args[0]);
		
		for (int ele=0;ele<n;ele++) {
            if (em.empno[ele] == num) {
            	System.out.println("EmpNo. Emp Name Department Desination Salary");
            	System.out.print(em.empno[ele]+" "+em.empname[ele]+" "+em.dept[ele]+" "+em.des[ele]+" "+sal[ele]);
            	flag=0;
            	break;
            }
        }
		if (flag==1) {
			System.out.println("wrong");
		}
		
		

	}

}
