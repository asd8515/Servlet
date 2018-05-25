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
			
			response.setContentType("text/html"); 	//html File로 보내는것을 알려주는 Line
			PrintWriter out = response.getWriter(); //객체 해당하는것을 쓸 준비를 하는것
			
			String title = "Welcome To Yojulab";
			String docType ="<!docType>";
			String name ="park jun hong";
			
			
			out.print("<!DOCTYPE html>\r\n" + 		//html로 써주는 작업
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
	
	//기존 ""이 붙어있는 것이 추가적으로 꼭 이용할때 \를 써야지 내부적으로 쓴다고 인지 할 수 있다.
/*	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		
	}
}*/