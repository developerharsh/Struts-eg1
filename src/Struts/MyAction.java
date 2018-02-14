package Struts;

public class MyAction 
{
	private String username;
	private String userpass;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserpass() {
		return userpass;
	}
	public void setUserpass(String userpass) {
		this.userpass = userpass;
	}
	
	
	public String execute()
	{
		if(username.equals("admin") && userpass.equals("pass"))
		{
			return "success";
		}
		else
		{
			return "error";
		}
	}
}
