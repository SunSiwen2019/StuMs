package System;

import java.util.ArrayList;
import java.util.Scanner;
public class visionSys {
	
	ArrayList<Student> informationSys = new ArrayList<Student>();
	public Scanner in = new Scanner(System.in);

	// add elements
	public  void add() {
	Student student = new Student();
	System.out.println("please input the ID");
	student.setID(in.nextInt());
	System.out.println("please input the name");
	student.setname(in.next());
	System.out.println("please input the classnum");
	student.setclassnum(in.nextInt());
	System.out.println("please input the phonenum");
	student.setphonenum(in.nextBigInteger());
	informationSys.add(student);
	System.out.println("succeed");

	}


// find and remove
	public void find() {
		System.out.println("please input the ID of the student you want to find");
		int ID = in.nextInt();
		boolean findornot = false;
		int i=0;
		for(;i<informationSys.size();i++) {
			Student temp = informationSys.get(i);
			if(ID==temp.getID()) {
				findornot = true;
				break;
			}
		}
		
		if (findornot) {
			System.out.println("studentID : " + informationSys.get(i).getID());
			System.out.println("studentName : " + informationSys.get(i).getname());
			System.out.println("studentClassnum : " + informationSys.get(i).getclassnum());
			System.out.println("studentPhonenum : " + informationSys.get(i).getphonenum());
		}
		else {
			System.out.println("no exist");
		}
		System.out.println("what do you want to do  1--remove or alter / 2--nothing");
		int choose = in.nextInt();
		if(choose==1) {
			alter(i);
		}
		
	}
	
	public void alter(int i) {
		System.out.println("what do you want to do  1--alter / 2--remove");
		int choose = in.nextInt();
		switch(choose) {
		case 1 : add();
		case 2 : informationSys.remove(i);
		}
		System.out.println("succeed");
	}
	
	public void list() {
		for(int i = 0;i<informationSys.size();i++) {
			System.out.println("studentID : " + informationSys.get(i).getID());
			System.out.println("studentName : " + informationSys.get(i).getname());
			System.out.println("studentClassnum : " + informationSys.get(i).getclassnum());
			System.out.println("studentPhonenum : " + informationSys.get(i).getphonenum());
			System.out.println("*******************************");
		}
}
	
	public void display()
    {
        System.out.println("***************************************");
        System.out.println("****     高校学习信息管理系统     *****");
        System.out.println("****       1：添加学生信息         ****");
        System.out.println("****       2：查询学生信息         ****");
        System.out.println("****       3：修改学生信息         ****");
        System.out.println("****       4：删除学生信息         ****");
        System.out.println("****       5：打印学生信息         ****");
        System.out.println("****       6：退出                 ****");
        System.out.println("****   请输入您要进行的操作（1-6）  ***");
    }
	public static void main(String[] args) {
		 boolean flat = true;
		  visionSys test = new visionSys();
		 while (flat)
	        {
	          
	           test.display();
	           Scanner sc = new Scanner(System.in);
	           int number = sc.nextInt();
	            switch (number)
	            {
	                case 1:
	                {
	                    test.add();
	                    break;
	                }
	                case 2:
	                {
	                    test.find();
	                    break;
	                }
	                case 3:
	                {
	                	test.find();
	                    break;
	                }
	                case 4:
	                {
	                	test.find();
	                    break;
	                }
	                case 5:
	                {
	                	test.list();
	                    break;
	                }
	                case 6:
	                {
	                    System.out.println("Bye!");
	                    flat=false;
	                    break;
	                }
	            }
	        }
		
	}

}
