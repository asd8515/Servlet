package ServletJSP;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

	public class WelcomeServlet extends HttpServlet {
		
		public void doGet(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException{
			
			response.setContentType("text/html"); 	//html File�� �����°��� �˷��ִ� Line
			PrintWriter out = response.getWriter(); //��ü �ش��ϴ°��� �� �غ� �ϴ°�
			
			String title = "Welcome To Yojulab";
			String docType ="<!docType>";
			String name ="park jun hong";
			
			
			out.print("<!DOCTYPE html>\r\n" + 		//html�� ���ִ� �۾�
					"<html>\r\n" + 
					"<head>\r\n" + 
					"<meta charset=\"UTF-8\">\r\n" +  
					"<title>Insert title here</title>\r\n" + 
					"</head>\r\n" + 
					"<body>\r\n" + 
					"<h1>"+title+"</h1>\n" +
					"<h1>"+name+"</h1>\n" +
					"</body>\r\n" + 
					"</html>"); 							
			
	}
}
	
	//���� ""�� �پ��ִ� ���� �߰������� �� �̿��Ҷ� \�� ����� ���������� ���ٰ� ���� �� �� �ִ�.
/*	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		
	}
}*/