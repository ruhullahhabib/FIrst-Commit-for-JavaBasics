package com.class23;

public class Test {

	public static void main(String[] args) {
		
		//grandfather
		Employee emp = new Employee ();
		System.out.println("--Creating employee object--");
		//access instance variables by object
		emp.salary= 90000;
		emp.getPaid();
		//only two values we can access
		System.out.println(Employee.department);
		//accessed static method without intializing, just used class name directly  
		Employee.work();
		System.out.println();
		
		//parent
		System.out.println("--Creating ScrumTeam object--");
		ScrumTeam st = new ScrumTeam();
		st.salary = 100000;
		st.getPaid();
		st.artifacts = "Product Backlog, Sprint Backlog, Burndown Chart";
		st.ceremonies = "Sprint grooming, Sprint planning, Daily StandUp, Sprint Demo, Sprint Retrospective";
		st.attendScrumMeetings();
		st.workOnArtifacts();
		System.out.println();
		
		//child
		System.out.println("--Creating Developer object--");
		Developer dev = new Developer();
		Developer.work();
		//inherited static work due to extends so we can access it with child class
		dev.salary = 120000;
		dev.getPaid();//comes from grandfather
		dev.artifacts= "Sprint Backlog";
		dev.ceremonies = "Sprint grooming, Sprint planning, Daily StandUp, Sprint Demo, Sprint Retrospective";
		dev.workOnArtifacts();
		dev.attendScrumMeetings();
		dev.code();
		System.out.println();
		
		System.out.println("--Creating Tester object--");
		Tester qa = new Tester();
		qa.salary = 100000;
		qa.getPaid();//comes from grandfather
		qa.artifacts= "Sprint Backlog";
		qa.ceremonies = "Sprint grooming, Sprint planning, Daily StandUp, Sprint Demo, Sprint Retrospective";
		qa.workOnArtifacts();
		qa.attendScrumMeetings();
		qa.test();
		System.out.println();
		
		System.out.println("--Creating BA object--");
		BA ba = new BA();
		ba.salary = 100000;
		ba.getPaid();//comes from grandfather
		ba.artifacts= "Sprint Backlog, Product Backlog";
		ba.ceremonies = "Sprint grooming, Sprint planning, Daily StandUp, Sprint Demo, Sprint Retrospective";
		ba.workOnArtifacts();
		ba.attendScrumMeetings();
		ba.writeUserStories();
		System.out.println();
		
		System.out.println("--Creating Scrum Master object--");
		ScrumMaster sm = new ScrumMaster();
		ScrumTeam.work();
		sm.salary = 90000;
		sm.getPaid();//comes from grandfather
		sm.artifacts= "Burndown Chart";
		sm.ceremonies = "Sprint grooming, Sprint planning, Daily StandUp, Sprint Demo, Sprint Retrospective";
		sm.workOnArtifacts();
		sm.attendScrumMeetings();
		sm.driveScrumMeeting();
		System.out.println();
		
		System.out.println("--Creating Product Owner object--");
		ProductOwner po = new ProductOwner();
		po.salary = 150000;
		po.getPaid();//comes from grandfather
		po.artifacts= "Sprint backlog, Product backlog";
		po.ceremonies = "Sprint grooming, Sprint planning, Daily StandUp, Sprint Demo, Sprint Retrospective";
		po.workOnArtifacts();
		po.attendScrumMeetings();
		po.prioritizeBacklog();
		po.talkToTheClient();
		System.out.println();
		
		//grandchild
		
		System.out.println("--Creating FrontEnd object--");
		FrontEnd fe = new FrontEnd();
		fe.salary = 100000;
		fe.getPaid();//comes from grandfather
		fe.artifacts= "Sprint Backlog";
		fe.ceremonies = "Sprint grooming, Sprint planning, Daily StandUp, Sprint Demo, Sprint Retrospective";
		fe.workOnArtifacts();
		fe.attendScrumMeetings();
		fe.code();
		fe.doHtml();
		System.out.println();
		
		System.out.println("--Creating BackEnd object--");
		BackEnd be = new BackEnd();
		be.salary = 100000;
		be.getPaid();//comes from grandfather
		be.artifacts= "Sprint Backlog";
		be.ceremonies = "Sprint grooming, Sprint planning, Daily StandUp, Sprint Demo, Sprint Retrospective";
		be.workOnArtifacts();
		be.attendScrumMeetings();
		be.code();
		be.doSql();
		System.out.println();
		
		System.out.println("--Creating ManualTester object--");
		ManualTester mt = new ManualTester();
		mt.salary = 100000;
		mt.getPaid();//comes from grandfather
		mt.artifacts= "Sprint Backlog";
		mt.ceremonies = "Sprint grooming, Sprint planning, Daily StandUp, Sprint Demo, Sprint Retrospective";
		mt.workOnArtifacts();
		mt.attendScrumMeetings();
		mt.test();
		mt.testManually();
		System.out.println();
		
		System.out.println("--Creating Automation object--");
		Automation at = new Automation();
		at.salary = 100000;
		at.getPaid();//comes from grandfather
		at.artifacts= "Sprint Backlog";
		at.ceremonies = "Sprint grooming, Sprint planning, Daily StandUp, Sprint Demo, Sprint Retrospective";
		at.workOnArtifacts();
		at.attendScrumMeetings();
		at.test();
		at.codeInJava();
		System.out.println();
		
		


	}

}
