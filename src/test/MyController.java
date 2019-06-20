package test;

public class MyController {

	private MyService service;
	
	public MyController(MyService myService)
	{
		this.service = myService;
	}
	public void login() 
	{
		System.out.println("MyController login........");
		service.serviceLogin();
	}
}
