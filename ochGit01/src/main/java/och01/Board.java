package och01;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class board
 */
@WebServlet("/Board") //주소역할
public class Board extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Board() {
        super();
        // TODO Auto-generated constructor stub
        
        
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		System.out.println("doGet");
		//parameter 받기
		String title = request.getParameter("title");
		String writer = request.getParameter("writer");
		String content = request.getParameter("content");
		
		System.out.println("title->"+title);
		System.out.println("writer->"+writer);
		System.out.println("content->"+content);
		
		// 작성일 반영
		 Date date = new Date();
		
		 
		//Encoding 적용
		//request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		//공식 사용자 브라우저에 보여주는 객체
		PrintWriter out= response.getWriter();
		out.println("<html><body>");
		out.println("<h1>게시판</h1>");
		out.printf("<td>제목 : %s</td>",title+"<p>");
		out.printf("<td>작성자 : %s</td>",writer+"<p>");
		out.printf("<p>작성일 : %s</p>",date);
		out.printf("<td>내용 : %s</td>",content+"<p>");
		out.println("</body></hmtl>");
		out.close();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doPost");
		
		String title = request.getParameter("title");
		String writer = request.getParameter("writer");
		String content = request.getParameter("content");
		
		System.out.println("title->"+title);
		System.out.println("writer->"+writer);
		System.out.println("content->"+content);
		
		// 작성일 반영
		Date date = new Date();
		
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h1>게시판</h1>");
		out.printf("<td>제목 : "+ title+"<p>");
		out.printf("<td>작성자 :"+writer+"<p>");
		out.printf("작성일 : "+ date+"<p>");
		out.printf("내용 : "+ content+"<p>");
		out.println("</body></hmtl>");
		out.close();
	
		
	}

}
