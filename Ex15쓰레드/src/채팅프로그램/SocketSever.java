package 채팅프로그램;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;

//(서버)소켓 쪽에서 해야할일!
//1.사용자(클라이언트)가 입력한 채팅 받는것
//2.받은 채팅을 다른 사용자들한테도 보내주는 것

public class SocketSever extends Thread {

   private ArrayList<Socket> list = new ArrayList<Socket>(); // 현재까지 연결된 사용자(클라이언트)-Socket 저장용
   private Socket socket = null; // 현재 채팅을 보내는&&받는 사용자 임시 저장공간

   // 클라이언트의 소켓 정보를 넘기면서 해당 클라이언트와 데이터 송수신 할 수 있는 소켓 생성
   public SocketSever(Socket socket) {
      this.socket=socket;
      list.add(socket);
   }
   
   public void run() {
      //클라이언트가 접속하면 해당 클라리언트 PC ip주소를 출력
      System.out.println(socket.getInetAddress()+"님이 연결됨!");
      
      //클라리언트가 보낸 메시지 읽어들이는 통로(스트림)
      try {
         InputStream input = socket.getInputStream();
         BufferedReader reader = new BufferedReader(new InputStreamReader(input));
         
         //서버가 클라리언트에게 메시지를 보내는 통로(스트림)
         OutputStream out = socket.getOutputStream();
         PrintWriter writer = new PrintWriter(out, true);
         
         writer.println("사용할 닉네임 >> ");
         //클라이언트가 최초로 입력한 값은 -> 닉네임
         //그다음부터 입력한 값은 채팅 내용이므로 다른 사용자에게 출력!
         
         String nick = null; //클라이언트가 작성한 닉네임 저장
         String readValue;   //클라이언트가 입력한 값을 저장
         boolean check = false; //false - 사용자가 닉네임 입력하기 전
                                //true - 사용자가 닉네임 입력한 후
         
         
               
               while((readValue = reader.readLine())!=null) {
                  if(!check) { //닉네임 입력하기 전
                     nick = readValue;//사용자가 입력한 내용 nick에 저장
                     check = true;//다음 입력 내용부터는 채팅 내용으로 출력하도록~!
                     writer.println(nick+"님이 성공적으로 점속되었습니다~!");
                     
                  }else { //닉네임 입력한 후
                     for(Socket s:list) { //현재 서버와 연결된 모든 클라이언트(Socket) 확인
                    	 //서버와 연결된 모든 클라이언트와 데이터 송수신할 수 있는 스트림을 가각 만듦
                    	 out = s.getOutputStream();
                    	 writer = new PrintWriter(out, true);
                    	 //채팅입력한 클라이언트의 닉네임 : 입력한 채팅 내용 -> 출력
                    	 writer.println(nick + " : "+readValue);
                     }
                  }
                  
               }
         
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
   }

}
